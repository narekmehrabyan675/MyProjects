package com.example.course_1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Course1Application {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("configapp.xml");

        Person person = applicationContext.getBean("Person",Person.class);
        person.CallYourPet();

        applicationContext.close();
    }

}
