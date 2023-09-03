package interfaces;

public class Client {
    public void makeAnOrder(Waiter waiter, String dish) {
        waiter.bringAnOrder(dish);
    }
}
