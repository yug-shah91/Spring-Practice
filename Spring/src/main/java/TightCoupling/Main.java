package TightCoupling;

public class Main {
    public static void main(String[] args) {

        FoodOrderService orderService = new FoodOrderService();

        orderService.placeOrder();
    }
}
