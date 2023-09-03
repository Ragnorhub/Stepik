package interfaces;

public class WaiterBob implements Waiter {
    @Override
    public void bringAnOrder(String dish) {
        System.out.println("Я принес Вам: " + dish);
    }
}
