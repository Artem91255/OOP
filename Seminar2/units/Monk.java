package Seminar2.units;

import Seminar2.units.SomeHero;

public class Monk extends SomeHero {
    double mana;

    public Monk(String name)
    {
        super(name, 90, 10, 10, 5);
         
    }
    @Override
    public String getInfo()
    {
        return "Монах " + name;
    }

    @Override
    public void stepMove(){}

}
