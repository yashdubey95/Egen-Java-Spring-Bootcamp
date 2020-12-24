package Carpet_Cost_Calculator;

import java.util.HashMap;

public class RoomCarpet extends RoomDimension{
    private RoomDimension roomDimension;
    private HashMap<String, Double> costPerSquareFoot;
    public RoomCarpet(RoomDimension roomDimension, HashMap<String, Double> costPerSquareFoot) {
        super(roomDimension.length, roomDimension.width);
        this.roomDimension = roomDimension;
        this.costPerSquareFoot = costPerSquareFoot;
    }

    public HashMap<String, Double> totalCostOfCarpet() {
        HashMap<String, Double> totalCostMap = new HashMap<>();
        for (var entry : costPerSquareFoot.entrySet()) {
            totalCostMap.put(entry.getKey(), entry.getValue() * roomDimension.area());
        }
        return totalCostMap;
    }

}
