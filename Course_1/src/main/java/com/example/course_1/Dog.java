package com.example.course_1;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

public class Dog implements Pet{
    public Dog() {
        System.out.println("Dog been created!!!");
    }
    @Override
    public void sayHello() {
        System.out.println("Bow-Wow!!!");
    }
}
