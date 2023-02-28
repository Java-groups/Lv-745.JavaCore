public class Main {
    public static void main(String[] args) {
try {
    System.out.println("The area of a rectangle - " + squareRectangle(-8, 3));
}catch (MyException e){
    System.out.println(e.getMessage());
}
    }
    public static int squareRectangle (int x, int y) throws MyException {
        if(x<0 || y<0) {
            throw new MyException("Some of value is negative");
        }
        return x*y;
    }
}