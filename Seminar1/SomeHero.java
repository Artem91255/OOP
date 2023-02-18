package Seminar1;

public abstract class SomeHero {
    
    
    protected String name;
    protected double damage;
    protected double defense;
    protected double hp;
    protected double speed;
   

  
    public SomeHero(String name, int hp, double damage, double defense, double speed)
    {
        this.name = name;
        this.hp = hp;
        this.damage = damage;
        this.defense = defense;
        this.speed = speed;
       
    }

    public  double Attack (double hp, double defense, double damage)
    {
        double result = hp+defense-damage;
        return result;
    }
    

}
