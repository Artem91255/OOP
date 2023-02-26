package Seminar4.units;


public class Monk extends Witch {


    public Monk(String name, int team, int xCoordinate, int yCoordinate)
    {
        super(12, 7, -4, 50.f, 50, 5, 1, name, team, xCoordinate, yCoordinate);
         
    }
    @Override
    public StringBuilder getInfo() {
        StringBuilder builder = new StringBuilder();
        return builder.append("Монах:  \t").append(Monk.super.name)
                .append("\t| ATK:\t").append(Monk.super.attack)
                .append("\t| HP:\t").append(Monk.super.hp)
                .append(" \t| MP:\t").append(Monk.super.magic)
                .append("\t|").append("\t| (X.Y) : ").append(Monk.super.coord.xCoordinate).append(".").append(Monk.super.coord.yCoordinate);
    }

}
