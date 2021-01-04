package Menu;

import java.util.Scanner;

public class Menu extends MenuMain{
    Scanner sc = new Scanner(System.in);
    private MenuMain menuMain;
    public Menu(MenuMain menuMain){
        super();
        this.menuMain = menuMain;
        menuOperations(menuMain.option);
    }

    public void menuOperations(int option) {
        switch (option) {
            case 1:
                System.out.println("Select the Menu Category to Which You Want to Add:");
                System.out.println("1. Special Menu \t 2. Main Menu \t 3. Desserts");
                int Category = sc.nextInt();
                switch(Category) {
                    case 1:
                        addSpecialMenu();
                        break;

                    case 2:
                        addMainMenu();
                        break;

                    case 3:
                        addDesserts();
                        break;
                }
                break;

            case 2:
                System.out.println("Select the Menu Category to Which You Want to Delete From:");
                System.out.println("1. Special Menu \t 2. Main Menu \t 3. Desserts");
                int deleteCategory = sc.nextInt();
                switch(deleteCategory) {
                    case 1:
                        deleteSpecialMenu();
                        break;

                    case 2:
                        deleteMainMenu();
                        break;

                    case 3:
                        deleteDesserts();
                        break;
                }
                break;

            case 3:
                System.out.println("Select the Menu Category to Which You Want to Make an Update:");
                System.out.println("1. Special Menu \t 2. Main Menu \t 3. Desserts");
                int updateCategory = sc.nextInt();
                switch(updateCategory) {
                    case 1:
                        updateSpecialMenu();
                        break;

                    case 2:
                        updateMainMenu();
                        break;

                    case 3:
                        updateDesserts();
                        break;
                }
                break;

            case 4:
                showAllMenus();
                break;

            default:
                System.out.println("Please Select a Valid Option");
                break;
        }
    }

    private void showAllMenus() {
        if (specialMenu.size() == 0) {
            System.out.println("Sorry there are no Special Items. Add Special Items");
        } else {
            System.out.println("--------------- Special Menu ------------------");
            for(String key : specialMenu.keySet()) {
                System.out.println(key + "    " + specialMenu.get(key));
            }
        }

        if (mainMenu.size() == 0) {
            System.out.println("Sorry there are no Main Menu Items. Add Main Menu Items");
        } else {
            System.out.println("--------------- Main Menu ------------------");
            for(String key : mainMenu.keySet()) {
                System.out.println(key + "    " + mainMenu.get(key));
            }
        }

        if (desserts.size() == 0) {
            System.out.println("Sorry there are no Dessert Items. Add Dessert Items");
        } else {
            System.out.println("--------------- Desserts Menu ------------------");
            for(String key : desserts.keySet()) {
                System.out.println(key + "    " + desserts.get(key));
            }
        }
    }

    private void updateSpecialMenu() {
        System.out.println("Enter the name of the Special Item You Want to Update:");
        sc.nextLine();
        String updateSpecialItem = sc.nextLine();
        System.out.println("Enter the New Price for "+updateSpecialItem);
        Double updatedSpecialPrice = sc.nextDouble();
        try {
            specialMenu.put(updateSpecialItem, updatedSpecialPrice);
        } catch (Exception e) {
            System.out.println("The Item You Entered Does not Exist");
        }
    }

    private void updateMainMenu() {
        System.out.println("Enter the name of the Main Menu Item You Want to Update:");
        sc.nextLine();
        String updateMainMenuItem = sc.nextLine();
        System.out.println("Enter the New Price for "+updateMainMenuItem);
        Double updatedMainMenuPrice = sc.nextDouble();
        try {
            mainMenu.put(updateMainMenuItem, updatedMainMenuPrice);
        } catch (Exception e) {
            System.out.println("The Item You Entered Does not Exist");
        }
    }

    private void updateDesserts() {
        System.out.println("Enter the name of the Dessert Item You Want to Update:");
        sc.nextLine();
        String updateDessertItem = sc.nextLine();
        System.out.println("Enter the New Price for "+updateDessertItem);
        Double updatedDessertPrice = sc.nextDouble();
        try {
            desserts.put(updateDessertItem, updatedDessertPrice);
        } catch (Exception e) {
            System.out.println("The Item You Entered Does not Exist");
        }
    }

    private void deleteSpecialMenu() {
        System.out.println("Enter the name of the Special Item You Want to Delete:");
        sc.nextLine();
        String deleteSpecialItem = sc.nextLine();
        try{
            specialMenu.remove(deleteSpecialItem);
        } catch (Exception e) {
            System.out.println("The Item you entered does not exist");
        }
    }

    private void deleteDesserts() {
        System.out.println("Enter the name of the Special Item You Want to Delete:");
        sc.nextLine();
        String deleteDessertItem = sc.nextLine();
        try{
            desserts.remove(deleteDessertItem);
        } catch (Exception e) {
            System.out.println("The dish you entered does not exist");
        }
    }

    private void deleteMainMenu() {
        System.out.println("Enter the name of the Special Item You Want to Delete:");
        sc.nextLine();
        String deleteMainItem = sc.nextLine();
        try{
            mainMenu.remove(deleteMainItem);
        } catch (Exception e) {
            System.out.println("The dish you entered does not exist");
        }
    }

    private void addSpecialMenu() {
        System.out.println("Enter the Name of the Item:");
        sc.nextLine();
        String specialName = sc.nextLine();
        System.out.println("Enter the Price for the Item:");
        Double specialPrice = sc.nextDouble();
        specialMenu.put(specialName, specialPrice);
    }

    private void addMainMenu() {
        System.out.println("Enter the Name of the Item:");
        sc.nextLine();
        String mainMenuName = sc.nextLine();
        System.out.println("Enter the Price for the Item:");
        Double mainMenuPrice = sc.nextDouble();
        mainMenu.put(mainMenuName, mainMenuPrice);
    }

    private void addDesserts() {
        System.out.println("Enter the Name of the Item:");
        sc.nextLine();
        String dessertName = sc.nextLine();
        System.out.println("Enter the Price for the Item:");
        Double dessertPrice = sc.nextDouble();
        desserts.put(dessertName, dessertPrice);
    }


}
