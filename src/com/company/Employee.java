package com.company;

/**
 * Created by brusk on 31.03.2016.
 */
public class Employee {

    private  int ID;
    private String name;
    private String lastName;
    private Adress adress; // Here this class dependency to adress class

    public Employee(int ID, String name, String lastName, Adress adress) {
        this.ID = ID;
        this.name = name;
        this.lastName = lastName;
        this.adress = adress;
    }

    public Adress getAdress() {
        return adress;
    }

    public void setAdress(Adress adress) {
        this.adress = adress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", adress=" + adress +
                '}';
    }
}
