
// Vehicle class
public class Vehicle {
    // Private Variables
    private String make;
    private String model;
    private int year;
    private double dailyRate;
    private boolean isRented;

    // Vehicle constructor
    public Vehicle(String make, String model, int year, double dailyRate, boolean isRented) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.dailyRate = dailyRate;
        this.isRented = isRented;
    }
    
    // Getters
    public String getMake() {
        return make;
    }
    public String getModel() {
        return model;
    }
    public int getYear() {
        return year;
    }
    public double getDailyRate() {
        return dailyRate;
    }
    public boolean getIsRented() {
        return isRented;
    }

    // Setters
    public void setMake(String m) {
        make = m;
    }
    public void setModel(String m) {
        model = m;
    }
    public void setYear(int y) {
        year = y;
    }
    public void setDailyRate(double r) {
        dailyRate = r;
    }
    public void setIsRented(boolean b) {
        isRented = b;
    }

    // Override to string
    @Override
    public String toString() {
        return "Vic: " + make + " " + model + " " + year + " " + dailyRate + " " + isRented;
    }

    // Testing method
    public static void testing() {
        Vehicle vic1 = new Vehicle("Chevy", "Cruze", 2011, 95.0, false);
        vic1.setDailyRate(55.0);
        System.out.println(vic1);
    }

    // Main method
    public static void main(String [] args) {
        testing();
    }
}


