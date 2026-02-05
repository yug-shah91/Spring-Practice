package Qualifiers;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class FoodOrderService {

    private final PaymentService paymentService;

    public FoodOrderService(@Qualifier("upiPaymentService") PaymentService paymentService){
        this.paymentService=paymentService;
    }

    public void placeOrder(){
        paymentService.pay();
        System.out.println("Order placed !");
    }
}
