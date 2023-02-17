package practical_task;

public class Department implements Cloneable {

    public Department(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    private final String name;

    private Address address;

    @Override
    public String toString() {
        return "Department{" +
                "name='" + name + '\'' +
                ", address=" + address +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Department copyOfDepartment = (Department) super.clone();
        copyOfDepartment.address = (Address) copyOfDepartment.address.clone();
        return copyOfDepartment;
    }


    static class Address implements Cloneable {

        private final String city;

        private final String street;

        private final int building;

        public Address(String city, String street, int building) {
            this.city = city;
            this.street = street;
            this.building = building;
        }

        @Override
        public String toString() {
            return "Address{" +
                    "city='" + city + '\'' +
                    ", street='" + street + '\'' +
                    ", building=" + building +
                    '}';
        }

        @Override
        protected Object clone() throws CloneNotSupportedException {
            return super.clone();
        }

    }

}

