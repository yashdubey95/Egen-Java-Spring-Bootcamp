package TexasHamBurger;

import Location.Location;
import Location.LocationMain;
import Menu.Menu;
import Menu.MenuMain;
import PartyReservation.PartyReservation;
import PartyReservation.PartyReservationMain;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import java.util.Scanner;

public class Driver {

    private static final Logger logger = LogManager.getLogger(Driver.class);

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to The Texas Hamburger Company Admin Page");
        while(true) {
            System.out.println("Select One of the Following Options(Integer):");
            System.out.println("1. Location \t 2. Menu \t 3. Party Reservation \t 4. Exit");
            int choice = sc.nextInt();
            switch(choice) {
                case 1:
                    logger.info("Selected Option 1 - Location");
                    System.out.println("1. Add New Location \t 2. Delete Location \t 3. Update Location \t 4. Show All Locations");
                    int locOption = sc.nextInt();
                    LocationMain locationMain = new LocationMain(locOption);
                    Location location = new Location(locationMain);
                    break;

                case 2:
                    logger.info("Selected Option 2 - Menu");
                    System.out.println("1. Add New Menu Item \t 2. Delete Menu Item \t 3. Update Menu Item \t 4. Show All Menus");
                    int menuOption = sc.nextInt();
                    MenuMain menuMain = new MenuMain(menuOption);
                    Menu menu = new Menu(menuMain);
                    break;

                case 3:
                    logger.info("Selected Option 3 - Party Reservation");
                    System.out.println("1. Add New Party Reservation \t 2. Delete Party Reservation \t 3. Update Party Reservation \t 4. Show All Reservations");
                    int partyReservationOption = sc.nextInt();
                    PartyReservationMain partyReservationMain = new PartyReservationMain(partyReservationOption);
                    PartyReservation partyReservation = new PartyReservation(partyReservationMain);
                    break;

                case 4:
                    logger.info("Selected Option 4 - Exit");
                    System.out.println("Exiting the Admin Page");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Please Select a Valid Input");
                    break;
            }
        }
    }
}


