public class Plant {
    private int size;
    private Color color;
    private Type type;

    public void setSize(int size) {
        this.size = size;
    }

    public void setColorByString(String color) throws ColorException {
        if (color == "RED" || color == "ORANGE" || color == "YELLOW" || color == "GREEN"
                || color == "BLUE" || color == "INDIGO" || color == "VIOLET") {
            this.color = Color.valueOf(color);
        }else{
            throw new ColorException("Invalid color: " + color);
        }
    }

    public void setTypeByString(String type) throws TypeException {
        if (type.equals("MOSSE") || type.equals("FERN") || type.equals("FLOWERING")
                || type.equals("GYMNOSPERM")) {
            this.type = Type.valueOf(type);
        } else {
            throw new TypeException("Invalid type: " + type);
        }
    }

    public Plant(){}

    public Plant(int size, String color, String type) throws ColorException, TypeException {
        setSize(size);
        setColorByString(color);
        setTypeByString(type);
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
