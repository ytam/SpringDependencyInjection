package com.company;

/**
 * Created by brusk on 31.03.2016.
 */
public class ConfigurationInjection {

    public static void main(String[] args) {

        System.out.println(new Employee(1,"Yıldırım","TAM",new Adress("Tutanlı sokak","7/8")));

    }
}
