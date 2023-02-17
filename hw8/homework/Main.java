import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Main{
    private static List<Integer> myCollection = new ArrayList<>();
    private static List<Integer> list1 = new ArrayList<>();
    public static void main(String[ ] args) {
        System.out.println("--------FIRST TASK. Fill myCollection with 10 integers ----------");
        myCollection.addAll(fillCollection(10));
        System.out.println(myCollection);
        System.out.println("--------SECOND TASK. Swap the maximum and minimum elements in the list----------");
        swapMaxMin();
        System.out.println(myCollection);
        System.out.println("--------THIRD TASK. Insert a random three-digit number before the first negative element of the list----------");
        insertThreeBeforeNegative();
        System.out.println(myCollection);
        System.out.println("--------FOURTH TASK. Insert a zero between all neighboring elements with different signs----------");
        insertZero();
        System.out.println(myCollection);
        System.out.println("--------FIFTH TASK. Copy the first k elements to the list1, in direct order, the rest in reverse order.----------");
        int k = 4;
        list1.addAll(copyToList1(k));
        System.out.println(list1);;
        System.out.println("--------SIXTH TASK. In a list myCollection remove the last even element.----------");
        removeLastEven();
        System.out.println(myCollection);
        System.out.println("--------SEVENTH TASK. Remove the element following the first minimum.----------");
        removeNextToMin();
        System.out.println(myCollection);
    }

    private static List<Integer> fillCollection(int countOfElements){
        List<Integer> myLocalCollection = new ArrayList<>();
        for (int i = 0; i < countOfElements; i++) {
            myLocalCollection.add(randomInt(-100, 100));
        }
        return myLocalCollection;
    }

    private static void swapMaxMin(){
        Integer max = Collections.max(myCollection);
        Integer min = Collections.min(myCollection);
        int maxIndex = myCollection.indexOf(max);
        int minIndex = myCollection.indexOf(min);
        myCollection.set(maxIndex,min);
        myCollection.set(minIndex,max);
        System.out.println("Min: "+ min+" Max: "+max);
    }
    private static void insertThreeBeforeNegative(){
        int indexOfNegative = -1;
        for (int i = 0; i < myCollection.size(); i++) {
            if (myCollection.get(i) <0){
                indexOfNegative = i;
                break;
            }
        }
        if (indexOfNegative!=-1) {
            myCollection.add(indexOfNegative, 103);
            myCollection.add(indexOfNegative, 102);
            myCollection.add(indexOfNegative, 101);
        } else {
            System.out.println("Nothing to do. There isn't any negative number");
        }
    }

    private static void insertZero(){
        for (int i = 1; i < myCollection.size(); i++) {
            if (myCollection.get(i)*myCollection.get(i-1) <0){
                myCollection.add(i, 0);
            }
        }
    }
    private static List<Integer> copyToList1(int k){
        List<Integer> myLocalCollection = new ArrayList<>();
        if (k<myCollection.size()) {
            for (int i = 0; i < k; i++) {
                myLocalCollection.add(myCollection.get(i));
            }
            for (int i = 1; i <= myCollection.size() - k; i++) {
                myLocalCollection.add(myCollection.get(myCollection.size() - i));
            }
        } else {
            System.out.println("K is too big. It have to be equal or smaller then myCollection size/");
        }
        return myLocalCollection;
    }

    private static void removeLastEven(){
        for (int i = myCollection.size()-1; i >=0; i--) {
            if (myCollection.get(i)%2==0&&myCollection.get(i)!=0){
                myCollection.remove(i);
                return;
            }
        }
        System.out.println("No even numbers");
    }
    private static void removeNextToMin(){
        Integer min = Collections.min(myCollection);
        int minIndex = myCollection.indexOf(min);
        if (minIndex!=myCollection.size()-1){
            myCollection.remove(minIndex+1);
        } else{
            System.out.println("Min is last");
        }

    }
    private static int randomInt(int min, int max){
        return ThreadLocalRandom.current().nextInt(min, max + 1);
    }
}
