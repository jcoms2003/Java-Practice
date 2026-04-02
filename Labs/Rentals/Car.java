public class Car extends Vehicle{
    // Private variables
    private boolean isConvertable;
    private int numDoors;

    // Constructor
    public Car(String make, String model, int year, double dailyRate, boolean isRented , String engineType, boolean isConvertable, int numDoors) {
        super(make, model, year, dailyRate, isRented, engineType);
        this.isConvertable = isConvertable;
        this.numDoors = numDoors;
    }
    
    // Getters
    public boolean getIsConvertable() {
        return isConvertable;
    }
    public int getNumDoors() {
        return numDoors;
    }

    // Setters
    public void setIsConvertable(boolean b) {
        isConvertable = b;
    }
    public void setNumDoors(int n) {
        numDoors = n;
    }
    
    // Override to string
    @Override
    public String toString() {
        return super.toString() + "(isConvertable: " + isConvertable + ") " +  "(numDoors: " + numDoors + ")";
    }
    // Main method
    public static void main(String [] args) {
        
        testing();
    }
}