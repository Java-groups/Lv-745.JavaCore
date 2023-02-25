public class Plant {
    private int size;
    private Color color;
    private Type type;

    public Plant(int size, String color, String type) throws ColorException, TypeException {
        this.setSize(size);
        this.setColorByString(color);
        this.setTypeByString(type);
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setColorByString(String color) throws ColorException {
       if (color == "RED" || color == "ORANGE" || color == "YELLOW" || color == "GREEN" || color == "BLUE" || color == "PURPLE"){
           this.color = Color.valueOf(color);
       } else {
           throw new ColorException("Invalid color: " + color);
       }

    }

    public void setTypeByString(String type) throws TypeException {
        if (type == "FLOWER" || type == "TREE" || type == "SHRUB") {
            this.type = Type.valueOf(type);
        } else {
            throw new TypeException("Invalid type: " + type);
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

