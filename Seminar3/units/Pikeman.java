package Seminar3.units;



public class Pikeman extends Warrior  {
    
    public Pikeman(String name)
    {
        super(4, 5, 1, 3, 10, 4, name);
         
    }
    @Override
    public String getInfo()
    {
        return "Копейщик " + name + ". Скорость: " + speed;
    }

    @Override
    public void stepMove(){}
}
