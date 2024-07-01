package Vehicle_Management;
class Car extends Vehicle {
    int numberOfDoors;
    boolean hasSunroof;

    public Car(String make, String model, int year, int numberOfWheels, int numberOfDoors, boolean hasSunroof) {
        super(make, model, year, numberOfWheels);
        this.numberOfDoors = numberOfDoors;
        this.hasSunroof = hasSunroof;
    }

    public void openSunroof() {
        if (hasSunroof) {
            System.out.println("Opening sunroof");
        } else {
            System.out.println("No sunroof available");
        }
    }
}
