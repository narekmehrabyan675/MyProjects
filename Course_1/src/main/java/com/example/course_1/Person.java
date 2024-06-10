package com.example.course_1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
public class Person {
    private Pet myPet;
    @Value("${person.surname}")
    private String surname;
    @Value("${person.age}")
    private int age;

    public Person(Pet myPet) {
        System.out.println("Person bean is creaetd!!!");
        this.myPet = myPet;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }
    public void CallYourPet(){
        System.out.println("Hello from lovely pet!");
        myPet.sayHello();
    }

    public void setMyPet(Pet myPet) {
        this.myPet = myPet;
    }
}
