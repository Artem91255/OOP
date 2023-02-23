package Seminar3.units;



public class XBowman extends Ranger{
    double poisonedArrow;

    public XBowman(String name)
    {
        super(6, 3, 16, 2, 3, 10, 4, name);
         
    }

    @Override
    public String getInfo()
    {
        return "Арбалетчик " + name + ". Скорость: " + speed;
    }

    @Override
    public void stepMove(){}
}
