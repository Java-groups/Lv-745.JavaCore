import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        run();
    }

    public static void run() {
        Set<Integer> set1 = new HashSet<>();
        set1.add(101);
        set1.add(102);
        set1.add(103);
        System.out.println("Set 1: " + set1);

        Set<Integer> set2 = new HashSet<>();
        set2.add(103);
        set2.add(104);
        set2.add(105);
        System.out.println("Set 2: " + set2);

        Set<Integer> union = union(set1, set2);
        System.out.println("Union: " + union);
        Set<Integer> intersect = intersect(set1, set2);
        System.out.println("Intersection: " + intersect);

    }
    public static <T> Set<T> union(Set<T> set1, Set<T> set2) {
        Set<T> unionSet = new HashSet<>(set1);
        unionSet.addAll(set2);
        return unionSet;
    }

    public static <T> Set<T> intersect(Set<T> set1, Set<T> set2) {
        Set<T> intersectSet = new HashSet<>(set1);
        intersectSet.retainAll(set2);
        return intersectSet;
    }
}