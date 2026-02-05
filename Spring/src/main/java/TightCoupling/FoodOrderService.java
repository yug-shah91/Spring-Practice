package TightCoupling;

public class FoodOrderService {

    PaymentService paymentService = new PaymentService();

    public void placeOrder(){

        paymentService.pay();
        System.out.println("Order Placed");
    }
}
