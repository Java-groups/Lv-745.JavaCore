public class Plant {
    private int size;
    private Color color;
    private Tyype type;

    public Plant(int size, Color color, Tyype type) throws ColorException, TypeException {
        this.size = size;
        this.color = color;
        this.type = type;
    }


    private Color colorStrToEnum(String color) throws ColorException {
        switch (color.toLowerCase()) {
            case "blue":
                return Color.Blue;
            case "red":
                return Color.Red;
            case "white":
                return Color.White;
            case "green":
                return Color.Green;
            case "black":
                return Color.Black;
            case "yellow":
                return Color.Yellow;
            default:
                throw new ColorException("You can choose only among white, red, blue, green, black, yellow color.");
        }
    }

    private Tyype typeStrToEnum(String type) throws TypeException {
        switch (type.toLowerCase()) {
            case "flower":
                return Tyype.Flower;
            case "tree":
                return Tyype.Tree;
            case "shrub":
                return Tyype.Shrub;
            default:
                throw new TypeException("You can choose only among flower, tree, shrub.");
        }
    }

    @Override
    public String toString() {
        return "Plant{" +
                "size=" + size +
                ", color=" + color +
                ", type=" + type +
                '}';
    }
}
