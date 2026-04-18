public class Knight extends MOB {
    private Fortune activeFortune;
    protected final int ID;
    protected int xp;

    // Constructor 
    public Knight(int, String, int, int, int, DiceType, int) {

    }

    // Adding XP
    public void addXP(int i) {
        xp += i;
    }

    // Getters
    public int getArmor() {
        return armor;
    }
    public DiceType getDamageDie() {
        return damageDie;
    } 
    public int getHitModifier() {
        return hitModifier;
    }
    public Integer getID() {
        return ID;
    }
    public int getMaxHP() {
        return maxHP;
    }
    public int getXP() {
        return xp;
    }
    
    // Setter and Getter for ACTIVE FORTUNE
    public Fortune getActiveFortune() {
        return null; 
        // Figure this out Still!!!
    }
    public void setActiveFortune(Fortune f) {
        if(activeFortune ) {
            return activeFortune;
        }
    }

    // To CSV and String methods
    public String toCSV() {
        return null;
        // Figure this out!!!!
    }
    public String toString() {
        return null;
        // Figure this out!!!!
    }

    public static void main(String[] args) {
        
    }
    
}