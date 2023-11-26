package examples;

public class Monster {
    int eyes;
    int hands;
    int legs;
    
    public Monster(int eyes, int hands, int legs) {
        this.eyes = eyes;
        this.hands = hands;
        this.legs = legs;
    }
    
    public Monster(int all) {
        this(all, all ,all);
    }
    
    public Monster() {
        this(2);
    }
    
    public void monsterInfo() {
        System.out.println( "Monster have " + eyes + " eyes, " + hands + " hands," + " and "  + legs + " legs");
    }
    
    public static void voice(int count, String input) {
        for(int i = 0; i < count; i++){
            System.out.println(input);
        }
    }
    
    static void voice(int count){
        voice(count, "Ррррр");
    }
    
    static void voice() {
        voice(1);
    }
}
