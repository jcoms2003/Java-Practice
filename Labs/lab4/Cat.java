public class Cat extends Pets {
    private String badName;
    public Cat(String name, String breed, String badName){
      super(name, breed);
      this.badName = badName;
    }
    @Override
    public String makeNoise() {
      return "meow";
    }

    public void setBadName(String s) {
      badName = s;
    }
    public String getName() {
      return name + " aka " + badName;
    }

    public String getName(String s) {
      return name + " aka " + s;
    }
    
    public static void main(String[] args){
      Cat Gyorik = new Cat("Gyorik", "russian blue", "Wretched Boy");
      System.out.println(Gyorik.getName());   // this should return "Gyorik aka Wretched Boy"
      System.out.println(Gyorik.getName("Mr. Man")); // this should return "Gyorik aka Mr. Man"
    }
}
