package Location;

import java.util.ArrayList;

public class LocationMain {
    public static ArrayList<String[]> locations = new ArrayList<>();
    int option;

    public LocationMain() {
    }

    public LocationMain(int option) {
        if(locations.isEmpty()) {
            locations.add(new String[] {"29.5336674","-98.6773674", "9010 Huebner Rd, San Antonio, TX 78240", "885-544-1242"});
            locations.add(new String[] {"30.2554674","-150.6773674", "1080 Charles Rd, Austin, TX 79621", "562-587-9898"});
        }
        this.option = option;

    }


}
