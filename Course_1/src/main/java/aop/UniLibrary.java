package aop;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component("unilibrary")
public class UniLibrary {
    @Value("Narek")
    String name;
    @Value("2002")
    int year;
    public void getBook(){
        System.out.println("Get book from University!!!");
    }
    public void returnBook(){
        System.out.println("return book to University");
    }
    public void getMagazine(){
        System.out.println("Get magazine from School!!!");
    }
    public void returnMagaznie(){
        System.out.println("return magazine to University");
    }
    public void addBook(String person_name , Book book){
        System.out.println("We add book on university librery");
    }
    public void addMagazine(){
        System.out.println("We add magazine on university librery");
    }
}
