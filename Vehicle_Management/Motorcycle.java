package Vehicle_Management;
class Motorcycle extends Vehicle {
    boolean hasSidecar;

    public Motorcycle(String make, String model, int year, int numberOfWheels, boolean hasSidecar) {
        super(make, model, year, numberOfWheels);
        this.hasSidecar = hasSidecar;
    }

    public void attachSidecar() {
        if (!hasSidecar) {
            hasSidecar = true;
            System.out.println("Sidecar attached");
        } else {
            System.out.println("Sidecar already attached");
        }
    }
}
