package com.company;

/**
 * Created by brusk on 31.03.2016.
 */
public class Adress {

    private String street;
    private String zip;


    public Adress(String zip, String street) {
        this.zip = zip;
        this.street = street;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    @Override
    public String toString() {
        return "Adress{" +
                "street='" + street + '\'' +
                ", zip=" + zip +
                '}';
    }
}
