package Carpet_Cost_Calculator;

public class RoomDimension {
    double length;
    double width;
    public RoomDimension(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double area() {
        return this.length * this.width;

    }

}
