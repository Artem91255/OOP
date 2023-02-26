package Seminar4.units;

import java.util.ArrayList;

public abstract class Civilian extends SomeHero {
    protected int delivery;
    protected int damage;

    public Civilian(int attack, int defense, int damage, float hp, int maxHp, int speed, int delivery,  String name, int team, int xCoordinate, int yCoordinate)
    {
        super(attack, defense, hp, maxHp, speed, name, team, xCoordinate, yCoordinate);
        this.delivery = delivery;
        this.damage = damage;
    }

    // ДЗ
//    @Override
//    public void stepMove(ArrayList<SomeHero> team1, ArrayList<SomeHero> team2)
//    {
//        if (state.equals("Die") || shots == 0) return;
//        SomeHero target = team2.get(findNearest(team2));
//
//        float damage = (target.defense - attack)>0 ? minDamage : (target.defense - attack)<0 ? maxDamage : (minDamage+maxDamage)/2;
//        target.getDamage(damage);
//
//        for(SomeHero someHero: team1)
//        {
//            if(someHero.getInfo().toString().split(":")[0].equals("Крестьянин") && someHero.state.equals("Stand")) {
//                someHero.state = "Busy";
//                return;
//            }
//        }
//        shots--;

}
