package Carpet_Cost_Calculator;

public class RoomCarpet extends RoomDimension{
    private RoomDimension roomDimension;
    private double costPerSquareFoot;
    public RoomCarpet(RoomDimension roomDimension, double costPerSquareFoot) {
        super(roomDimension.length, roomDimension.width);
        this.roomDimension = roomDimension;
        this.costPerSquareFoot = costPerSquareFoot;
    }

    public double totalCostOfCarpet() {
        return roomDimension.area() * costPerSquareFoot;
    }

}
