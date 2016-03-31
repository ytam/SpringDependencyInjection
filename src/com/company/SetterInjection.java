package com.company;

/**
 * Created by brusk on 31.03.2016.
 */
public class SetterInjection {

    public static void main(String[] args) {

        Adress adress = new Adress("Tutanlı","78");
        Employee employee = new Employee(1,"Yıldırım","TAM",adress);

        System.out.println(employee);


    }
}
