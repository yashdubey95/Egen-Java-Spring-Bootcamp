package Reservation;

import java.util.Scanner;

public class PartyReservation extends PartyReservationMain{
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
        } else {
            System.out.println("The Name You Entered Does not Exists");
        }
    }

    private void deletePartyReservation() {
        System.out.println("Enter the Name to Delete the Reservation Under:");
        String deleteReservationName = sc.nextLine();
        try{
            partyReservationDict.remove(deleteReservationName);
        } catch (Exception e) {
            System.out.println("The Name You Entered Does not Exists");
        }
    }

    private void addPartyReservation() {
        System.out.println("Enter the Name to Book a Reservation Under:");
        String addReservationName = sc.nextLine();
        System.out.println("Enter the Date to Book a Reservation on (MM/DD/YYYY):");
        String addReservationDate = sc.nextLine();
        partyReservationDict.put(addReservationName, addReservationDate);
    }
}
