package Seminar4.units;

public abstract class Witch extends SomeHero {
    protected int magic;
    protected int damage;

    public Witch(int attack, int defense, int damage, float hp, int maxHp, int speed, int magic, String name, int team, int xCoordinate, int yCoordinate)
    {
        super(attack, defense, hp, maxHp, speed, name, team, xCoordinate, yCoordinate);
        this.damage = damage;
        this.magic = magic;
    }
    
}
