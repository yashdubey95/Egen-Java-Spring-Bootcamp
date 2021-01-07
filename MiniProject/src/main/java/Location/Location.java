package Location;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;
import java.util.Scanner;

public class Location extends LocationMain{
    private static final Logger logger = LogManager.getLogger(Location.class);
    Scanner sc = new Scanner(System.in);
    private LocationMain locationMain;
    public Location(LocationMain locationMain) {
        super();
        this.locationMain = locationMain;
        locationOperations(locationMain.option);
    }

    public void locationOperations(int option) {
        switch (option) {
            case 1:
                addNewLocation();
                break;

            case 2:
                deleteLocation();
                break;

            case 3:
                updateLocation();
                break;

            case 4:
                showAllLocations();
                break;

            default:
                System.out.println("Please Select a Valid Option");
                break;
        }
    }

    private void showAllLocations() {
        for (String[] value : locations) {
            System.out.println(Arrays.toString(value));
        }

    }

    private void updateLocation() {
        System.out.println("Please Enter the Contact No. of the Location You Want to Update:");
        String updateContactNo = sc.nextLine();
        for (int i = 0; i < locations.size(); i++) {
            String[] currLoc = locations.get(i);
            if (currLoc[currLoc.length - 1].equals(updateContactNo)) {
                System.out.println("Please Enter the New Contact No.:");
                String newContactNo = sc.nextLine();
                currLoc[currLoc.length - 1] = newContactNo;
                locations.set(i, currLoc);
                logger.info("Location Contact Updated From "+updateContactNo+" To "+newContactNo);
            }

        }
    }

    private void deleteLocation() {
        System.out.println("Please Enter the Contact No. of the Location You Want to Delete");
        String updateContactNo = sc.nextLine();
        for (int i = 0; i < locations.size(); i++) {
            String[] currLoc = locations.get(i);
            if (currLoc[currLoc.length - 1].equals(updateContactNo)) {
                locations.remove(i);
                logger.info("Deleted Location: "+ Arrays.toString(currLoc));
            }
        }
    }

    private void addNewLocation() {
        System.out.println("Please Enter New Locations Latitude:");
        String latitude = sc.nextLine();
        System.out.println("Please Enter New Locations Longitude:");
        String longitude = sc.nextLine();
        System.out.println("Please Enter New Locations Street Address:");
        String address = sc.nextLine();
        System.out.println("Please Enter New Locations Contact No.:");
        String contactNo = sc.nextLine();
        String[] locationDetails = {latitude, longitude, address, contactNo};
        locations.add(locationDetails);
        logger.info("Added New Location: "+Arrays.toString(locationDetails));
    }

}

