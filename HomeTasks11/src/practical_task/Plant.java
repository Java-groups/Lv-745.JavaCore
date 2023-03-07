package practical_task;

public class Plant {
    int size;
    Color color ;
    Type type;

    public Plant(int size, String color, String type) throws ColorException, TypeException {
        this.size = size;
        this.setColorByString(color);
        this.setTypeByString(type);
    }

    public void setColorByString(String color) throws ColorException {
        if (color == "RED" || color == "GREEN" || color == "BLUE" || color == "PURPLE"){
            this.color = Color.valueOf(color);
        } else {
            throw new ColorException("Invalid color: " + color);
        }

    }

    public void setTypeByString(String type) throws TypeException {
        if (type == "TREES" || type == "CLIMBERS" || type == "CREEPERS") {
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
