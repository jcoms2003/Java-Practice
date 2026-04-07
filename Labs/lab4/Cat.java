public class Cat extends Pets {
    public Cat(String name, String breed){
      super(name, breed);
    }
    @Override
    public String makeNoise() {
      return "meow";
    }
    
    public static void main(String[] args){

    }
}
