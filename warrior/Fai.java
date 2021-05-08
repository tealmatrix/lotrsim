package warrior;

public class Fai extends Warrior {

    private int minHealth = 150;
    private int highHealth = 270;
    private int minDexterity = 95;
    private int highDexterity = 100;
    private int minStrength = 10;
    private int highStrength = 19;
    private int minCriticalStrike = 1;
    private int highCriticalStrike = 5;
    private int minIntelligence = 50;
    private int highIntelligence = 100;
    private String type = "Fai";

    public Fai() {
        super();
        super.SetHealth(randNum.nextInt(highHealth) + minHealth); // 50 - 149
        super.SetDexterity(randNum.nextInt(highDexterity) + minDexterity); // 50 - 149
        super.SetStrength(randNum.nextInt(highStrength) + minStrength); // 50 - 149
        super.SetCriticalStrike(randNum.nextInt(highCriticalStrike) + minCriticalStrike); // 1-2
        super.SetIntelligence(randNum.nextInt(highIntelligence) + minIntelligence);
        super.SetType(type);
    }
}
