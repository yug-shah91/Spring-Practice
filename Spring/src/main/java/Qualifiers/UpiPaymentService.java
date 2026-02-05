package Qualifiers;

import org.springframework.stereotype.Component;

@Component // @Compinent("Upi") --> abb ye object ka naam jo qualifier me de sakte hai
public class UpiPaymentService implements PaymentService{

    @Override
    public void pay() {
        System.out.println("Payment Done Using Upi ");
    }
}
