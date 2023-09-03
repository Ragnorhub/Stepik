package interfaces;

public class Cook implements Worker, Driver {
    @Override
    public void work() {
        System.out.println("Повар работает");
    }

    @Override
    public void toDrive() {
        System.out.println("Повар водит");
    }
}
