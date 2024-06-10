package aop;

import aop.AbstarctLibrery;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Book extends AbstarctLibrery {
    @Value("Narek's")
    private String name;
    @Value("2002")
    private int date;
    @Override
    public void getBook() {
        System.out.println("Book is a" + name + date);
    }

    public String getName() {
        return name;
    }

    public int getDate() {
        return date;
    }
}
