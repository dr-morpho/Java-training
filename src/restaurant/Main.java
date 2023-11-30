package restaurant;

public class Main {
    public static void main(String[] args) {
        Client client = new Client();
        WaiterMax max = new WaiterMax();
        client.setOrder(max, "Пицца");
        
        System.out.println("-------------------");
        
//      Анонимный класс:
        client.setOrder(new Waiter() {
            @Override
            public void order(String order) {
                System.out.println("Твой заказ, бро: " + order);
            }
        }, "карбонара");
        
    }
}
