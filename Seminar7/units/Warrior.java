package Seminar7.units;

import java.util.ArrayList;

public abstract class Warrior extends SomeHero {
    protected int minDamage;
    protected int maxDamage;

    public Warrior(int attack, int defense, int minDamage, int maxDamage, float hp, int maxHp, int speed, String name, int xCoordinates, int yCoordinates)
    {
        super(attack, defense, hp, maxHp, speed, name, xCoordinates, yCoordinates);
        this.minDamage = minDamage;
        this.maxDamage = maxDamage;
    }

    @Override
    public void stepMove(ArrayList<SomeHero> team1, ArrayList<SomeHero> team2) {
        if (state.equals("Die"))
            return;
        SomeHero victim = team2.get(findNearest(team2));
        if (victim.coord.findCoordinates(coord) < 2) {
            float damage = (victim.defense - attack) > 0 ? minDamage : (victim.defense - attack) < 0 ? maxDamage : (minDamage + maxDamage) / 2;
            victim.getDamage(damage);
        } else {
            Point2D tempvc = coord.chooseWay(victim.coord);
            if (Math.abs(tempvc.xCoordinate) < Math.abs(tempvc.yCoordinate)) {
                if (coord.chooseWay(victim.coord).yCoordinate > 0) {
                    coord.yCoordinate--;
                } else {
                    coord.yCoordinate++;
                }
            } else {
                if (coord.chooseWay(victim.coord).xCoordinate > 0) {
                    coord.xCoordinate--;
                } else {
                    coord.xCoordinate++;
                }
            }
        }
    }
}

