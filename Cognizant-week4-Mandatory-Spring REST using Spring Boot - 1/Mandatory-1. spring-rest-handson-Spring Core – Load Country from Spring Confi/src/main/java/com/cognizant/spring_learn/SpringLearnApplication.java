package com.cognizant.spring_learn;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.cognizant.springlearn.Country;

public class SpringLearnApplication {
    public static void main(String[] args) {
        displayCountry();
    }
    public static void displayCountry() {
        ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
        Country country = (Country) context.getBean("country", Country.class);
        System.out.println("Country : " + country.toString());
    }
}
