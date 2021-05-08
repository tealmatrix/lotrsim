package warrior;

public class Shagrat extends Warrior {
    private int minHealth = 70;
    private int highHealth = 170;
    private int minDexterity = 30;
    private int highDexterity = 50;
    private int minStrength = 120;
    private int highStrength = 180;
    private int minCriticalStrike = 5;
    private int highCriticalStrike = 10;
    private int minIntelligence = 1;
    private int highIntelligence = 2;
    private String type = "Orc";

    public Shagrat() {
        super();
        super.SetHealth(randNum.nextInt(highHealth) + minHealth); // 50 - 149
        super.SetDexterity(randNum.nextInt(highDexterity) + minDexterity); // 50 - 149
        super.SetStrength(randNum.nextInt(highStrength) + minStrength); // 50 - 149
        super.SetCriticalStrike(randNum.nextInt(highCriticalStrike) + minCriticalStrike); // 5-10
        super.SetIntelligence(randNum.nextInt(highIntelligence) + minIntelligence);
        super.SetType(type);
    }
}