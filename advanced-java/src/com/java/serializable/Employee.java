package com.java.serializable;

import java.io.Serial;
import java.io.Serializable;

public class Employee implements Serializable {

    /*
        to have a control on state of the object, we add the serial version UID. Java uses to id to identify that the correct
        object has been transferred over the network and received the same. Value is incremented by one, if used multiple times.
     */
    @Serial
    private static final long serialVersionUID = 1L;

    private String name;
    private String empId;
    private int age;
    private String designation;

    transient double salary; // This will not be serialized

    public Employee(String name, String empId, int age, String designation, double salary) {
        this.name = name;
        this.empId = empId;
        this.age = age;
        this.designation = designation;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", empId='" + empId + '\'' +
                ", age=" + age +
                ", designation='" + designation + '\'' +
                ", salary=" + salary +
                '}';
    }
}
