package Seminar7.units;


import Seminar7.GameInterface;

import java.util.ArrayList;

public abstract class SomeHero implements GameInterface, Comparable<SomeHero> {
    
    
    protected int attack;
    protected int defense;
   
    
    protected float hp;
    protected int maxHp;
    protected int speed;
    
    
    protected String name;
    //protected int team;
    protected Point2D coord;
    protected String state;
    protected static int heroCnt;
    @Override
    public String toString() {
        return name +
                " H:" + Math.round(hp) +
                " D:" + defense +
                " A:" + attack +
                " Dmg:" + Math.round(Math.abs((attack) / 2)) +
                " " + state;
    }

    public int[] getCoords() {return new int[]{coord.xCoordinate, coord.yCoordinate};}
    public float getHP() {return hp;}
  
    public SomeHero(int attack, int defense, float hp, int maxHp, int speed, String name, int xCoordinate, int yCoordinate)
    {
        this.attack = attack;
        this.defense = defense;
        
        this.hp = hp;
        this.maxHp = maxHp;
        this.speed = speed;
        this.name = name;


        coord = new Point2D(xCoordinate,yCoordinate);

        state = "Stand";
        heroCnt++;

    }






    public int getSpeed() { return this.speed; }
    public float getHp () { return this.hp; }



    @Override
    public void stepMove(ArrayList<SomeHero> team1, ArrayList<SomeHero> team2) {}

    protected int findNearest(ArrayList<SomeHero> team)
    {
        double min = Double.MAX_VALUE;
        int index = 0;
        for(int i = 0; i<team.size(); i++)
        {
            if(min> coord.findCoordinates(team.get(i).coord) && !team.get(i).state.equals("Die"));
            {
                index = i;
                min = coord.findCoordinates(team.get(i).coord);
            }
        }
        return index;
    }
    

    protected void getDamage(float damage)
    {
        this.hp -= damage;
        if(hp <= 0)
        {
            hp = 0;
            state = "Die";
        }
        if (hp > maxHp) hp = maxHp;
    }
    @Override
    public StringBuilder getInfo() {
        return new StringBuilder("");
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
