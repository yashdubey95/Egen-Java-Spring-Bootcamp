package Menu;

import java.util.HashMap;

public class MenuMain {
    public static HashMap<String, Double> specialMenu = new HashMap<>();
    public static HashMap<String, Double> mainMenu = new HashMap<>();
    public static HashMap<String, Double> desserts = new HashMap<>();
    int option;

    public MenuMain() {
    }

    public MenuMain(int option) {
        if(specialMenu.isEmpty()) {
            specialMenu.put("Chicken Fried Chicken Plate", 10.50);
            specialMenu.put("Philly Cheese Steak or Chicken Sandwich", 9.50);
            specialMenu.put("Grilled Chicken Breast Plate", 9.25);
        }
        if(mainMenu.isEmpty()) {
            mainMenu.put("Angus Plate", 10.50);
            mainMenu.put("2 Piece Cat Fish Plate", 10.50);
            mainMenu.put("Chicken Fried Steak Plate", 10.50);
        }
        if(desserts.isEmpty()) {
            desserts.put("Chocolate chip Cookies", 2.25);
            desserts.put("Fresanada", 5.25);
            desserts.put("Chocolate MilkShake", 3.50);
        }

        this.option = option;

    }

}