import java.util.HashMap;
import java.util.Map;

public class Location{
    private final int locationId;
    private final String decription;
    private final Map<String, Integer> exits;


    public Location(int locationId, String description) {
        this.locationId = locationId;
        this.decription = description;
        this.exits = new HashMap<String, Integer>();
        this.exits.put("Q", 0);
    }

    public void addExit(String direction, int location){
        exits.put(direction, location);
    }


    public int getLocationId() {
        return this.locationId;
    }

    public String getDescription() {
        return this.decription;
    }

    public Map<String,Integer> getExits() {
        return new HashMap<String, Integer>(exits);
    }


}