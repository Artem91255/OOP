package Seminar2.units;

import Seminar2.units.SomeHero;

public class Rogue extends SomeHero  {
    int backstab;

    public Rogue(String name)
    {
        super(name, 80, 10, 15, 8);
         
    }
    public double getDamage(){
        return super.damage;
    }
    @Override
    public String getInfo()
    {
        return "Разбойник " + name;
    }

    @Override
    public void stepMove(){}
    
}
