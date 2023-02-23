package Seminar3.units;

public class Warrior extends SomeHero {
    protected int minDamage;
    protected int maxDamage;

    public Warrior(int attack, int defense, int minDamage, int maxDamage, int hp, int speed, String name)
    {
        super(attack, defense, hp, speed, name);
        this.minDamage = minDamage;
        this.maxDamage = maxDamage;
    }

    
    
}
