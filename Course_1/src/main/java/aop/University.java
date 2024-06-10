package aop;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class University {
    private List<Student> studentList = new ArrayList<>();
    public void addStudents(){
        Student student1 = new Student("Narek Mehrabyan", 2, 15.5);
        Student student2 = new Student("Rafik Petrosyan", 2, 13.5);
        Student student3 = new Student("Milena Mehrabyan", 1, 17.5);
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        System.out.println("Information from addStudents!!!");
    }
    public List<Student> getStudents(){
        System.out.println("Information from getStudents()");
        System.out.println(studentList);
        //System.out.println(studentList.get(3));
        return studentList;
    }
}
