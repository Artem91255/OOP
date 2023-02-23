package Seminar3.units;

public abstract class Civilian extends SomeHero{
    protected int delivery;
    protected int damage;

    public Civilian(int attack, int defense, int damage, int hp, int speed, int delivery,  String name)
    {
        super(attack, defense, hp, speed, name);
        this.delivery = delivery;
        this.damage = damage;
    }
}
