package Seminar7.units;


public class Rogue extends Warrior {
    

    public Rogue(String name, int xCoordinate, int yCoordinate)
    {
        super(10, 3, 2, 4, 70.f, 70, 6, name, xCoordinate, yCoordinate);
         
    }
    public double getDamage(){
        return super.maxDamage;
    }
    @Override
    public StringBuilder getInfo() {
        StringBuilder builder = new StringBuilder();
        return builder.append("Бандит: \t\t").append(Rogue.super.name)
                .append("\t| ATK:\t").append(Rogue.super.attack)
                .append("\t| HP:\t").append(Rogue.super.hp)
                .append(" \t|\t\t\t|").append("\t| (X.Y) : ").append(Rogue.super.coord.xCoordinate).append(".").append(Rogue.super.coord.yCoordinate);
    }

}
