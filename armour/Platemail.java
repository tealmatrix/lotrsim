package armour;

public class Platemail extends Armour
{
    private int minPoints = 120;
    private int maxPoints = 190;
    private int minDexCost = 12;
    private int maxDexCost = 18;
    private String type = "Platemail";

    public Platemail()
    {
        super();
        super.SetArmourPoints(randNum.nextInt(maxPoints) + minPoints);
        super.SetDexCost(randNum.nextInt(maxDexCost) + minDexCost);
        super.SetType(type);
    }
}