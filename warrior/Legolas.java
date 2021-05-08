package warrior;

public class Legolas extends Warrior {
    private int minHealth = 30;
    private int highHealth = 70;
    private int minDexterity = 70;
    private int highDexterity = 130;
    private int minStrength = 50;
    private int highStrength = 100;
    private int minCriticalStrike = 1;
    private int highCriticalStrike = 2;
    private int minIntelligence = 50;
    private int highIntelligence = 100;
    private String type = "Elf";

    public Legolas() {
        super();
        super.SetHealth(randNum.nextInt(highHealth) + minHealth); // 50 - 149
        super.SetDexterity(randNum.nextInt(highDexterity) + minDexterity); // 50 - 149
        super.SetStrength(randNum.nextInt(highStrength) + minStrength); // 50 - 149
        super.SetCriticalStrike(randNum.nextInt(highCriticalStrike) + minCriticalStrike); // 1-2
        super.SetIntelligence(randNum.nextInt(highIntelligence) + minIntelligence);
        super.SetType(type);
    }
}