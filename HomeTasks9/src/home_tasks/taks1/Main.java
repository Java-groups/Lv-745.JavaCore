package home_tasks.taks1;

import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        run();
    }

    private static void run() {
        Set<Integer> set1 = createSet();
        Set<Integer> set2 = createSet();
        union(set1, set2);
        intersect(set1, set2);

        outputMap(createMap());
        System.out.println("There are at less two persons with the same firstName ? -- " + uniqueValue(createMap()));
        withoutOrest(createMap());
    }

    private static Set<Integer> createSet() {
        System.out.print("Enter the size of the Set: ");
        int size = sc.nextInt();
        HashSet<Integer> set = new HashSet<>(size);
        System.out.print("Enter String variables: ");
        for (int i = 0; i < size; i++) {
            set.add(sc.nextInt());
        }
        return set;
    }

    private static Map<String, String> createMap() {
        Map<String, String> infoMap = new HashMap<>(10);
        infoMap.put("11", "NazzP");
        infoMap.put("12", "Maksim");
        infoMap.put("13", "Orest");
        infoMap.put("14", "Tom ");
        infoMap.put("15", "Jack ");
        infoMap.put("16", "Nazz");
        infoMap.put("17", "Robert");
        infoMap.put("18", "John ");
        infoMap.put("19", "Leonardo");
        infoMap.put("20", "Leonardo");
        infoMap.put("21", "Jack");

        return infoMap;
    }

    private static void union(Set<Integer> set1, Set<Integer> set2) {
        HashSet<Integer> result = new HashSet<>(set1);
        result.addAll(set2);
        System.out.print("Union operation: " + result + "\n");
    }

    private static void intersect(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> result = new HashSet<>(set1);
        result.retainAll(set2);
        System.out.print("Intersect operation: " + result);
    }

    private static void outputMap(Map<String, String> infoMap) {
        for (Map.Entry<String, String> map : infoMap.entrySet()) {
            System.out.println(map.getKey() + " " + map.getValue());
        }
    }

    private static boolean uniqueValue(Map<String, String> infoMap) {
        HashSet<String> uniqueValues = new HashSet<>(infoMap.values()); // bcz HashSet has only unique values
        System.out.println("HashSet/ unique values: " +uniqueValues);
        return uniqueValues.size() != infoMap.size();
    }

    private static void withoutOrest(Map<String, String> infoMap) {
        infoMap.values().removeIf(firstName -> firstName.equals("Orest"));
        System.out.println("Without Orest" +infoMap);
    }
}
