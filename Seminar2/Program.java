package Seminar2;

import java.util.ArrayList;
import java.util.Random;

import Seminar2.units.SomeHero;
import Seminar2.units.Monk;
import Seminar2.units.Peasant;
import Seminar2.units.Pikeman;
import Seminar2.units.Rogue;
import Seminar2.units.Sniper;
import Seminar2.units.Wizard;
import Seminar2.units.XBowman;

public class Program {
    public static void main(String[] args) {
        Monk monk1 = new Monk("someMonk");
        Peasant peasant1 = new Peasant("somePeasant");
        Pikeman pikeman1 = new Pikeman("somePikeman");
        Rogue rogue1 = new Rogue("someRogue");
        Sniper sniper1 = new Sniper("sniper1");
        Wizard wizard1 = new Wizard("someWizard");
        XBowman xBowman1 = new XBowman("someXBowman");
        
        ArrayList<SomeHero> list = new ArrayList<>();

        for(int i = 0; i<10; i++)
        {
            Random random = new Random();
            int randomNumber = random.nextInt(7);
            if(randomNumber==0)
            {
                list.add(new XBowman(getName()));
            }
            if(randomNumber==1)
            {
                list.add(new Peasant(getName()));
            }
            if(randomNumber==2)
            {
                list.add(new Monk(getName()));
            }
            if(randomNumber==3)
            {
                list.add(new Pikeman(getName()));
            }
            if(randomNumber==4)
            {
                list.add(new Rogue(getName()));
            }
            if(randomNumber==5)
            {
                list.add(new Sniper(getName()));
            }
            if(randomNumber==6)
            {
                list.add(new Wizard(getName()));
            }
            
        }
        list.forEach(n -> System.out.println(n.getInfo()));
        
         

        
       
        //System.out.println(monk1.Attack(100, 20, 10));
    }
    private static String getName(){
        return String.valueOf(Names.values()[new Random().nextInt(Names.values().length-1)]);
    }
    
}
