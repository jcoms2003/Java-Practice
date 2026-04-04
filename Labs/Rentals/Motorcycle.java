public class Motorcycle extends Vehicle {
    // Private variable
    private boolean isSportsBike;

    // Constructor
    public Motorcycle(String make, String model, int year, double dailyRate, boolean isRented, String engineType, boolean isSportsBike) {
        super(make, model, year, dailyRate, isRented, engineType);
        this.isSportsBike = isSportsBike;
    }

    // Getter
    public boolean getIsSportsBike() {
        return isSportsBike;
    }

    // Setter
    public void setIsSportsBike(boolean b) {
        isSportsBike =  b;
    }

    public static void main(String [] args) {
        System.out.println("Hello");
    }
}