package Feet_to_Centimeter;

public class FtToCmConverter {
    public static double converter(int feet) {
        return feet < 0 ? -1 : (feet * 30.48);
    }

    public static double converter(double feet) {
        return feet < 0 ? -1 :(feet * 30.48);
    }
}
