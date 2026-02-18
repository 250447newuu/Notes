package org.example;

public class Main {
    public static void main(String[] args) {

        Student s1 = new Student();
        Student s2 = new Student(23000, "John", 'm');

        System.out.println("Total students: " + Student.counter);

        Student.print();

        s1.printInfo();
        s2.printInfo();

        System.out.println("PI: " + Math.PI);
    }
}
