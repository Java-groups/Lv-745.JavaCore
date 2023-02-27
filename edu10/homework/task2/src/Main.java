import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        run();
    }

    public static void run() {
        Map<String, String> personMap = new HashMap<>();
        personMap.put("Daynega", "Oleg");
        personMap.put("Stefunckuk", "Karina");
        personMap.put("Boyko", "Orest");
        personMap.put("Malanchuk", "Dmitro");
        personMap.put("Shkodina", "Viktoriya");
        personMap.put("Moisiychuk", "Vadim");
        personMap.put("Zapisochna", "Viktoriya");
        personMap.put("Tkach", "Ior");
        personMap.put("Koshevuy", "Ruslan");
        personMap.put("Moldovan", "Inna");
        System.out.println("Persons data: ");
        for (Map.Entry person : personMap.entrySet()) {
            System.out.println(person.getKey() + " " + person.getValue());
        }
        boolean sameName = personMap.values().stream().distinct().count() < personMap.values().size();
        System.out.println("There are at less two persons with the same first name among these 10 people?");
        System.out.println(sameName);
        System.out.println("Remove from the map person whose first name is ”Orest”.");
        personMap.values().removeIf(firstName -> firstName.equals("Orest"));
        for (Map.Entry person : personMap.entrySet()) {
            System.out.println(person.getKey() + " " + person.getValue());
        }
    }
}