package Seminar7.units;


public class Peasant extends Civilian {

    
    public Peasant(String name, int xCoordinate, int yCoordinate)
    {
        super(1, 1, 1, 50.f, 50, 3, 1, name, xCoordinate, yCoordinate);
        
         
    }



@Override
public StringBuilder getInfo() {
    StringBuilder builder = new StringBuilder();
    return builder.append("Крестьянин: \t").append(Peasant.super.name)
            .append("\t| ATK:\t").append(Peasant.super.attack)
            .append("\t| HP:\t").append(Peasant.super.hp)
            .append(" \t| Arrows: ").append(Peasant.super.delivery)
            .append("\t|").append("\t| (X.Y) : ").append(Peasant.super.coord.xCoordinate).append(".").append(Peasant.super.coord.yCoordinate);
}



}
