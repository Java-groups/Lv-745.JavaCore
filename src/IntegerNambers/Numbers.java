package IntegerNambers;

public class Numbers {
    public static void main(String[] args) {
        int[][] numbers = {{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, {11, 12, 14, 15, 13}, {19, 20}};
        for (int i=0; i < numbers[i].length;i++){
            for (int j=0; j<numbers[i].length; j++){
                System.out.println(numbers[i][j]);
            }
        }

    }
}

//
//public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in)
//        int number [] = {1,2,3,4,5,6,78,9,10};
//        System.out.println();
//        int sum = 0;
//        for (int i = 0; i < number.length; i++) { sum += arr[i];}
//        System.out.println("Sum = " + sum);
//
