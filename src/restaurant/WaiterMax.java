package restaurant;

public class WaiterMax implements Waiter {
    @Override
    public void order(String input) {
        System.out.println("Ваш заказ: " + input);
    }
    
}
