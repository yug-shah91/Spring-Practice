package LooseCoupling;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FoodOrderService {

    @Autowired
    PaymentService paymentService ;

//    public FoodOrderService(PaymentService paymentService){
//        this.paymentService = paymentService;
//    }
    public void placeOrder(){
        paymentService.pay();
        System.out.println("orderPlaced");
    }
}
