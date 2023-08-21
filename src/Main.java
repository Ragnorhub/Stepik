public class Main {
    public static void main(String[] args) {
        Box box1 = new Box();
        box1.height = 10;
        box1.length = 10;
        box1.width = 10;
        Box box2 = new Box();
        box2.height = 20;
        box2.length = 20;
        box2.width = 20;
        double volume = box1.height * box1.length * box1.width;
        double volume2 = box2.height * box2.length * box2.width;
        System.out.println(volume);
        System.out.println(volume2);
        Human human1 = new Human();
        Human human2 = new Human();
        Human human3 = new Human();
        human1.age = 38;
        human2.age = 33;
        human3.age = 39;
        human1.weight = 80;
        human2.weight = 67;
        human3.weight = 98;
        human1.name = "John";
        human2.name = "Ostin";
        human3.name = "Stella";
        System.out.println((human1.age + human2.age + human3.age) / 3.0);
    }
}