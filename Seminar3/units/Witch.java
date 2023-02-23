package Seminar3.units;

public class Witch extends SomeHero{
    protected int magic;
    protected int damage;

    public Witch(int attack, int defense, int damage, int hp, int speed, int magic, String name)
    {
        super(attack, defense, hp, speed, name);
        this.damage = damage;
        this.magic = magic;
    }
    
}
