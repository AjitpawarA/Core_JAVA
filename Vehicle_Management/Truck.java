package Vehicle_Management;
class Truck extends Vehicle {
    int payloadCapacity;
    int numberOfAxles;

    public Truck(String make, String model, int year, int numberOfWheels, int payloadCapacity, int numberOfAxles) {
        super(make, model, year, numberOfWheels);
        this.payloadCapacity = payloadCapacity;
        this.numberOfAxles = numberOfAxles;
    }

    public void loadCargo(int weight) {
        if (weight <= payloadCapacity) {
            System.out.println("Cargo loaded");
        } else {
            System.out.println("Exceeds payload capacity");
        }
    }
}
