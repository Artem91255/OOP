package Seminar3.units;

import Seminar3.units.SomeHero;

public class Wizard extends Witch  {
    
    
    public Wizard (String name)
    {
        super(17, 12, -5, 30, 9, 1, name);
         
    }
    @Override
    public String getInfo()
    {
        return "Волшебник " + name + ". Скорость: " + speed;
    }

    @Override
    public void stepMove(){}
}
