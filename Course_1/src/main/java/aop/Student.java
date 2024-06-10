package aop;

public class Student {
    private String nameSurname;
    private int course;
    private double grade;

    public Student(String nameSurname, int course, double grade) {
        this.nameSurname = nameSurname;
        this.course = course;
        this.grade = grade;
    }

    public String getNameSurname() {
        return nameSurname;
    }

    public void setNameSurname(String nameSurname) {
        this.nameSurname = nameSurname;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "nameSurname='" + nameSurname + '\'' +
                ", course=" + course +
                ", grade=" + grade +
                '}';
    }
}
