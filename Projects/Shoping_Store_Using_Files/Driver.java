package Shoping_Store_Using_Files;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Driver {

	public static void write_data_to_file(File f, ArrayList<Product> list) {
		try {
			f.createNewFile();
			FileOutputStream fos = new FileOutputStream(f);
			ObjectOutputStream out = new ObjectOutputStream(fos);
			out.writeObject(list);
			System.out.println("Object written to the file successfully");
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static ArrayList<Product> read_data_from_file(File f) {
		ArrayList<Product> list = null;
		try {
			FileInputStream fis = new FileInputStream(f);
			ObjectInputStream ois = new ObjectInputStream(fis);
			list = (ArrayList<Product>) ois.readObject();
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

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		File products_file = new File("C:\\Users\\ABC\\Desktop\\SHOP\\products.txt");
		Shop dmart = new Shop();
		dmart.adddefaultproducts();
		write_data_to_file(products_file, dmart.products);

		File usercart_file = new File("C:\\Users\\ABC\\Desktop\\SHOP\\usercart.txt");
		User user = new User();

		System.out.println("Do you want to Shop ? y/n");
		char ask = sc.next().charAt(0);

		if (ask == 'y') {
			boolean exit = true;

			while (exit) {
				System.out.println("Choose correct option");
				System.out.println("1: See all available products");
				System.out.println("2: shop by name");
				System.out.println("3: check availability");
				System.out.println("4: see my cart");
				System.out.println("0: exit");

				int choise = sc.nextInt();

				switch (choise) {
				case 1: {
					ArrayList<Product> list = read_data_from_file(products_file);
					System.out.println("-------------------------------------------");
					System.out.printf("| %-20s | %-10s | %-5s |\n", "Name", "Price", "Qty");
					System.out.println("-------------------------------------------");
					for (Product product : list) {
						System.out.printf("| %-20s | %-10.2f | %-5d |\n", product.getPro_name(),
								(double) product.getPrice(), product.getQuantity());
						System.out.println("-----------------------------------------");
					}
				}
					break;

				case 2: {
				    ArrayList<Product> list = read_data_from_file(products_file);
				    System.out.println("How many products?");
				    int no_of_products = sc.nextInt();
				    int count = 1;
				    while (count <= no_of_products) {
				        Product tobeadded = null;
				        System.out.println("Enter product name");
				        String pname = sc.next();

				        System.out.println("Enter quantity:");
				        int quantity = sc.nextInt();

				        boolean productFound = false;
				        for (Product product : list) {
				            if (product.getPro_name().equalsIgnoreCase(pname)) {
				                productFound = true;
				                if (product.getQuantity() >= quantity) {
				                    tobeadded = new Product(product.getPro_name(), product.getPrice(), quantity);
				                    product.setQuantity(product.getQuantity() - quantity);
				                    user.usercart.add(tobeadded);
				                    System.out.println("Product added to the cart");
				                } else {
				                    System.out.println("Available quantity is not enough. Available: " + product.getQuantity());
				                }
				                break;
				            }
				        }
				        if (!productFound) {
				            System.out.println("Product not found in the shop");
				        }
				        count++;
				    }
				    write_data_to_file(products_file, list);
				    write_data_to_file(usercart_file, user.usercart);
				}
				break;

				case 3: {
					ArrayList<Product> list = read_data_from_file(products_file);
					Product.checkavailability(list, sc);
				}
					break;

				case 4: {
					ArrayList<Product> usercart = read_data_from_file(usercart_file);
					for (Product product : usercart) {
						System.out.println("Name: "+product.getPro_name()+ " Price: "+ product.getPrice() +" Qut: "+product.getQuantity());
					}
				}
					break;
				case 0: {
					System.out.println("Thank u ....");
					exit = false;

				}
				default: {
					System.out.println("oops , Wrong choise");
				}
				}

			}
		} else {
			System.out.println("Thankk you .....");
		}

	}
}
