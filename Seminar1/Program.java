package Seminar1;

import Seminar1.units.Monk;
import Seminar1.units.Peasant;
import Seminar1.units.Pikeman;
import Seminar1.units.Rogue;
import Seminar1.units.Sniper;
import Seminar1.units.Wizard;
import Seminar1.units.XBowman;

public class Program {
    public static void main(String[] args) {
        Monk monk1 = new Monk("someMonk");
        Peasant peasant1 = new Peasant("somePeasant");
        Pikeman pikeman1 = new Pikeman("somePikeman");
        Rogue rogue1 = new Rogue("someRogue");
        Sniper sniper1 = new Sniper("sniper1");
        Wizard wizard1 = new Wizard("someWizard");
        XBowman xBowman1 = new XBowman("someXBowman");
       
        System.out.println(monk1.Attack(100, 20, 10));
    }
    
}
