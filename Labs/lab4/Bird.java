public class Bird extends Pets {
    public Bird(String name, String breed){
        super(name, breed);
    }

    @Override
    public String makeNoise() {
        return "chirp";
    }

    public String makeNoise(int i) {
        if(i % 4 == 0) {
            return "squawk";
        } else if(i % 3 == 0) {
            return "tweet";
        } else if( i % 2 == 0) {
            return "chirp";
        } else { return "caw caw"; }
    }

    //this method returns "[name] ate some seeds", where [name] is the Class variable name
    public String eatSeeds(){
        return getName() + " ate some seeds";
    }

    public String eatSeeds(boolean b) {
        if(b) {
            return getName() + " ate some seeds";
        } else { return getName() + " did not eat any seeds"; }
    }

    public String eatSeeds(int i) {
        return getName() + " ate " + i + " seeds";
    }
    
    
    public static void main(String[] args){
        Bird Feathers = new Bird("Feathers", "parrot");
        System.out.println(Feathers.eatSeeds(false)); //this should return "Feathers did not eat any seeds"
        System.out.println(Feathers.eatSeeds(17)); //this should return "Feathers ate 17 seeds"
    }
}