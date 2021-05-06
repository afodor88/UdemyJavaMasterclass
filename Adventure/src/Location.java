import java.util.HashMap;
import java.util.Map;

public class Location{
    private final int locationId;
    private final String decription;
    private final Map<String, Integer> exits;


    public Location(int locationId, String decription) {
        this.locationId = locationId;
        this.decription = decription;
        this.exits = new HashMap<String, Integer>();
    }

    public void addExit(String direction, int location){
        exits.put(direction, location);
    }


    public int getLocationId() {
        return this.locationId;
    }

    public String getDecription() {
        return this.decription;
    }

    public Map<String,Integer> getExits() {
        return new HashMap<String, Integer>(exits);
    }


}