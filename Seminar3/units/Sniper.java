package Seminar3.units;



public class Sniper extends Ranger  {
    

    // public double getDamage(){
    //     return super.damage;
    // }

    public Sniper (String name)
    {
        super(12, 10, 32, 8, 10, 15, 9, name);
         
    }
    @Override
    public String getInfo()
    {
        return "Снайпер " + name + ". Скорость: " + speed;
    }

    @Override
    public void stepMove(){}
}
