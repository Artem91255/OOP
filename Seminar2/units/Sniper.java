package Seminar2.units;

import Seminar2.units.SomeHero;

public class Sniper extends SomeHero  {
    double eagleEye;

    public double getDamage(){
        return super.damage;
    }

    public Sniper (String name)
    {
        super(name, 80, 10, 15, 8);
         
    }
    @Override
    public String getInfo()
    {
        return "Снайпер " + name;
    }

    @Override
    public void stepMove(){}
}
