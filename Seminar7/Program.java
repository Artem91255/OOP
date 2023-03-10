package Seminar7;

import Seminar7.units.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;

public class Program {
    static final int UNITS = 10;
    public static ArrayList<SomeHero> team1 = new ArrayList<>();
    public static ArrayList<SomeHero> team2 = new ArrayList<>();
    public static ArrayList<SomeHero> team3 = new ArrayList<>();

    public static void main(String[] args) {


        Scanner user_input = new Scanner(System.in);
        System.out.print("Press Enter to begin.");
        user_input.nextLine();


        createTeam(team1, 0, 1);
        createTeam(team2, 3, 10);
        team3.addAll(team1);
        team3.addAll(team2);
        sortTeam(team3);



        while (true){
            View.view();
            user_input.nextLine();
            for (SomeHero someHero: team3) {
                if (team1.contains(someHero)) someHero.stepMove(team1, team2);
                else someHero.stepMove(team2, team1);
            }
        }
    }

        static void createTeam (ArrayList team, int offset, int yCoord) {
            for (int i = 0; i < UNITS; i++) {
                int rnd = new Random().nextInt(4)+offset;
                switch (rnd) {
                    case (0):
                        team.add(new Sniper(getName(), i + 1, yCoord));
                        break;
                    case (1):
                        team.add(new Rogue(getName(),i + 1, yCoord));
                        break;
                    case (2):
                        team.add(new Wizard(getName(), i + 1, yCoord));
                        break;
                    case (3):
                        team.add(new Peasant(getName(), i + 1, yCoord));
                        break;
                    case (4):
                        team.add(new XBowman(getName(), i + 1, yCoord));
                        break;
                    case (5):
                        //team.add(new XBowman(getName(), i + 1, yCoord));
                        team.add(new Monk(getName(), i + 1, yCoord));
                        break;
                    case (6):
                        team.add(new Pikeman(getName(), i + 1, yCoord));
                        break;
                }
            }
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



