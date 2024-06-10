package com.example.course_1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:myApp.properties")
public class MyConfig {
    @Bean("cat")
    public Pet catBean(){
        return new Cat();
    }
    @Bean
    public Pet dogBean(){
        return new Dog();
    }
    @Bean
    public Person personBean(@Qualifier("dogBean") Pet pet){
        return new Person(pet);
    }
}
