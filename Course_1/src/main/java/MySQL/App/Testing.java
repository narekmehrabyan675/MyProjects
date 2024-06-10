package MySQL.App;

import MySQL.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;
import org.hibernate.query.Query;

import java.util.List;

public class Testing {
    public static void main(String[] args) {
        SessionFactory factory =new Configuration().configure()
                .addAnnotatedClass(Student.class).buildSessionFactory();
            Session session = null;
            try{
                session = factory.getCurrentSession();
                session.beginTransaction();
                Student std1 = session.get(Student.class, 1);
                std1.setPassword("Narek223334444");
                session.getTransaction().commit();

                session = factory.getCurrentSession();
                session.beginTransaction();
                session.createQuery("delete from Student  where username = 'Hamlet'").executeUpdate();
                session.getTransaction().commit();

                session = factory.getCurrentSession();
                session.beginTransaction();
                session.createQuery("update Student set password = 'empty123' where username = 'Milena'")
                        .executeUpdate();
                //session.getTransaction().commit();
                session.getTransaction().rollback();

                session = factory.getCurrentSession();
                session.beginTransaction();
                String sql = " FROM Student WHERE username = :value";
                Query<Student> fromStudent = session.createQuery(sql, Student.class).setParameter("value", "username");


//                session = factory.getCurrentSession();
//                session.beginTransaction();
//                Query<Student> fromStudent = session.createQuery("from Student", Student.class);
                List<Student> resultList = fromStudent.list();

                for(Student std: resultList){
                    System.out.println(std);
                }
                session.getTransaction().commit();
//              Student student = new Student("Nareko" , "narekooo123");
//              Session session = factory.getCurrentSession();
//              session.beginTransaction();
//              session.save(student);
//              session.getTransaction().commit();
            }finally {
            factory.close();
            }
    }
}
