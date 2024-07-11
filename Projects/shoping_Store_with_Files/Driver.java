package shoping_Store_with_Files;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Driver {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Store s = new Store();
        s.addDefaultProducts();

        User user = new User();

        File productsFile = new File("C:\\Users\\ABC\\Desktop\\FILE_HANDELING\\products.txt");
        File cartFile = new File("C:\\Users\\ABC\\Desktop\\FILE_HANDELING\\cart.txt");

        writeFile(productsFile, s.products);

        boolean exit = false;

        while (!exit) {
            System.out.println("Welcome to the Shop");

            ArrayList<String> products = readFile(productsFile);

            if (products != null) {
                System.out.println("Shop products: " + products.toString());
            } else {
                System.out.println("Failed to read products from file.");
            }

            System.out.println("Want to shop something? y/n");
            char ch = sc.next().charAt(0);

            if (ch == 'y') {
                System.out.println("How many products?");
                int count = sc.nextInt();
                int loop = 0;
                while (loop < count) {
                    System.out.println("Enter product name:");
                    String pname = sc.next();
                    String tobeadded = null;
                    for (String pro : products) {
                        if (pro.equals(pname)) {
                            tobeadded = pro;
                            break; 
                        }
                    }
                    if (tobeadded != null) {
                        products.remove(tobeadded);
                        user.usercart.add(tobeadded);
                        System.out.println(pname + " added to cart.");
                    } else {
                        if(products.size()!=0) {
                        	System.out.println(pname + " not found.");
                        }
                        else {
                        	System.out.println("Shop is empty noww");
                        }
                    }
                    loop++;
                }
                
                
                writeFile(productsFile, products);
                writeFile(cartFile, user.usercart);
                
                System.out.println("Updated product list:");
                displayFileContents(productsFile);
                System.out.println("Updated cart contents:");
                displayFileContents(cartFile);
            } else if (ch == 'n') {
                System.out.println("Thank you for visiting the shop!");
            } else {
                System.out.println("Invalid input, please try again.");
            }

            System.out.println("Do you want to continue shopping? y/n");
        }

        sc.close();
    }

    private static void writeFile(File file, ArrayList<String> list) {
        try {
            file.createNewFile();
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream out = new ObjectOutputStream(fos);
            out.writeObject(list);
            System.out.println("Object written to the file successfully");
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static ArrayList<String> readFile(File file) {
        ArrayList<String> list = null;
        try {
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
            list = (ArrayList<String>) ois.readObject();
            ois.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return list;
    }

    private static void displayFileContents(File file) {
        ArrayList<String> list = readFile(file);
        if (list != null) {
            System.out.println(list.toString());
        } else {
            System.out.println("Failed to read from file.");
        }
    }
}
