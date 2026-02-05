package LooseCoupling;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

    public static void main(String[] args) {

        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.example");

        FoodOrderService service =
                context.getBean(FoodOrderService.class);

        service.placeOrder();
    }
}
