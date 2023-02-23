package Seminar3.units;



public class Peasant extends Civilian {
    int delivery;
    
    public Peasant(String name)
    {
        super(1, 1, 1, 1, 3, 1, name);
        
         
    }
    @Override
    public String getInfo()
    {
        return "Крестьянин " + name + ". Скорость: " + speed;
    }

    @Override
    public void stepMove(){}
    
    
}
