package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner scan;
    static ArrayList<Student> students;

    public static void main(String[] args) {
        students = new ArrayList<>();
        scan = new Scanner(System.in);

        start();

    }

    public static void start() {
        System.out.printf("enter 1 for see student list:\nenter 2 for create new student:");

        int i = scan.nextInt();

        switch (i) {
            case 1:
                System.out.println(students);
                System.out.println("-----------------------------");
                start();
                break;
            case 2:
                System.out.println("you have chosen 2 for creating new student so you should write name surname and gpa.");
                System.out.printf("name:");
                String name = scan.next().trim();
                System.out.printf("\nsurname:");
                String surname = scan.next().trim();
                System.out.printf("\ngpa:");
                float gpa = scan.nextFloat();
                students.add(new Student(name, surname, gpa));
                System.out.println(students);
                System.out.println("-----------------------------");
                start();
                break;
            default:
                System.out.println("some error happened!");
                System.out.println("-----------------------------");
                start();
        }
    }
}
