package interfaces;

public class Programmer implements Worker, Driver{
    @Override
    public void work() {
        System.out.println("Программист работает");
    }

    @Override
    public void toDrive() {
        System.out.println("Программист водит");
    }
}
