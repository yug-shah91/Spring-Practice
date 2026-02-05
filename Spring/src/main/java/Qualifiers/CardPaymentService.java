package Qualifiers;

import org.springframework.stereotype.Component;

@Component
public  class CardPaymentService implements PaymentService{
    @Override
    public void pay() {
        System.out.println("Payment Done Using Card");
    }
}
