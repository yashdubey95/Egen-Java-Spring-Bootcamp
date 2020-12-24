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
        System.out.println("Select Currency Type (String) According to the Location of the Company Headquarters from the Following: ");
        System.out.println("1. United States(USD)"+"\t"+"2. India(INR)"+"\t"+"3. UK(GBP)"+"\t"+"4. Spain(EUR)");
        sc.nextLine();
        String location = sc.nextLine();
        System.out.println("Enter the Material/Type (String) of Carpet from the Following: ");
        System.out.println("1. Nylon"+"\t"+"2. Triexta"+"\t"+"3. Polyester"+"\t"+"4. Wool"+"\t"+"5. Olefin");
        String material = sc.nextLine();
        sc.close();

        CurrencyExchange currencyExchange = new CurrencyExchange(location.toLowerCase());
        CostPerSqft costPerSqft = new CostPerSqft(material.toLowerCase(), currencyExchange);
        RoomDimension roomDimension = new RoomDimension(length, width);
        RoomCarpet roomCarpet = new RoomCarpet(roomDimension, costPerSqft.materialCost());

        System.out.println("The Total Cost of Carpeting a "+material+" Floor of Length: "+length+" and Width: "+width+ " with Headquarters at "+currencyExchange.currToCountry().get(location.toLowerCase())+" in the Following Countries:");
        for (var entry : roomCarpet.totalCostOfCarpet().entrySet()) {
            System.out.println(currencyExchange.currToCountry().get(entry.getKey())+" = "+entry.getValue()+" "+location.toUpperCase());
        }

    }
}
