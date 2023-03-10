package Seminar6.units;

import java.util.ArrayList;

public abstract class Witch extends SomeHero {
    protected int magic;
    protected int damage;

    public Witch(int attack, int defense, int damage, float hp, int maxHp, int speed, int magic, String name, int xCoordinate, int yCoordinate)
    {
        super(attack, defense, hp, maxHp, speed, name, xCoordinate, yCoordinate);
        this.damage = damage;
        this.magic = magic;
    }
    protected SomeHero findSickUnit(ArrayList<SomeHero> team)
    {
        double minHp = Double.MAX_VALUE;
        int index = 0;
        for(int i = 0; i<team.size(); i++)
        {
            if(minHp> team.get(i).maxHp - team.get(i).hp)
            {
                index = i;
                minHp = team.get(i).maxHp - team.get(i).hp;
            }
        }
        return team.get(index);
    }
    @Override
    public void stepMove(ArrayList<SomeHero> team1, ArrayList<SomeHero> team2)
    {
        if (state.equals("Die") || magic<=0) return;
       SomeHero target = findSickUnit(team1);

        target.getDamage(damage);
        magic -= 1;

    }
}
