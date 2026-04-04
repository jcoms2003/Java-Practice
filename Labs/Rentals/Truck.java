public class Truck extends Vehicle {
    // Private variables
    private String driveType;
    private String fuelType;

    // Constuctor
    public Truck(String make, String model, int year, double dailyRate, boolean isRented, String engineType, String driveType, String fuelType) {
        super(make, model, year, dailyRate, isRented, engineType);
        this.driveType = driveType;
        this.fuelType = fuelType;
    }

    // Getters
    public String getDriveType() {
        return driveType;
    }
    public String getFuelType() {
        return fuelType;
    }

    // Setters
    public void setDriveType(String s) {
        driveType = s;
    }
    public void setFuelType(String s) {
        fuelType = s;
    }

    public static void main(String [] args) {
        System.out.println("Hello");
    }
}