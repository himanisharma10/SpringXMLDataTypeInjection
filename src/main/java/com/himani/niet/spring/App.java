package com.himani.niet.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	 ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
         Student student = (Student)context.getBean("himaniStudent");
         System.out.println(student.toString());
         student = (Student)context.getBean("swatiStudent");
         System.out.println(student.toString());
    }
}
