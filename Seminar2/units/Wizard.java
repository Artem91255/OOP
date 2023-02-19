package Seminar2.units;

import Seminar2.units.SomeHero;

public class Wizard extends SomeHero  {
    double mana;
    
    public Wizard (String name)
    {
        super(name, 70, 10, 15, 8);
         
    }
    @Override
    public String getInfo()
    {
        return "Волшебник " + name;
    }

    @Override
    public void stepMove(){}
}
