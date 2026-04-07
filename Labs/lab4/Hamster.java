public class Hamster extends Pets {
    public Hamster(String name, String breed){
        super(name, breed);
    }

    @Override
    public String makeNoise() {
        return "Squeak";
    }
    
    //This method should take in an array of strings. If any of the strings is "tired", return false. Otherwise, return true.
    public boolean wheelRun(String[] run) {
        for (int i = 0; i < run.length; i++) {
            if ("tired".equals(run[i])) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){

    }
}
