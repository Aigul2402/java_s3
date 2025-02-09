
import java.util.ArrayList;
import java.util.List;

public class Task2 {

public static void main(String[] args) {
    List<String> planets = List.of("Сатурн","Луна","Земля","Сатурн","Венера");
    List<Integer> counters = new ArrayList<>();
    List<String> uniquePlanets = new ArrayList<>();

    for (int i = 0; i < planets.size(); i++) {
        String planet = planets.get(i);
        int position = uniquePlanets.indexOf(planet);
        System.out.println("uniquePlanets" +uniquePlanets);
        System.out.println("planet " + planet );
        System.out.println("position " + position );
        if (position>=0) {
            counters.set(position,counters.get(position)+1);
            System.out.println(counters);}
        else{
            uniquePlanets.add(planet);
            counters.add(1);
            System.out.println("counters" +counters);        }

        }
        // printPlanetCount(uniquePlanets,counters);
        
    }



private static void printPlanetCount(List<String> planets, List<Integer> counts){
    for (int i = 0; i < planets.size(); i++) {
        System.out.printf("%10s: %3d%n", planets.get(i), counts.get(i));
        
    }
}
}
