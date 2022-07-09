package ru.yandex.practicum.debug;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Example3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("Enter the name");
            String name = scanner.nextLine();
            System.out.println("Enter the age");
            int age = scanner.nextInt();

            Person person = new Person(name, age);
            System.out.println("Person created: " + person.getName() + " " + person.getAge());
        }

    }
}
