package warrior;

import java.util.Random;

public abstract class Warrior {
    protected Random randNum = new Random();
    private int health;
    private int dexterity;
    private int strength;
    private int criticalStrike;
    private int intelligence;
    private String type;

    public Warrior() {
    }

    // getters
    public int GetHealth() {
        return this.health;
    }

    public int GetDexterity() {
        return this.dexterity;
    }

    public int GetStrength() {
        return this.strength;
    }

    public String GetType() {
        return this.type;
    }

    public int GetCritcalStrike() {
        return this.criticalStrike;
    }

    public int GetIntelligence() {
        return this.intelligence;
    }

    // setters
    public void SetHealth(int health) {
        this.health = health;
    }

    public void SetDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public void SetStrength(int strength) {
        this.strength = strength;
    }

    public void TakeDamage(int damage) {
        if (damage > 0)
            this.health -= damage;
    }

    public void SetCriticalStrike(int criticalStrike) {
        this.criticalStrike = criticalStrike;
    }

    public void SetIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public void SetType(String type) {
        this.type = type;
    }

}