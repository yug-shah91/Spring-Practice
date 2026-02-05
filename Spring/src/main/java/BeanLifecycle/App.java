package BeanLifecycle;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext("BeanLifecycle");

        Laptop laptop = context.getBean(Laptop.class);

        System.out.println("2.laptop bean used");

        context.close();
    }
}
