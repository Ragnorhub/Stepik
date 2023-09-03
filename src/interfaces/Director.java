package interfaces;

/*public class Director implements Worker{
    @Override
    public void work() {
        System.out.println("Директор работает");
    }
}*/
public class Director {
    public void force(Worker worker1, Worker worker2) {
        worker1.work();
        worker2.work();
    }
    public void force(Worker worker) {
        worker.work();
    }
}