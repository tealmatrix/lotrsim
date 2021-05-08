package weapon;

import java.util.Random;

public abstract class Weapon 
{
    protected Random randNum = new Random();
    private int weaponDamage;
    private String type;

    public Weapon() {}

    public int GetWeaponDamage()
    {
        return this.weaponDamage;
    }
    public void SetWeaponDamage(int damage)
    {
        this.weaponDamage = damage;
    }
    public String GetType()
    {
        return this.type;
    }
    public void SetType(String type)
    {
        this.type = type;
    }

    // poloymorphic method
    public abstract int Strike(int dex, int strength);
}