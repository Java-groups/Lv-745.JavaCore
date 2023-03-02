package IntegerNambers;

public class IntegerNumbers {
    public static void main(String[] args) {
        int [] numbers ={1,2,3,4,5,6,7,8,9,10};
        int sum = 0;
        for (int i = 0 ;i < numbers.length;i++){
            sum += numbers[i];
        }
        System.out.println("Sum" + sum);


    }
}
//    int sum = 0;
//for (int i = 0; i < arr.length; i++) { sum += arr[i];}
//        System.out.println("Sum = " + sum);