package Seminar2.units;

import Seminar2.units.SomeHero;

public class Peasant extends SomeHero  {
    double runFast;
    
    public Peasant(String name)
    {
        super(name, 100, 5, 0, 10);
         
    }
    @Override
    public String getInfo()
    {
        return "Крестьянин " + name;
    }

    @Override
    public void stepMove(){}
}
