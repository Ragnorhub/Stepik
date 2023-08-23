package main;

import classes.*;

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
        String[] employees = getEmployees();
        String[] newArray = new String[employees.length+1];
        for (int i = 0; i < employees.length; i++) {
            newArray[i] = employees[i];
        }
        newArray[newArray.length-1] = "James";
        employees = newArray;
        employees[0] = null;
        String[] newestArray = new String[employees.length-1];
        for (int i = 0, j = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                newestArray[j] = employees[i];
                j++;
            }
        }
        employees = newestArray;
        for (String employee : employees) {
            System.out.println(employee);
        }

    }
    private static String[] getEmployees() {
        String[] employees = new String[5];
        employees[0] = "John";
        employees[1] = "Olivia";
        employees[2] = "Emma";
        employees[3] = "Max";
        employees[4] = "Nick";
        return employees;
    }
}