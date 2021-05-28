import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class App {
    private static Map<String, HeavenlyBody> solarSystem = new HashMap<>();
    private static Set<HeavenlyBody> planets = new HashSet<>();
    public static void main(String[] args) throws Exception {
        HeavenlyBody temp = new Planet("Mercury", 88);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        temp = new Planet("Venus", 225);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        temp = new Planet("Earth", 365);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        HeavenlyBody tempMoon = new Moon("Moon", 27);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addSatellite(tempMoon);

        temp = new Planet("Mars", 687);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        tempMoon = new Moon("Phobos", 0.3);
        solarSystem.put(tempMoon.getName(), tempMoon); 
        temp.addSatellite(tempMoon); //temp is still Mars

        temp = new Planet("Jupiter", 4332);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        tempMoon = new Moon("Io", 1.8);
        solarSystem.put(tempMoon.getName(), tempMoon); 
        temp.addSatellite(tempMoon); //temp is still Jupiter

        tempMoon = new Moon("Europa", 3.5);
        solarSystem.put(tempMoon.getName(), tempMoon); 
        temp.addSatellite(tempMoon); //temp is still Jupiter

        tempMoon = new Moon("Ganymede", 7.1);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addSatellite(tempMoon); // temp is still Jupiter

        tempMoon = new Moon("Callisto", 16.7);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addSatellite(tempMoon); // temp is still Jupiter

        temp = new Planet("Saturn", 10759);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        temp = new Planet("Uranus", 30660);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        temp = new Planet("Neptune", 165);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        temp = new Planet("Pluto", 248);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        System.out.println("Planets");
        for(HeavenlyBody planet : planets) {
            System.out.println("\t" + planet.getName());
        }

        HeavenlyBody body = solarSystem.get("Mars");
        System.out.println("Moon of " + body.getName());

        for(HeavenlyBody jupiterMoon: body.getSatelittes()){
            System.out.println("\t" + jupiterMoon.getName());
        }

        Set<HeavenlyBody> moons = new HashSet<>();
        for(HeavenlyBody planet : planets){
            moons.addAll(planet.getSatelittes());
        }

        System.out.println("All Moons");
        for(HeavenlyBody moon : moons){
            System.out.println("\t" + moon.getName());
        }

        HeavenlyBody pluto = new Dwarf_Planet("Pluto", 842);
        planets.add(pluto);

        for(HeavenlyBody planet: planets){
            System.out.println(planet);
            // System.out.println(planet.getName() + ": " + planet.getOrbitalPeriod());
        }

        // Object o = new Object();
        // o.equals(o);
        // "pluto".equals("");

        HeavenlyBody earth1 = new Planet("Earth", 365);
        HeavenlyBody earth2 = new Planet("Earth", 365);
        System.out.println(earth1.equals(earth2));
        System.out.println(earth2.equals(earth1));
        System.err.println(earth1.equals(pluto));
        System.err.println(pluto.equals(earth1));


    }
}
