public abstract class Staff extends Person {

    public Staff() {
    }

    public Staff(String name) {
        super(name);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    public abstract int salary();
}
