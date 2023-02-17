import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Appl{
    private static List<Integer> myCollection = new ArrayList<>();
    private static List<Integer> newCollection = new ArrayList<>();
    public static void main(String[ ] args) {
        System.out.println("--------FIRST TASK. Randomly generated collection----------");
        myCollection.addAll(fillCollection());
        System.out.println(myCollection);
        System.out.println("--------SECOND TASK. Indexes of elements, which are greater then 5----------");
        newCollection.addAll(indexOfGreater20(myCollection));
        System.out.println(newCollection);
        System.out.println("--------THIRD TASK. Remove elements, which are greater then 20----------");
        myCollection.removeIf(i->i>20);
        System.out.println(myCollection);
        System.out.println("--------FOURTH TASK. Insert elements 1, -3, -4 in positions 2, 8, 5----------");
        insertThreeElements();
        printResult();
        System.out.println("--------FIFTH TASK. Sort collection----------");
        Collections.sort(myCollection);
        System.out.println(myCollection);
    }

    private static List<Integer> fillCollection(){
        List<Integer> myLocalCollection = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            myLocalCollection.add(randomInt(1, 35));
        }
        return myLocalCollection;
    }
    private static List<Integer> indexOfGreater20(List<Integer> myCollection){
        List<Integer> myLocalCollection = new ArrayList<>();
        for (int i = 0; i < myCollection.size(); i++) {
            if (myCollection.get(i)>5){
                myLocalCollection.add(i);
            }
        }
        return myLocalCollection;
    }
    private static void insertThreeElements(){
        if (myCollection.size()>=3) {
            myCollection.set(2,1);
        }else if (myCollection.size()==2) {myCollection.add(1,1);}

        if (myCollection.size()>=6) {
            myCollection.set(5,-4);
        }else if (myCollection.size()==5) {myCollection.add(5,-4);}

        if (myCollection.size()>=9) {
            myCollection.set(8,-3);
        }else if (myCollection.size()==9) {myCollection.add(8,-3);}
    }

    private static void printResult(){
        for (int i = 0; i < myCollection.size(); i++) {
                System.out.println("position – " + i +" value of element – "+myCollection.get(i));
        }
    }
    private static int randomInt(int min, int max){
        return ThreadLocalRandom.current().nextInt(min, max + 1);
    }
}
