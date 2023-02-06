public class IntegerSorting {

    private int first;
    private int second;

    public int getFirst() {
        return first;
    }

    public void setFirst(int first) {
        this.first = first;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public int getThird() {
        return third;
    }

    public void setThird(int third) {
        this.third = third;
    }

    public int getFourth() {
        return fourth;
    }

    public void setFourth(int fourth) {
        this.fourth = fourth;
    }

    public int getFifth() {
        return fifth;
    }

    public void setFifth(int fifth) {
        this.fifth = fifth;
    }

    private int third;
    private int fourth;
    private int fifth;

    public IntegerSorting(int first, int second, int third, int fourth, int fifth) {
        this.first = first;
        this.second = second;
        this.third = third;
        this.fourth = fourth;
        this.fifth = fifth;

    }

    public void solutionEven() {
        int[] array = {first, second, third, fourth, fifth};
        int counter = 0;
        int answer = 0;

        for(int i = 0; i < array.length; i++) {
            if(array[i] >= 0) {
                counter = counter + 1;
                answer = array[i];
            }
            if(counter == 2) {
                System.out.println("Second even integer in array - " + answer);

            }
        }
    }

    public void solutionMin() {
        int[] array = {first, second, third, fourth, fifth};
        int max = array[0];
        int imax = 0;
        int i = 0;
        while (i < array.length) {
            if (array[i] > max) {
                max = array[i];
                imax = i;
            } i++;
        }
        System.out.print("Maximum = " + max);
        System.out.println(" is in " + (imax + 1) + " place");

    }

}
