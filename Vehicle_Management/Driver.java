package Vehicle_Management;
import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Vehicle Management System!");
        System.out.println("Please select the type of vehicle you want to manage:");
        System.out.println("1. Car");
        System.out.println("2. Truck");
        System.out.println("3. Motorcycle");

        int vehicleType = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        Vehicle vehicle = null;

        switch (vehicleType) {
            case 1:
                vehicle = createCar(scanner);
                break;
            case 2:
                vehicle = createTruck(scanner);
                break;
            case 3:
                vehicle = createMotorcycle(scanner);
                break;
            default:
                System.out.println("Invalid choice. Exiting.");
                return;
        }

        manageVehicle(vehicle, scanner);
        scanner.close();
    }

    private static Car createCar(Scanner scanner) {
        System.out.println("Enter the make of the car:");
        String make = scanner.nextLine();
        System.out.println("Enter the model of the car:");
        String model = scanner.nextLine();
        System.out.println("Enter the year of the car:");
        int year = scanner.nextInt();
        System.out.println("Enter the number of wheels:");
        int numberOfWheels = scanner.nextInt();
        System.out.println("Enter the number of doors:");
        int numberOfDoors = scanner.nextInt();
        System.out.println("Does the car have a sunroof? (true/false)");
        boolean hasSunroof = scanner.nextBoolean();
        scanner.nextLine(); // Consume newline

        return new Car(make, model, year, numberOfWheels, numberOfDoors, hasSunroof);
    }

    private static Truck createTruck(Scanner scanner) {
        System.out.println("Enter the make of the truck:");
        String make = scanner.nextLine();
        System.out.println("Enter the model of the truck:");
        String model = scanner.nextLine();
        System.out.println("Enter the year of the truck:");
        int year = scanner.nextInt();
        System.out.println("Enter the number of wheels:");
        int numberOfWheels = scanner.nextInt();
        System.out.println("Enter the payload capacity:");
        int payloadCapacity = scanner.nextInt();
        System.out.println("Enter the number of axles:");
        int numberOfAxles = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        return new Truck(make, model, year, numberOfWheels, payloadCapacity, numberOfAxles);
    }

    private static Motorcycle createMotorcycle(Scanner scanner) {
        System.out.println("Enter the make of the motorcycle:");
        String make = scanner.nextLine();
        System.out.println("Enter the model of the motorcycle:");
        String model = scanner.nextLine();
        System.out.println("Enter the year of the motorcycle:");
        int year = scanner.nextInt();
        System.out.println("Enter the number of wheels:");
        int numberOfWheels = scanner.nextInt();
        System.out.println("Does the motorcycle have a sidecar? (true/false)");
        boolean hasSidecar = scanner.nextBoolean();
        scanner.nextLine(); // Consume newline

        return new Motorcycle(make, model, year, numberOfWheels, hasSidecar);
    }

    private static void manageVehicle(Vehicle vehicle, Scanner scanner) {
        boolean exit = false;

        while (!exit) {
            System.out.println("What would you like to do?");
            System.out.println("1. Start the vehicle");
            System.out.println("2. Stop the vehicle");
            System.out.println("3. Accelerate the vehicle");
            if (vehicle instanceof Car) {
                System.out.println("4. Open sunroof");
            } else if (vehicle instanceof Truck) {
                System.out.println("4. Load cargo");
            } else if (vehicle instanceof Motorcycle) {
                System.out.println("4. Attach sidecar");
            }
            System.out.println("5. Exit");

            int action = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (action) {
                case 1:
                    vehicle.start();
                    break;
                case 2:
                    vehicle.stop();
                    break;
                case 3:
                    vehicle.accelerate();
                    break;
                case 4:
                    if (vehicle instanceof Car) {
                        ((Car) vehicle).openSunroof();
                    } else if (vehicle instanceof Truck) {
                        System.out.println("Enter the weight of the cargo:");
                        int weight = scanner.nextInt();
                        scanner.nextLine(); // Consume newline
                        ((Truck) vehicle).loadCargo(weight);
                    } else if (vehicle instanceof Motorcycle) {
                        ((Motorcycle) vehicle).attachSidecar();
                    }
                    break;
                case 5:
                    exit = true;
                    System.out.println("Exiting Vehicle Management System.");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
