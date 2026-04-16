public class Dog extends Pets {
    public Dog(String name, String breed){
      super(name, breed);
    }
  
    @Override
    public String makeNoise() {
      return "bark";
    }
  
    //This function should take in a number, multiply it by seven, and then return the appropriate string depending on if the number is even or odd
    public String playFetch(int num){
      int result = num * 7;
      if ((result % 2) == 0) {
        return "returned the ball";
      } else {
        return "won't give it back";
      }
      
    }
  
    public static void main(String[] args){
      // System.out.println(playFetch(1));
      // System.out.println(playFetch(2));
    }
}
