package armour;

import java.util.Random;

public abstract class Armour 
{
    protected Random randNum = new Random();
    private int armourPoints;
    private int dexCost;
    private String type;

    public Armour() {}

    // getters
    public int GetArmourPoints()
    {
        return this.armourPoints;
    }
    public int GetDexCost()
    {
        return this.dexCost;
    }
    public String GetType()
    {
        return this.type;
    }

    // setters
    public void SetArmourPoints(int points)
    {
        this.armourPoints = points;
    }
    public void SetDexCost(int cost)
    {
        this.dexCost = cost;
    }
    public void SetType(String type)
    {
        this.type = type;
    }
}
