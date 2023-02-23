package Seminar3.units;



public class Monk extends Witch {
    

    public Monk(String name)
    {
        super(12, 7, -4, 30, 5, 1, name);
         
    }
    @Override
    public String getInfo()
    {
        return "Монах " + name + ". Скорость: " + speed;
    }

    @Override
    public void stepMove(){}

}
