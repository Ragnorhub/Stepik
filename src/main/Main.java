package main;

import classes.*;
//import test.MyArrayList;

import java.util.ArrayList;
import java.util.HashSet;

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
        human2.setName("Malanie");
        human3.setName("Stella");
        System.out.println((human1.getAge() + human2.getAge() + human3.getAge()) / 3.0);
        System.out.println(human1.getName() + "\n" + human2.getName()  + "\n" + human3.getName());

        System.out.println();
        ArrayList<String> employees = getEmployees();
        employees.add("James");
        employees.remove("Nick");
        for (String employee : employees) {
            System.out.println(employee);
        }
        String s = "This is John. He is 27 years old.";
        String name = s.substring(8,12);
        System.out.println();
        int age = Integer.parseInt(s.substring(20,22));
        Person person = new Person(name, age);
        System.out.println("Name: " + person.getName() + "\nAge: " + person.getAge());
        getUnification();
        HashSet<String> names = getHumans();
        for (String human : names) {
            System.out.println(human);
        }
    }
    private static ArrayList<String> getEmployees() {
        ArrayList<String> employees = new ArrayList<>();
        employees.add("John");
        employees.add("Olivia");
        employees.add("Emma");
        employees.add("Max");
        employees.add("Nick");
        return employees;
    }
    private static ArrayList<String> getNames() {
        ArrayList<String> names = new ArrayList<>(5);
        names.add("John");
        names.add("Olivia");
        names.add("Emma");
        names.add("Max");
        names.add("Nick");
        return names;
    }
    private static ArrayList<Integer> getNumbers() {
        ArrayList<Integer> numbers = new ArrayList<>(5);
        for (int i = 0; i < 5; i++) {
            numbers.add(i);
        }
        return numbers;
    }

    private static ArrayList<String> getUnification() {
        ArrayList<String> unification = new ArrayList<>(5);
        for (int i = 0; i < 5; i++) {
            unification.add(getNumbers().get(i) + " - " + getNames().get(i));
        }
        for (String numberAndNames : unification) {
            System.out.println(numberAndNames);
        }
        System.out.println();
        return unification;
    }
    private static HashSet<String> getHumans() {
        HashSet<String> employees = new HashSet<>();
        employees.add("John");
        employees.add("Olivia");
        employees.add("Emma");
        employees.add("Max");
        employees.add("Nick");
        return employees;
    }

}