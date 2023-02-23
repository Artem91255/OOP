package Seminar3;

import java.util.ArrayList;
import java.util.Random;

import Seminar3.units.SomeHero;
import Seminar3.units.SpeedComparator;
import Seminar3.units.Monk;
import Seminar3.units.Peasant;
import Seminar3.units.Pikeman;
import Seminar3.units.Rogue;
import Seminar3.units.Sniper;
import Seminar3.units.Wizard;
import Seminar3.units.XBowman;

public class Program {
    public static void main(String[] args) {
     
        ArrayList<SomeHero> team1 = new ArrayList<>();
        ArrayList<SomeHero> team2 = new ArrayList<>();
        ArrayList<SomeHero> team3 = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i<10; i++)
        {
            
            int randomNumber = random.nextInt(4);
           
            switch(randomNumber){
                case 0:
                        team1.add(new Peasant(getName()));
                        team3.add(new Peasant(getName()));
                        break;
                case 1:
                        team1.add(new Pikeman(getName()));
                        team3.add(new Pikeman(getName()));
                        break;
                case 2:
                        team1.add(new XBowman(getName()));
                        team3.add(new Pikeman(getName()));
                        break;
                case 3:
                        team1.add(new Monk(getName()));
                        team3.add(new Monk(getName()));
                        break;
            }
     
        }

        for (int i = 0; i<10; i++)
        {
            int randomNumber = random.nextInt(4, 8);
            if(randomNumber==4)
                {
                    team2.add(new Sniper(getName()));
                    team3.add(new Sniper(getName()));
                }
                if(randomNumber==5)
                {
                    team2.add(new Rogue(getName()));
                    team3.add(new Rogue(getName()));
                }
                if(randomNumber==6)
                {
                    team2.add(new Wizard(getName()));
                    team3.add(new Wizard(getName()));
                }
                if(randomNumber==7)
                {
                    team2.add(new Peasant(getName()));
                    team3.add(new Peasant(getName()));
                }
        }
        
        team3.sort(new SpeedComparator());
        team3.forEach(n -> System.out.println(n.getInfo()));
       
        

        
       
      
    }
    private static String getName(){
        return String.valueOf(Names.values()[new Random().nextInt(Names.values().length-1)]);
    }
    
}
