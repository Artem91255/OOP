package Seminar5;

import Seminar5.units.SomeHero;

import java.util.ArrayList;

public interface GameInterface {


    void stepMove(ArrayList<SomeHero> team1, ArrayList<SomeHero> team2);

    StringBuilder getInfo();

}
