public class Sandwich {
    // Class Variables
    public static final boolean IS_GOOD = true;
    private String bread;
    private String meat;
    private String sauce;
    private String topping;
    private int size;

    // Sandwich constuctor
    public Sandwich(String bread, String meat, String sauce, String topping, int size) {
        this.bread = bread;
        this.meat = meat;
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
    public void setMeat(String str) {
        meat = str;
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
    public String getMeat() {
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

    // Overide toString
    @Override
    public String toString() {
        return "Sandwich[bread=" + bread + ", meat=" + meat + ", sauce=" + sauce +
            ", topping=" + topping + ", size=" + size + "]";
}


    // public static main method
    public static void main(String [] args) {
        System.out.println("Sandwich Class");
        Sandwich sandwich1 = new Sandwich("White", "Ham", "Mustard", "Lettuce", 12);
        System.out.println(sandwich1);
        sandwich1.setBread("Wheat");
        System.out.println(sandwich1);
        System.out.println(sandwich1.getBread());
        System.out.println(sandwich1.getSauce());
    }
}