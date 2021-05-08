package weapon;

public class MorgulKnife extends Weapon {
    private int damage = 50;
    private int hitChance = 60; // base 60% chance
    private String type = "MorgulKnife";

    public MorgulKnife() {
        super();
        super.SetWeaponDamage(damage);
        super.SetType(type);
    }

    @Override
    public int Strike(int dex, int strength) // 50
    {
        int damageAmount = 0;
        if (randNum.nextInt(100) + 1 <= (hitChance + (dex / 10))) {
            damageAmount += (strength / 10); // 150 = 15
        } else {
            // do nothing
        }
        return damageAmount;
    }
}