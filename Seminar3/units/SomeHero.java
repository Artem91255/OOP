package Seminar3.units;



import Seminar3.GameInterface;

public abstract class SomeHero implements GameInterface, Comparable<SomeHero> {
    
    
    protected int attack;
    protected int defense;
   
    
    protected int hp;
    protected int speed;
    
    
    protected String name;
    
    
   
    
   
    public int getHP() {return hp;}
  
    public SomeHero(int attack, int defense, int hp, int speed, String name)
    {
        this.attack = attack;
        this.defense = defense;
        
        this.hp = hp;
        this.speed = speed;
        this.name = name;

       
    }

    public  int Attack (int hp, int defense, int damage)
    {
        int result = hp+defense-damage;
        return result;
    }
    
    @Override
    public void stepMove() {}

    @Override
    public String getInfo()
    {
        return "null";
    }
    
    
    @Override
    public int compareTo(SomeHero o) {
        if (this.speed > o.speed)
            return 1;
        else if (this.speed < o.speed)
            return -1;
        else
            return 0;

}
}
