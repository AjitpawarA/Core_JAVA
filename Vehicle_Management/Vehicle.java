package Vehicle_Management;
class Vehicle {
    String make;
    String model;
    int year;
    int numberOfWheels;

    public Vehicle(String make, String model, int year, int numberOfWheels) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.numberOfWheels = numberOfWheels;
    }

    public void start() {
        System.out.println("Vehicle started");
    }

    public void stop() {
        System.out.println("Vehicle stopped");
    }

    public void accelerate() {
        System.out.println("Vehicle accelerating");
    }
}
