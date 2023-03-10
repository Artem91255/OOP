package Seminar6.units;

import java.util.ArrayList;

public abstract class Civilian extends SomeHero {
    protected int delivery;
    protected int damage;

    public Civilian(int attack, int defense, int damage, float hp, int maxHp, int speed, int delivery, String name, int xCoordinate, int yCoordinate) {
        super(attack, defense, hp, maxHp, speed, name, xCoordinate, yCoordinate);
        this.delivery = delivery;
        this.damage = damage;
    }


    @Override
    public void stepMove(ArrayList<SomeHero> team1, ArrayList<SomeHero> team2) {
        if (!state.equals("Die")) {state = "Stand"; return;}

    }
}