package Feet_to_Centimeter;

import java.util.Scanner;

public class FeetToCentimeter {
    public static void main(String[] args) {

        FtToCmConverter obj = new FtToCmConverter();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value in Feet:");
        if(sc.hasNextInt()) {
            int feet = sc.nextInt();
            double res = obj.converter(feet);
            if (res == -1) {
                System.out.println("Please Enter Positive Value for Feet");
            } else {
                System.out.println(feet+" Feet is equal to "+res+" Centimeters");
            }
        }
        else if(sc.hasNextDouble()) {
            double feet = sc.nextDouble();
            double res = obj.converter(feet);
            if (res == -1) {
                System.out.println("Please Enter Positive Value for Feet");
            } else {
                System.out.println(feet+" Feet is equal to "+res+" Centimeters");
            }
        }
        else System.out.println("Please Enter Feet in Either Integer or Double Format");

        sc.close();

    }

}
