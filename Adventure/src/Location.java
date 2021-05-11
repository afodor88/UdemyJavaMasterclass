import java.util.HashMap;
import java.util.Map;

public class Location{
    private final int locationId;
    private final String description;
    private final Map<String, Integer> exits;


    public Location(int locationId, String description, Map<String, Integer> exits) {
        this.locationId = locationId;
        this.description = description;
        if(exits != null){
            this.exits = new HashMap<>(exits);
        } else {
            this.exits = new HashMap<>();
        }
        this.exits.put("Q", 0);
    }

    // public void addExit(String direction, int location){
    //     exits.put(direction, location);
    // }


    public int getLocationId() {
        return this.locationId;
    }

    public String getDescription() {
        return this.description;
    }

    public Map<String,Integer> getExits() {
        return new HashMap<String, Integer>(exits);
    }


}