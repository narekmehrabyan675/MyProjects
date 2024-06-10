package com.example.course_1;
import org.springframework.stereotype.Component;
public class Cat implements Pet {
    public Cat() {
        System.out.println("Cat been created!!!");
    }

    @Override
    public void sayHello() {
        System.out.println("Mew-Mew!!!");

    }
}
