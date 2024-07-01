package Library_ArrayList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        System.out.println("Welcome to our library:");
        Scanner sc = new Scanner(System.in);

        ArrayList<Book> lib = null;
        Customer cust = null;

        boolean exit = false;
        while (!exit) {
            System.out.println("Choose the correct option:");
            System.out.println("1: create new library");
            System.out.println("2: add book to the library");
            System.out.println("3: remove book from library");
            System.out.println("4: get book info");
            System.out.println("5: get all book details");
            System.out.println("6: sort books by price");
            System.out.println("7: Count the total books");
            System.out.println("8: issue book");
            System.out.println("20: exit");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1: {
                    lib = Library.createlib();
                    System.out.println("Your Library is created");
                    System.out.println("Want to add book? y/n");
                    char c = sc.next().charAt(0);
                    sc.nextLine(); 
                    if (c == 'y') {
                        System.out.println("Want to add your own books? type - y ..... or add default set of books? type - n ");
                        char p = sc.next().charAt(0);
                        sc.nextLine(); 

                        if (p == 'n') {
                            lib.add(new Book("Book1", 100, "Author1", 200));
                            lib.add(new Book("Book2", 150, "Author2", 250));
                            lib.add(new Book("Book3", 200, "Author3", 300));
                            lib.add(new Book("Book4", 250, "Author4", 350));
                            lib.add(new Book("Book5", 300, "Author5", 400));
                            lib.add(new Book("Book6", 350, "Author6", 450));
                            lib.add(new Book("Book7", 400, "Author7", 500));
                            lib.add(new Book("Book8", 450, "Author8", 550));
                            lib.add(new Book("Book9", 500, "Author9", 600));
                            lib.add(new Book("Book10", 550, "Author10", 650));
                            System.out.println("Books added successfully");
                        } else {
                            System.out.println("How many books are there?");
                            int num = sc.nextInt();
                            sc.nextLine(); 
                            for (int i = 0; i < num; i++) {
                                System.out.println("Enter book name " + (i + 1) + ": ");
                                String name = sc.nextLine();
                                System.out.println("Enter book author name " + (i + 1) + ": ");
                                String author = sc.nextLine();
                                System.out.println("Enter book price " + (i + 1) + ":");
                                int price = sc.nextInt();
                                System.out.println("Enter number of book pages " + (i + 1) + ":");
                                int pages = sc.nextInt();
                                sc.nextLine(); // Consume the newline character
                                lib.add(new Book(name, price, author, pages));
                            }
                        }
                    }
                }
                break;

                case 2: {
                    System.out.println("Enter book name: ");
                    String name = sc.nextLine();
                    System.out.println("Enter book author name:");
                    String author = sc.nextLine();
                    System.out.println("Enter book price:");
                    int price = sc.nextInt();
                    System.out.println("Enter number of book pages:");
                    int pages = sc.nextInt();
                    sc.nextLine();
                    if (lib != null) {
                        lib.add(new Book(name, price, author, pages));
                        System.out.println("Book added successfully.");
                    } else {
                        System.out.println("Library is not created yet.");
                    }
                }
                break;

                case 3: {
                    if (lib != null) {
                        System.out.println("Which book do you want to remove?");
                        System.out.println("Enter book name:");
                        String bname = sc.nextLine();
                        Iterator<Book> iterator = lib.iterator();
                        while (iterator.hasNext()) {
                            Book book = iterator.next();
                            if (book.getName().equals(bname)) {
                                iterator.remove();
                                System.out.println("Book removed from the library.");
                            }
                        }
                    } else {
                        System.out.println("Library is not created yet.");
                    }
                }
                break;

                case 4: {
                    if (lib != null) {
                        System.out.println("Which book Info do you want?");
                        System.out.println("Enter book name:");
                        String bname = sc.nextLine();
                        for (Book book : lib) {
                            if (book.getName().equals(bname)) {
                                System.out.println("Your Book Info");
                                System.out.println(book);
                            }
                        }
                    } else {
                        System.out.println("Library is not created yet.");
                    }
                }
                break;

                case 5: {
                    if (lib != null) {
                        System.out.println("Books in the library :---");
                        for (Book book : lib) {
                            System.out.println(book);
                        }
                    } else {
                        System.out.println("Oops.....Empty Library ");
                    }
                }
                break;

                case 6: {
                    if (lib != null) {
                        lib.sort(new sortByPrice());
                        System.out.println("Books sorted by price.");
                    } else {
                        System.out.println("Library is not created yet.");
                    }
                }
                break;

                case 7: {
                    if (lib != null) {
                        System.out.println("No. of books : " + lib.size());
                    } else {
                        System.out.println("Library is not created yet.");
                    }
                }
                break;

                case 8: {
                    if (lib != null) {
                        if (cust == null) {
                            System.out.println("Create customer account");
                            System.out.println("Enter name:");
                            String name = sc.nextLine();
                            System.out.println("Enter your id :");
                            int id = sc.nextInt();
                            sc.nextLine(); 
                            cust = new Customer(name, id);
                            System.out.println("Your account created successfully...");

                            ArrayList<Book> custissuedbook = Customer.createcustissuedbook();;

                            boolean e = false;
                            while (e == false) {
                                System.out.println("Your options:");
                                System.out.println("1: issue a book");
                                System.out.println("2: show issued books");
                                System.out.println("3: remove book from your account");
                                System.out.println("10: exit");
                                int choise = sc.nextInt();
                                sc.nextLine(); 
                                switch (choise) {
                                    case 1: {
                                        System.out.println("Which book do you want to issue?");
                                        System.out.println("Enter book name:");
                                        String bname = sc.nextLine();
                                        for (Book book : lib) {
                                            if (book.getName().equals(bname)) {
                                                custissuedbook.add(book);
                                                System.out.println("Book issued successfully ....");
                                            }
                                        }
                                    }
                                    break;

                                    case 2: {
                                        if (cust == null) {
                                            System.out.println("Don't have an account create account first");
                                            System.out.println("click 1 to create account");
                                        } else {
                                            System.out.println("Issued books");
                                            for (Book book : custissuedbook) {
                                            	System.out.println(custissuedbook.size());
                                                System.out.println(book.toString());
                                            }
                                        }
                                    }
                                    break;

                                    case 3: {
                                        if (cust == null) {
                                            System.out.println("Don't have an account can't do this operation");
                                            System.out.println("click 1 to create account");
                                        } else {
                                           //remove
                                        }
                                    }
                                    break;

                                    case 10: {
                                        e = true;
                                        System.out.println("Logged out from customer account");
                                    }
                                    break;

                                    default: {
                                        System.out.println("Wrong choice");
                                    }
                                    break;
                                }
                            }
                        } else {
                            System.out.println("Customer account already exists.");
                        }
                    } else {
                        System.out.println("Library is not created yet.");
                    }
                }
                break;
                case 20: {
                    exit = true;
                    System.out.println("Bye, thanks for using our library.");
                }
                break;

                default: {
                    System.out.println("Wrong Choice");
                }
            }
        }
       
    }
}
