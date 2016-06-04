package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Configuration.xml");
//        ClassA a = context.getBean("eddie", ClassA.class);
//        System.out.println(a.getValue());

        ClassB b = context.getBean("classB", ClassB.class);
        System.out.println(b.getaValue().getValue());
        System.out.println(b.getIntValue());
        System.out.println(b.getStringValue());
    }
}
