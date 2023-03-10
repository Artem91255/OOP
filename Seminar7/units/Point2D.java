package Seminar7.units;





public class Point2D {

    protected int xCoordinate;
    protected int yCoordinate;

    public Point2D(int xCoordinate, int yCoordinate)
    {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
    }
    protected boolean isLeft(Point2D oponent){
        return xCoordinate < oponent.xCoordinate;
    }
    protected double findCoordinates(Point2D oponent)
    {
        return Math.sqrt(Math.pow(xCoordinate - oponent.xCoordinate,2) + Math.pow(yCoordinate - oponent.yCoordinate,2));
    }
    protected Point2D chooseWay(Point2D opponent) {

        return new Point2D(xCoordinate - opponent.xCoordinate, yCoordinate - opponent.yCoordinate);
    }
}
