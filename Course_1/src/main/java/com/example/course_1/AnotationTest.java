package com.example.course_1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnotationTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("configappanotation.xml");
        Person person = applicationContext.getBean("person",Person.class);
        person.CallYourPet();
    }
}
