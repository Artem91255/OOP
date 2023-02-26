package Seminar4.units;


public class XBowman extends Ranger {


    public XBowman(String name, int team, int xCoordinate, int yCoordinate)
    {
        super(6, 3, 16, 2, 3, 60.f, 60, 9, name, team, xCoordinate, yCoordinate);
         
    }

    @Override
    public StringBuilder getInfo() {
        StringBuilder builder = new StringBuilder();
        return builder.append("Арбалетчик: \t").append(XBowman.super.name)
                .append("\t| ATK:\t").append(XBowman.super.attack)
                .append("\t| HP:\t").append(XBowman.super.hp)
                .append(" \t| Arrows: ").append(XBowman.this.shots)
                .append("\t|").append("\t| (X.Y) : ").append(XBowman.super.coord.xCoordinate).append(".").append(XBowman.super.coord.yCoordinate);
    }



}
