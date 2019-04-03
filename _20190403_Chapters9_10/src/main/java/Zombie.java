public class Zombie {
    private String name;   //encapsulation
    private int health;
    private String[] nicknames = new String[5];
    static int immobileLevel = 2;


    public Zombie(String name, int health) {
        this.name = name;
        this.health = health;
    }

    @Override
    public String toString() {
        return "Zombie{" +
                "name='" + name + '\'' +
                ", health=" + health +
                '}' + "Immobility: " + immobileLevel;
    }

    public int getImmobilityLevel(){
        return immobileLevel;
    }

    public static void doSomething(){
        //this.health--;
        immobileLevel = 1;
    }


}

