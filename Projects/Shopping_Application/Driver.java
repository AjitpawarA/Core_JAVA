package Shopping_Application;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Driver {
    public static ArrayList createnewarraylist() {
        return new ArrayList<Product>();
    }

    public static void start(Scanner sc) throws InputMismatchException {
        boolean exit = true;
        Store ss = null;

        while (exit) {
            System.out.println("welcome to MYCART");
            System.out.println("Want to login as Store_Owner or User_Customer:");
            System.out.println("1: Use_Customer");
            System.out.println("2: Store_Owner");
            System.out.println("0: Exit");

            int ch = 9;

            try {
                if (sc.hasNextInt()) {
                    ch = sc.nextInt();

                    switch (ch) {
                        case 1: {
                            if (ss == null || ss.users.size() == 0) {
                                System.out.println("No user in the store at the moment ");
                                System.out.println("Create your account ");
                                User.create_user_account(sc, ss != null ? ss.users : new ArrayList<>());
                            } else {
                                User.login_user_account(sc, ss);
                            }
                        }
                        break;
                        case 2: {
                            boolean exit1 = true;

                            while (exit1) {
                                System.out.println("------Create Your Store-----");
                                System.out.println("Enter Owner name:");
                                String name = sc.next();
                                System.out.println("Enter Phone:");
                                long phone = sc.nextLong();
                                ArrayList prod = createnewarraylist();
                                ArrayList users = createnewarraylist();

                                Store s = new Store(name, phone, prod, users);
                                ss = s;

                                boolean a = true;

                                if (s != null) {
                                    while (a) {
                                        System.out.println("Choose correct option:");
                                        System.out.println("1: add product to store");
                                        System.out.println("2:Show all products");
                                        System.out.println("3:Check availability by name ");
                                        System.out.println("4:Remove product from stock");
                                        System.out.println("0: Exit");

                                        int choice = sc.nextInt();

                                        switch (choice) {
                                            case 1: {
                                                System.out.println("Custome or Default?");
                                                System.out.println("1:Custome");
                                                System.out.println("2:Default");
                                                int b = sc.nextInt();
                                                switch (b) {
                                                    case 1: {
                                                        System.out.println("How many products u want to add?");
                                                        int p_count = sc.nextInt();
                                                        for (int i = 0; i < p_count; i++) {
                                                            s.addcustome_prod(prod, sc);
                                                        }
                                                    }
                                                    break;
                                                    case 2: {
                                                        s.adddefaulbooks(prod);
                                                    }
                                                    break;
                                                    default:
                                                        System.out.println("Wrong choice...");
                                                }
                                            }
                                            break;
                                            case 2: {
                                                System.out.println("---------All products list ------");
                                                for (Object object : prod) {
                                                    Product p = (Product) object;
                                                    System.out.println(p);
                                                }
                                            }
                                            break;
                                            case 3: {
                                                s.check_Availability(prod, sc);
                                            }
                                            break;
                                            case 4: {
                                                s.remove_from_stock(prod, sc);
                                            }
                                            break;
                                            case 0: {
                                                a = false;
                                                exit1 = false;
                                            }
                                            break;
                                            default: {
                                                System.out.println("Sorry Wrong choise please choose correct option");
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        break;
                        case 0: {
                            exit = false;
                        }
                        break;
                        default: {
                            System.out.println("------Wrong choice----");
                        }
                    }
                } else {
                    sc.next(); // Consume the invalid input
                    throw new InputMismatchException("Invalid input. Please enter a valid number.");
                }
            } catch (InputMismatchException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            start(sc);
    }
}
