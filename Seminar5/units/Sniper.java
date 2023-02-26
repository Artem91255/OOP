package Seminar5.units;


public class Sniper extends Ranger {
    

    // public double getDamage(){
    //     return super.damage;
    // }

    public Sniper (String name, int team, int xCoordinate, int yCoordinate)
    {
        super(12, 10, 32, 8, 10, 60.f, 60, 9, name, team, xCoordinate, yCoordinate);
         
    }
    @Override
    public StringBuilder getInfo() {
        StringBuilder builder = new StringBuilder();
        return builder.append("Снайпер:\t\t").append(Sniper.super.name)
                .append("\t| ATK:\t").append(Sniper.super.attack)
                .append("\t| HP:\t").append(Sniper.super.hp)
                .append(" \t| Arrows:").append(Sniper.super.shots)
                .append("\t|").append("\t| (X.Y) : ").append(Sniper.super.coord.xCoordinate).append(".").append(Sniper.super.coord.yCoordinate);
    }
}
