package armour;

public class Chainmail extends Armour
{
    private int minPoints = 70;
    private int maxPoints = 100;
    private int minDexCost = 8;
    private int maxDexCost = 10;
    private String type = "Chainmail";

    public Chainmail()
    {
        super();
        super.SetArmourPoints(randNum.nextInt(maxPoints) + minPoints);
        super.SetDexCost(randNum.nextInt(maxDexCost) + minDexCost);
        super.SetType(type);
    }
}