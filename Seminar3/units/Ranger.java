package Seminar3.units;

public abstract class Ranger extends SomeHero{
    protected int shots;
    protected int minDamage;
    protected int maxDamage;

    public Ranger(int attack, int defense, int shots, int minDamage, int maxDamage, int hp, int speed, String name)
    {
        super(attack, defense, hp, speed, name);
        this.shots = shots;
        this.minDamage = minDamage;
        this.maxDamage = maxDamage;
    }
    
}
