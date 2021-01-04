package MiniProject;

import java.util.Arrays;
import java.util.Scanner;

public class Location extends LocationMain{
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
        locations.add(new String[] {latitude, longitude, address, contactNo});
    }


}
