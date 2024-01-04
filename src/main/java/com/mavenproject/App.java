package com.mavenproject;

import java.lang.invoke.MethodHandles.Lookup.ClassOption;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Abhishek gore" );
       // Student student=new Student (12,"abhsihek","ek-475");
       //  System.out.println(student);
        
      // now we want to create the dependency without creating the object
        ApplicationContext context =new ClassPathXmlApplicationContext("config.xml");
        
        Student s=(Student)context.getBean("student1",Student.class);
        System.out.println(s);
        
    }
}
