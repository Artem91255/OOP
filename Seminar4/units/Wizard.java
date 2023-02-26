package Seminar4.units;


public class Wizard extends Witch {
    
    
    public Wizard (String name, int team, int xCoordinate, int yCoordinate)
    {
        super(17, 12, -5, 30, 9, 1, 5, name, team,  xCoordinate,  yCoordinate);
         
    }
    @Override
    public StringBuilder getInfo() {
        StringBuilder builder = new StringBuilder();
        return builder.append("Колдун: \t").append(Wizard.super.name)
                .append("\t| ATK:\t").append(Wizard.super.attack)
                .append("\t| HP:\t").append(Wizard.super.hp)
                .append(" \t| MP:\t").append(Wizard.super.magic)
                .append("\t|").append("\t| (X.Y) : ").append(Wizard.super.coord.xCoordinate).append(".").append(Wizard.super.coord.yCoordinate);
    }
}
