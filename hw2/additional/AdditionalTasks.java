package additional;

//https://www.codewars.com/kata/lombok-encapsulation
class EncapsulationDemo {
    private int number;
    private String stringValue;
    private Object anObject;

    public void setNumber(int number) {
        this.number = number;
    }
    public int getNumber() {
        return number;
    }

    public void setStringValue(String stringValue) {
        this.stringValue = stringValue;
    }
    public String getStringValue() {
        return stringValue;
    }

    public void setAnObject(Object anObject) {
        this.anObject = anObject;
    }
    public Object getAnObject() {
        return anObject;
    }

    EncapsulationDemo() {

    }

    EncapsulationDemo(int number, String stringValue, Object anObject) {

        setNumber(number);
        setStringValue(stringValue);
        setAnObject(anObject);
    }

}

//https://www.codewars.com/kata/fixme-static-electrickery/
class Dinglemouse {

    public static Dinglemouse INST = new Dinglemouse();

    private static int ONE_HUNDRED = 100;

    public static int value = ONE_HUNDRED;

    private Dinglemouse() {
        value = ONE_HUNDRED;
    }

    public int plus100(int n) {
        return value + n;
    }

}

//https://www.codewars.com/kata/building-blocks/
class Block {
    // Good Luck!
    private int width;
    private int length;
    private int height;


    public void setWidth(int width) {
        this.width = width;
    }

    public int getWidth() {
        return width;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }


    public void setHeight(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    Block(int[] array) {
        setWidth(array[0]);
        setLength(array[1]);
        setHeight(array[2]);
    }


    public int getVolume() {
        return width * length * height;
    }

    public int getSurfaceArea() {
        return 2 * (length * width + length * height + width * height);
    }
}