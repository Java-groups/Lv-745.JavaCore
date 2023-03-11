package com.softserve.edu07.practical;

public class Department implements Cloneable {
    private String name;
    private Address address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
    public Department(){ }

    public Department(String name, Address address) {
        setName(name);
        setAddress(address);
    }

    //clone() method with `protected` access modifier won't work, so replaced with `public`
    @Override
    public Object clone() throws CloneNotSupportedException {
        Department copyOfDepartment = (Department) super.clone();
        copyOfDepartment.address = (Address) copyOfDepartment.address.clone();
        return copyOfDepartment;
    }

    @Override
    public String toString() {
        return "Department{" +
                "name='" + getName() + '\'' +
                ", address=" + getAddress() +
                '}';
    }

    public static class Address implements Cloneable{
        private String city;
        private String street;
        private int building;

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getStreet() {
            return street;
        }

        public void setStreet(String street) {
            this.street = street;
        }

        public int getBuilding() {
            return building;
        }

        public void setBuilding(int building) {
            this.building = building;
        }
        public Address(){ }
        public Address(String city, String street, int building) {
            setCity(city);
            setStreet(street);
            setBuilding(building);
        }

        @Override
        protected Object clone() throws CloneNotSupportedException {
            return super.clone();
        }

        @Override
        public String toString() {
            return "Address{" +
                    "city='" + getCity() + '\'' +
                    ", street='" + getStreet() + '\'' +
                    ", building=" + getBuilding() +
                    '}';
        }
    }
}