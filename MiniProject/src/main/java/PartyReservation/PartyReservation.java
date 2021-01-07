package PartyReservation;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

public class PartyReservation extends PartyReservationMain{
    private static final Logger logger = LogManager.getLogger(PartyReservation.class);
    Scanner sc = new Scanner(System.in);
    private PartyReservationMain partyReservationMain;
    public PartyReservation(PartyReservationMain partyReservationMain) {
        super();
        this.partyReservationMain = partyReservationMain;
        partyReservationOperations(partyReservationMain.partyReservationOption);
    }

    private void partyReservationOperations(int partyReservationOption) {
        switch(partyReservationOption) {
            case 1:
                addPartyReservation();
                break;

            case 2:
                deletePartyReservation();
                break;

            case 3:
                updatePartyReservation();
                break;

            case 4:
                showAllPartyReservations();
                break;

            default:
                System.out.println("Please Select a Valid Option");
        }
    }

    private void showAllPartyReservations() {
        if (partyReservationDict.size() == 0) {
            System.out.println("Sorry there are no Reservations added. Add Reservations");
        } else {
            for(String key : partyReservationDict.keySet()) {
                System.out.println(key + "    " + partyReservationDict.get(key));
            }
        }
    }

    private void updatePartyReservation() {
        System.out.println("Enter the Name to Update the Reservation Under:");
        String updateReservationName = sc.nextLine();
        if(partyReservationDict.containsKey(updateReservationName)) {
            System.out.println("Enter the Date to be Updated:");
            String updatedReservationDate = sc.nextLine();
            partyReservationDict.put(updateReservationName, updatedReservationDate);
            logger.info("Updated Party Reservation Made Under The Name Of "+updateReservationName+" To The New Date "+updatedReservationDate);
        } else {
            logger.debug("Cannot Update The Party Reservation, Key: "+updateReservationName+" Does not Exist");
        }
    }

    private void deletePartyReservation() {
        System.out.println("Enter the Name to Delete the Reservation Under:");
        String deleteReservationName = sc.nextLine();
        if(partyReservationDict.containsKey(deleteReservationName)) {
            partyReservationDict.remove(deleteReservationName);
            logger.info("Deleted Party Reservation Made Under The Name Of "+deleteReservationName);
        } else {
            logger.debug("Cannot Delete The Party Reservation, Key: "+deleteReservationName+" Does not Exist");
        }
    }

    private void addPartyReservation() {
        System.out.println("Enter the Name to Book a Reservation Under:");
        String addReservationName = sc.nextLine();
        System.out.println("Enter the Date to Book a Reservation on (MM/DD/YYYY):");
        String addReservationDate = sc.nextLine();
        partyReservationDict.put(addReservationName, addReservationDate);
        logger.info("Added Party Reservation Made Under The Name of "+addReservationName+" For The Date "+addReservationDate);
    }
}
