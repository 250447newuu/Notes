package org.example;
public class Student {
    public int ID;
    private String name;
    char gender;
    static int counter;

    Student() {
        ID = 250444;
        name = "Mary";
        gender = 'f';
        counter++;
    }

    Student(int ID, String name, char gender) {
        this.ID = ID;
        this.name = name;
        this.gender = gender;
        counter++;
    }

    void complain(String mes) {
        System.out.println(mes);
    }

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    void printInfo() {
        System.out.println("ID: " + ID + ", Name: " + name + ", Gender: " + gender);
    }

    static void print() {
        System.out.println("Hello from static");
    }
}
