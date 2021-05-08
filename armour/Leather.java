package armour;

public class Leather extends Armour
{
    private int minPoints = 30;
    private int maxPoints = 60;
    private int minDexCost = 5;
    private int maxDexCost = 7;
    private String type = "Leather";

    public Leather()
    {
        super();
        super.SetArmourPoints(randNum.nextInt(maxPoints) + minPoints);
        super.SetDexCost(randNum.nextInt(maxDexCost) + minDexCost);
        super.SetType(type);
    }
}