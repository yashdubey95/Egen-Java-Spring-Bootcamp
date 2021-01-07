package Menu;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

public class Menu extends MenuMain{
    private static final Logger logger = LogManager.getLogger(Menu.class);
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
        if(specialMenu.containsKey(updateSpecialItem)) {
            System.out.println("Enter the New Price for "+updateSpecialItem);
            Double updatedSpecialPrice = sc.nextDouble();
            specialMenu.put(updateSpecialItem, updatedSpecialPrice);
            logger.info("Updated Special Menu Item: "+ updateSpecialItem+" Price to: "+updatedSpecialPrice);
        } else {
            logger.debug("Cannot Update The Special Menu Key: "+updateSpecialItem+" Does not Exist");
        }
    }

    private void updateMainMenu() {
        System.out.println("Enter the name of the Main Menu Item You Want to Update:");
        sc.nextLine();
        String updateMainMenuItem = sc.nextLine();
        if(mainMenu.containsKey(updateMainMenuItem)) {
            System.out.println("Enter the New Price for "+updateMainMenuItem);
            Double updatedMainMenuPrice = sc.nextDouble();
            mainMenu.put(updateMainMenuItem, updatedMainMenuPrice);
            logger.info("Updated Main Menu Item: "+ updateMainMenuItem+" Price to: "+updatedMainMenuPrice);
        } else {
            logger.debug("Cannot Update The Main Menu Key: "+updateMainMenuItem+" Does not Exist");
        }
    }

    private void updateDesserts() {
        System.out.println("Enter the name of the Dessert Item You Want to Update:");
        sc.nextLine();
        String updateDessertItem = sc.nextLine();
        if(desserts.containsKey(updateDessertItem)) {
            System.out.println("Enter the New Price for "+updateDessertItem);
            Double updatedDessertPrice = sc.nextDouble();
            desserts.put(updateDessertItem, updatedDessertPrice);
            logger.info("Updated Dessert Menu Item: "+ updateDessertItem+" Price to: "+updatedDessertPrice);
        } else {
            logger.debug("Cannot Update The Dessert Menu Key: "+updateDessertItem+" Does not Exist");
        }
    }

    private void deleteSpecialMenu() {
        System.out.println("Enter the name of the Special Item You Want to Delete:");
        sc.nextLine();
        String deleteSpecialItem = sc.nextLine();
        if(specialMenu.containsKey(deleteSpecialItem)) {
            specialMenu.remove(deleteSpecialItem);
            logger.info("Deleted Special Menu Item: "+ deleteSpecialItem);
        } else {
            logger.debug("Cannot Delete The Special Menu Key: "+deleteSpecialItem+" Does not Exist");
        }
    }

    private void deleteDesserts() {
        System.out.println("Enter the name of the Special Item You Want to Delete:");
        sc.nextLine();
        String deleteDessertItem = sc.nextLine();
        if(desserts.containsKey(deleteDessertItem)) {
            desserts.remove(deleteDessertItem);
            logger.info("Deleted Main Menu Item: "+ deleteDessertItem);
        } else {
            logger.debug("Cannot Delete The Special Menu Key: "+deleteDessertItem+" Does not Exist");
        }
    }

    private void deleteMainMenu() {
        System.out.println("Enter the name of the Special Item You Want to Delete:");
        sc.nextLine();
        String deleteMainItem = sc.nextLine();
        if(mainMenu.containsKey(deleteMainItem)) {
            mainMenu.remove(deleteMainItem);
            logger.info("Deleted Dessert Menu Item: "+ deleteMainItem);
        } else {
            logger.debug("Cannot Delete The Special Menu Key: "+deleteMainItem+" Does not Exist");
        }
    }

    private void addSpecialMenu() {
        System.out.println("Enter the Name of the Item:");
        sc.nextLine();
        String specialName = sc.nextLine();
        System.out.println("Enter the Price for the Item:");
        Double specialPrice = sc.nextDouble();
        specialMenu.put(specialName, specialPrice);
        logger.info("Added Special Menu Item: "+specialName+" At The Price of: "+specialPrice);
    }

    private void addMainMenu() {
        System.out.println("Enter the Name of the Item:");
        sc.nextLine();
        String mainMenuName = sc.nextLine();
        System.out.println("Enter the Price for the Item:");
        Double mainMenuPrice = sc.nextDouble();
        mainMenu.put(mainMenuName, mainMenuPrice);
        logger.info("Added Main Menu Item: "+mainMenuName+" At The Price of: "+mainMenuPrice);
    }

    private void addDesserts() {
        System.out.println("Enter the Name of the Item:");
        sc.nextLine();
        String dessertName = sc.nextLine();
        System.out.println("Enter the Price for the Item:");
        Double dessertPrice = sc.nextDouble();
        desserts.put(dessertName, dessertPrice);
        logger.info("Added Dessert Menu Item: "+dessertName+" At The Price of: "+dessertPrice);
    }

}

