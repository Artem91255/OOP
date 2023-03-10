package Seminar7.units;

import java.util.Comparator;

public class SpeedComparator implements Comparator<SomeHero> {
    
    @Override
    public int compare(SomeHero o1, SomeHero o2) {
        return Integer.compare(o1.speed, o2.speed);
    }
}
