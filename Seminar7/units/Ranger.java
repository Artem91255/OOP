package Seminar7.units;

import java.util.ArrayList;

public abstract class Ranger extends SomeHero {
    protected int shots;
    protected int minDamage;
    protected int maxDamage;

    public Ranger(int attack, int defense, int shots, int minDamage, int maxDamage, float hp, int maxHp, int speed, String name, int xCoordinate, int yCoordinate) {
        super(attack, defense, hp, maxHp, speed, name, xCoordinate, yCoordinate);
        this.shots = shots;
        this.minDamage = minDamage;
        this.maxDamage = maxDamage;
    }


//    Реализовать метод step() лучников.
//    3.1 Если жизнь равна нулю или стрел нет, завершить обработку.
//    3.2 Поиск среди противников наиболее приближённого.
//    3.3 Нанести среднее повреждение найденному противнику.
//    3.4 Найти среди своих крестьянина.
//    3.5 Если найден завершить метод иначе уменьшить запас стрел на одну.

    @Override
    public void stepMove(ArrayList<SomeHero> team1, ArrayList<SomeHero> team2)
    {
        if (state.equals("Die") || shots == 0) return;
        SomeHero target = team2.get(findNearest(team2));

        float damage = (target.defense - attack)>0 ? minDamage : (target.defense - attack)<0 ? maxDamage : (minDamage+maxDamage)/2;
        target.getDamage(damage);

        for(SomeHero someHero: team1)
        {
            if(someHero.getInfo().toString().split(":")[0].equals("Крестьянин") && someHero.state.equals("Stand")) {
                someHero.state = "Busy";
                return;
            }
        }
        shots--;

    }
}