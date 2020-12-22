package Carpet_Cost_Calculator;

import java.util.Scanner;

public class CarpetCost {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Dimensions of the Room");
        System.out.println("Enter the Length:");
        double length = sc.nextDouble();
        System.out.println("Enter the Width");
        double width = sc.nextDouble();
        System.out.println("Enter the cost per sq.ft");
        double costPerSqft = sc.nextDouble();
        sc.close();

        RoomDimension roomDimension = new RoomDimension(length, width);
        RoomCarpet roomCarpet = new RoomCarpet(roomDimension, costPerSqft);

        System.out.println("The Total Cost of Carpeting the Floor of Length: "+length+" and Width: "+width+ " = "+roomCarpet.totalCostOfCarpet());

    }
}
