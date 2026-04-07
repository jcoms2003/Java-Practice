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
    
    public static void main(String[] args){

    }
}
