package Seminar7.units;


public class Pikeman extends Warrior {
    
    public Pikeman(String name,  int xCoordinate, int yCoordinate)
    {
        super(10, 5, 1, 3, 70.f, 70, 4, name,  xCoordinate, yCoordinate);
         
    }
    @Override
    public StringBuilder getInfo() {
        StringBuilder builder = new StringBuilder();
        return builder.append("Пикенер:\t\t").append(Pikeman.super.name)
                .append("\t| ATK:\t").append(Pikeman.super.attack)
                .append("\t| HP:\t").append(Pikeman.super.hp)
                .append(" \t|\t\t\t|").append("\t| (X.Y) : ").append(Pikeman.super.coord.xCoordinate).append(".").append(Pikeman.super.coord.xCoordinate);
    }
}
