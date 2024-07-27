package com.autowire.byName;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("autowireByName.xml");

        MyCar myCar = (MyCar) context.getBean("myCar");
        System.out.println(myCar.getCarDetails());



    }
}
