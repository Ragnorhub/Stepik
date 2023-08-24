package main;

import classes.*;
import test.MyArrayList;

public class Main {
    public static void main(String[] args) {
        Box box1 = new Box();
        box1.setHeight(10);
        box1.setLength(10);
        box1.setWidth(10);
        Box box2 = new Box();
        box2.setHeight(20);
        box2.setLength(20);
        box2.setWidth(20);
        double volume = box1.getHeight() * box1.getLength() * box1.getWidth();
        double volume2 = box2.getHeight() * box2.getLength() * box2.getWidth();
        System.out.println(volume);
        System.out.println(volume2);
        Human human1 = new Human();
        Human human2 = new Human();
        Human human3 = new Human();
        human1.setAge(38);
        human2.setAge(33);
        human3.setAge(39);
        human1.setWeight(80);
        human2.setWeight(67);
        human3.setWeight(98);
        human1.setName("John");
        human2.setName("Ostin");
        human3.setName("Stella");
        System.out.println((human1.getAge() + human2.getAge() + human3.getAge()) / 3.0);

        MyArrayList employees = getEmployees();
        employees.add("James");
        employees.remove("Emma");
        employees.remove(2);
        for (int i = 0; i < employees.getSize(); i++) {
            System.out.println(employees.get(i));
        }

    }
    private static MyArrayList getEmployees() {
        MyArrayList employees = new MyArrayList();
        employees.add("John");
        employees.add("Olivia");
        employees.add("Emma");
        employees.add("Max");
        employees.add("Nick");
        return employees;
    }


}