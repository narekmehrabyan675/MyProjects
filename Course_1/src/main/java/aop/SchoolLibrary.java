package aop;

import org.springframework.stereotype.Component;

@Component("schoolLibrary")
public class SchoolLibrary {
    public void getBook(){
        System.out.println("Get book from School!!!");
    }
}
