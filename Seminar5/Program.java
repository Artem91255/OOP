package Seminar5;

import Seminar5.units.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;

public class Program {
    static final int UNITS = 10;
    public static void main(String[] args) {
     
        ArrayList<SomeHero> team1 = new ArrayList<>();
        ArrayList<SomeHero> team2 = new ArrayList<>();
        ArrayList<SomeHero> team3 = new ArrayList<>();
        Scanner user_input = new Scanner(System.in);
        Random random = new Random();

        for (int i = 0; i<UNITS; i++)
        {
            
            int randomNumber = random.nextInt(4);
            int randomPlaceForFirstTeam = random.nextInt(5);
           
            switch(randomNumber){
                case 0:
                        team1.add(new Peasant(getName(),1,randomPlaceForFirstTeam,i));
                       // team3.add(new Peasant(getName(),1,randomPlaceForFirstTeam,i));
                        break;
                case 1:
                        team1.add(new Pikeman(getName(),1,randomPlaceForFirstTeam,i));
                      //  team3.add(new Pikeman(getName(),1,randomPlaceForFirstTeam,i));
                        break;
                case 2:
                        team1.add(new XBowman(getName(),1,randomPlaceForFirstTeam,i));
                     //   team3.add(new Pikeman(getName(),1,randomPlaceForFirstTeam,i));
                        break;
                case 3:
                        team1.add(new Monk(getName(),1, randomPlaceForFirstTeam, i));
                        //team3.add(new Monk(getName(),1,randomPlaceForFirstTeam,i));
                        break;
            }
     
        }

        for (int i = 0; i<UNITS; i++)
        {
            int randomNumber = random.nextInt(4, 8);
            int randomPlaceForSecondTeam = random.nextInt(5,10);
            if(randomNumber==4)
                {
                    team2.add(new Sniper(getName(), 2,randomPlaceForSecondTeam,i));
                  //  team3.add(new Sniper(getName(), 2,randomPlaceForSecondTeam,i));
                }
                if(randomNumber==5)
                {
                    team2.add(new Rogue(getName(), 2,randomPlaceForSecondTeam,i));
                   // team3.add(new Rogue(getName(), 2,randomPlaceForSecondTeam,i));
                }
                if(randomNumber==6)
                {
                    team2.add(new Wizard(getName(), 2,randomPlaceForSecondTeam,i));
                   // team3.add(new Wizard(getName(), 2,randomPlaceForSecondTeam,i));
                }
                if(randomNumber==7)
                {
                    team2.add(new Peasant(getName(), 2,randomPlaceForSecondTeam,i));
                   // team3.add(new Peasant(getName(), 2,randomPlaceForSecondTeam,i));
                }
        }
        team3.addAll(team1);
        team3.addAll(team2);
        //team3.sort(new SpeedComparator());
        sortTeam(team3);


        String stop = "";
        while(stop.equals(""))
        {
            for (SomeHero hero: team3)
            {
                if (team1.contains(hero)) hero.stepMove(team1, team2);
                else hero.stepMove(team2, team1);
            }
            team3.forEach(n -> System.out.println(n.getInfo()));
            stop = user_input.nextLine();
        }



//        for(SomeHero someHero: team3)
//        {
//            if(team1.contains(someHero)) someHero.stepMove(team1, team2);
//            else someHero.stepMove(team2, team1);
//        }
    }


    private static String getName(){
        return String.valueOf(Names.values()[new Random().nextInt(Names.values().length-1)]);
    }
  static void sortTeam(ArrayList<SomeHero> team)
  {
      team.sort(new Comparator<SomeHero>()
      {
          @Override
          public int compare(SomeHero t1, SomeHero t0)
          {
              if (t1.getSpeed() == t0.getSpeed())
              {
                  return (int) (t1.getHP() - t0.getHp());
              }
              else return (int) (t1.getSpeed() - t0.getSpeed());
          }
      });
  }
    
}
