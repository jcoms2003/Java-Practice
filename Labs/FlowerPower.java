public class FlowerPower {
    private int shape;
    private String color;
    double size;
    String name;

    public FlowerPower(String name, int shape, String color, double size){
        this.name = name;
        this.shape = shape;
        this.color = color;
        this.size = size;
    }
    public String getName(){ return name; }

    public double getSize(){ return size; }

    public String getColor() { return color;}

    public String getShape(){
        if (shape == 1) {
            return "round";
        }
        else if (shape == 2) {
            return "oval";
        }
        else if (shape == 3) {
            return "pointed";
        }
        else {
            return "unusual";
        }
    }

    public void setName(String name) { this.name = name; }

    public void setSize(double size) { this.size = size; }

    public void setColor(String color) { this.color = color; }

    public void setShape(int shape) { this.shape = shape; }
    
    public String flowerComment(){
        if (getSize() > 6 || getColor() == "green") {
            return "What a weird flower!";
        }
        else{
            return "How pretty!";
        }

    }

    public void printInfo(){
        String temp = "The " + getName() + " flower has a " + getColor() + " color, a/an " + getShape() + " petal shape, and a size of " + getSize() + "cm.\n" + flowerComment();
        System.out.println(temp);
    }

    public static void main(String [] args){
        FlowerPower daisy = new FlowerPower("daisy", 2, "white", 2.5);
        FlowerPower witherRose = new FlowerPower("wither rose", 17, "black", 6.52);
        System.out.println("TESTING: " + daisy.flowerComment());
        System.out.println("TESTING: " + witherRose.flowerComment());
        daisy.printInfo();
        witherRose.printInfo();

    }
}
