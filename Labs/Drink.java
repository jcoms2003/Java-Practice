public class Drink {
    private String soda;
    private String tea;
    private String coffee;
    private int size;

    public void drink(String soda, String tea, String coffee, int size) {
        this.soda = soda;
        this.tea = tea;
        this.coffee = coffee;
        this.size = size;
    }

    // Setters
    public void soda(String sodaType) {
        soda = sodaType;
    }
    public void tea(String teaType) {
        tea = teaType;
    }
    public void coffee(String coffeeType) {
        coffee = coffeeType;
    }
    public void size(String sizeType) {
        switch (size){
            case 12:
                sizeType = "Small";
            case 18:
                sizeType = "Medium";
            case 24:
                sizeType = "Large";
            case 32:
                sizeType = "X-Large";
            default:
                sizeType = "Medium";
                break;
        }
    }
    public static void main(String [] args) {

    }
}
