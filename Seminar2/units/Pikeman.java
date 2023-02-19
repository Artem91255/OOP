package Seminar2.units;

import Seminar2.units.SomeHero;

public class Pikeman extends SomeHero  {
    double doubleDamage;

    public Pikeman(String name)
    {
        super(name, 120, 10, 20, 3);
         
    }
    @Override
    public String getInfo()
    {
        return "Копейщик " + name;
    }

    @Override
    public void stepMove(){}
}
