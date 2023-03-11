package com.softserve.edu06.hwtask1;

    public class Employee implements Comparable<Employee>{
        private String name;
        private String employeeID;
        private double monthlyWage;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
        public String getEmployeeID() {
            return employeeID;
        }

        public void setEmployeeID(String employeeID) {
            this.employeeID = employeeID;
        }

        public double getMonthlyWage() {
            return monthlyWage;
        }

        public void setMonthlyWage(double monthlyWage) {
            this.monthlyWage = monthlyWage;
        }


       @Override
        public int compareTo(Employee o) {
            if (getMonthlyWage()<o.getMonthlyWage()){
                return 1;
            } else if (getMonthlyWage()==o.getMonthlyWage()){
                return 0;
            } else {
                return -1;
            }
        }

        @Override
        public String toString() {
            return "Employee{" +
                    "name='" + name + '\'' +
                    ", employeeID='" + employeeID + '\'' +
                    ", monthlyWage=" + monthlyWage +
                    '}';
        }
    }

