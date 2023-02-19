package Seminar2.units;

import Seminar2.units.SomeHero;

public class XBowman extends SomeHero{
    double poisonedArrow;

    public XBowman(String name)
    {
        super(name, 90, 10, 10, 5);
         
    }

    @Override
    public String getInfo()
    {
        return "Арбалетчик " + name;
    }

    @Override
    public void stepMove(){}
}
