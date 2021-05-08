package weapon;

public class Dramborleg extends Weapon {
    private int damage = 80;
    private int hitChance = 30; // base 30% chance
    private String type = "Axe";

    public Dramborleg() {
        super();
        super.SetWeaponDamage(damage);
        super.SetType(type);
    }

    @Override
    public int Strike(int dex, int strength) {
        int damageAmount = 0;
        if (randNum.nextInt(100) + 1 <= (hitChance + (dex / 14))) {
            damageAmount += strength / 14;
        } else {
            // do nothing
        }
        return damageAmount;
    }
}