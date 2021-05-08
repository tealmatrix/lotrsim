package warrior;

public class Aragorn extends Warrior {
    private int minHealth = 50;
    private int highHealth = 100;
    private int minDexterity = 50;
    private int highDexterity = 100;
    private int minStrength = 50;
    private int highStrength = 100;
    private int minCriticalStrike = 3;
    private int highCriticalStrike = 5;
    private int minIntelligence = 30;
    private int highIntelligence = 50;
    private String type = "Human";

    public Aragorn() {
        super();
        super.SetHealth(randNum.nextInt(highHealth) + minHealth); // 50 - 149
        super.SetDexterity(randNum.nextInt(highDexterity) + minDexterity); // 50 - 149
        super.SetStrength(randNum.nextInt(highStrength) + minStrength); // 50 - 149
        super.SetCriticalStrike(randNum.nextInt(highCriticalStrike) + minCriticalStrike); // 3-5
        super.SetIntelligence(randNum.nextInt(highIntelligence) + minIntelligence);
        super.SetType(type);
    }

    public Aragorn(int health, int dexterity, int strength) {
        super();
        super.SetHealth(health);
        super.SetDexterity(dexterity);
        super.SetStrength(strength);
    }
}