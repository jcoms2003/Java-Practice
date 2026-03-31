public class Drink {
    private String soda;
    private String tea;
    private String coffee;
    private int size;

    public Drink(String soda, String tea, String coffee, int size) {
        this.soda = soda;
        this.tea = tea;
        this.coffee = coffee;
        this.size = size;
    }

    // Setters
    public void setSoda(String sod) {
        soda = sod;
    }
    public void setTea(String te) {
        tea = te;
    }
    public void setCoffee(String cof) {
        coffee = cof;
    }
    public void setSize(int siz) {
        size = siz;
    }

    // Getters
    public String getSoda() {
        return soda;
    }
    public String getTea() {
        return tea;
    }
    public String getCoffee() {
        return coffee;
    }
    public String getSize() {
        switch (size){
            case 12:
                return "Small";
            case 18:
                return "Medium";
            case 24:
                return "Large";
            case 32:
                return "X-Large";
            default:
                return "Medium";
        }
    }

    public static void main(String [] args) {
        Drink drink1 = new Drink("Pepsi", "", "", 32);
        System.out.println(drink1.getSize());
    }
}
