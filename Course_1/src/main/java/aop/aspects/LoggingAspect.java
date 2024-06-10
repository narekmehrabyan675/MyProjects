package aop.aspects;

import aop.Book;
import aop.Student;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Aspect
public class LoggingAspect {

    @Before("aop.aspects.MyPointcuts.alladdMethodsBeforeAdvice()")
    public void beforeAddLoggingAdvice(JoinPoint joinPoint){
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();

        System.out.println("You are added from method: " +
                methodSignature);

        if(methodSignature.getName().equals("addBook")){
            Object[] arguments = joinPoint.getArgs();
            for(Object obj:arguments){
                if(obj instanceof Book){
                    Book myBook = (Book) obj;
                    System.out.println("About book , name of book - " + myBook.getName()
                            + ", when is created - " + myBook.getDate());
                }
                else if(obj instanceof String){
                    System.out.println("Is added - " + obj);
                }
            }
        }
    }

    @AfterReturning(pointcut = "aop.aspects.MyPointcuts.allGetMethodsAfterAdvice()",
            returning = "student")
    public void allAddMethodsAfterReturningAdvice(List<Student> student){
        student.get(0).setNameSurname("Vahe Mehrabyan");
        student.get(0).setGrade(1000);
        student.get(0).setCourse(0);
        System.out.println("After returning");
    }

    @AfterThrowing(pointcut = "aop.aspects.MyPointcuts.allGetMethodsAfterAdvice()" , throwing = "e")
    public void allAddMethodsAfterThrowingAdvice(Throwable e){
        System.out.println("Exeption is a " + e);
    }
    @After("aop.aspects.MyPointcuts.allGetMethodsAfterAdvice()")
    public void allAddMethodsAfterAdvice(){
        System.out.println("After method , I am here!!!");
    }
}
