package Reservation;

import java.util.HashMap;

public class PartyReservationMain {
    int partyReservationOption;
    public static HashMap<String, String> partyReservationDict = new HashMap<>();

    public PartyReservationMain() {
    }

    public PartyReservationMain(int partyReservationOption) {
        if(partyReservationDict.isEmpty()) {
            partyReservationDict.put("Abhilash Sulibela", "11/01/2021");
            partyReservationDict.put("Siddhesh Rao", "13/01/2021");
            partyReservationDict.put("Viraj Thakur", "15/01/2021");
            partyReservationDict.put("Sushant Deshmukh", "16/01/2021");
            partyReservationDict.put("Varun Pande", "14/01/2021");
        }
        this.partyReservationOption = partyReservationOption;
    }


}
