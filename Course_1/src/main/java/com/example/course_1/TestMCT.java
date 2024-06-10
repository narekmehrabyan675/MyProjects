package com.example.course_1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestMCT {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(MyConfig.class);
//        Pet mycat = annotationConfigApplicationContext.getBean("catBean", Pet.class);
//        mycat.sayHello();
//        annotationConfigApplicationContext.close();
        Person person = annotationConfigApplicationContext.getBean("personBean",Person.class);
        System.out.println(person.getSurname() + " " + person.getAge());
        person.CallYourPet();
        person.setMyPet(annotationConfigApplicationContext.getBean("cat", Cat.class));
        person.CallYourPet();
    }
}
