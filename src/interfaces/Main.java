package interfaces;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        Bird bird = new Bird();
        Fish fish = new Fish();
//        ArrayList<Animal> animals = new ArrayList<>();
//        animals.add(cat);
//        animals.add(dog);
//        animals.add(bird);
//        animals.add(fish);
//        for (Animal animal :animals) {
//            animal.eat();
//        }
//        Animal animal = new Dog();
//        animal.eat();
//        ((Dog) animal).run();
//        Dog dog = (Dog) animal;
//        dog.run();
        ArrayList<AbleToRun> animals = new ArrayList<>();
        animals.add(cat);
        animals.add(dog);
        animals.add(bird);
        for (AbleToRun ableToRun : animals) {
            ableToRun.run();
        }
        AbleToFly ableToFly = new Bird();
        ableToFly.fly();

        Director director = new Director();
        Programmer programmer = new Programmer();
        Cook cook = new Cook();

        ArrayList<Worker> workers = new ArrayList<>();
        //workers.add(director);
        workers.add(programmer);
        workers.add(cook);
        for (Worker worker : workers) {
            worker.work();
        }

        ArrayList<Driver> drivers = new ArrayList<>();
        drivers.add(programmer);
        drivers.add(cook);
        //drivers.add(director);
        for (Driver driver : drivers) {
            driver.toDrive();
        }
        //director.force(programmer, cook);
        director.force(new Worker() {
            @Override
            public void work() {
                System.out.println("Работаю");
            }
        });
        Client client = new Client();
        client.makeAnOrder(new Waiter() {
            @Override
            public void bringAnOrder(String dish) {
                System.out.println("Я принес Вам: " + dish);
            }
        }, "Оливье");
        WaiterBob waiter = new WaiterBob();
        client.makeAnOrder(waiter, "Оливье");
    }
}
