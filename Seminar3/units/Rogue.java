package Seminar3.units;

import Seminar3.units.SomeHero;

public class Rogue extends Warrior  {
    

    public Rogue(String name)
    {
        super(8, 3, 2, 4, 10, 6, name);
         
    }
    public double getDamage(){
        return super.maxDamage;
    }
    @Override
    public String getInfo()
    {
        return "Разбойник " + name + ". Скорость: " + speed;
    }

    @Override
    public void stepMove(){}
    
}
