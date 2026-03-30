// Imports
import java.util.Scanner; // for reading user input
import java.util.ArrayList; //for using Array List (eg. lists)
import java.util.Arrays;


public class Sandwich {
    // Class Variables
    public static final boolean IS_GOOD = true;
    private String bread;
    private String[] meat;
    private String sauce;
    private String topping;
    private int size;

    // Sandwich constuctor
    public Sandwich(String bread, String[] meat, String sauce, String topping, int size) {
        this.bread = bread;
        this.meat = new String[meat.length];
        this.sauce = sauce;
        this.topping = topping;
        this.size = size;

    }

    /* Setters */

    // Setter for bread
    public void setBread(String str) {
        bread = str;
    }
    // Setter for meat
    public void setMeat(String[] lst) {
        meat = lst;
    }
    // Setter for sauce
    public void setSauce(String str) {
        sauce = str;
    }
    // Setter for topping
    public void setTopping(String str) {
        topping = str;
    }
    // Setter for size
    public void setSize(int intgr) {
        size = intgr;
    }

    /* Getters */

    // Getter for bread
    public String getBread() {
        return bread;
    }
    // Getter for meat
    public String[] getMeat() {
        return meat;
    }
    // Getter for sauce
    public String getSauce() {
        return sauce;
    }
    // Getter for topping
    public String getTopping() {
        return topping;
    }
    // Getter for size
    public int getSize() {
        return size;
    }

    // Switch for size to string for set sizes
    public String sizeToString() {
        switch (size){
            case 3:
                return "Small";
            case 6:
                return "Med";
            case 12:
                return "Large";
            default:
                return "Med";
        }
    }

    // Testing
    public static String arrayToString(String[] str) {
        return Arrays.toString(str);
    }

    // User input
    

    // Overide toString
    @Override
    public String toString() {
        return "Sandwich[bread=" + bread + ", meat=" + Arrays.toString(meat) + ", sauce=" + sauce +
            ", topping=" + topping + ", size=" + size + "]";
}


    // public static main method
    public static void main(String [] args) {
        System.out.println("Sandwich Class");
        Sandwich sandwich1 = new Sandwich("White", new String[] {"Ham", "Beef"}, "Mustard", "Lettuce", 12);
        System.out.println(sandwich1);
        sandwich1.setBread("Wheat");
        System.out.println(sandwich1);
        System.out.println(sandwich1.getBread());
        System.out.println(sandwich1.getSauce());
        System.out.println(sandwich1.sizeToString());
        sandwich1.setMeat(new String[] {"ham", "beef"});
        System.out.println(sandwich1);
        System.out.println(arrayToString(sandwich1.getMeat()));
    }
}