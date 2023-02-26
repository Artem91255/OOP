package Seminar4.units;

public abstract class Warrior extends SomeHero {
    protected int minDamage;
    protected int maxDamage;

    public Warrior(int attack, int defense, int minDamage, int maxDamage, float hp, int maxHp, int speed, String name, int team, int xCoordinates, int yCoordinates)
    {
        super(attack, defense, hp, maxHp, speed, name, team, xCoordinates, yCoordinates);
        this.minDamage = minDamage;
        this.maxDamage = maxDamage;
    }


    
}
