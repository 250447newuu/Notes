package org.example;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main m = new Main();
        m.problem1();
        m.problem2();
        m.problem3();
        m.problem4();
        m.problem5();
        m.problem6();
        m.problem7();
        m.problem8();
    }

    void problem1() {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(5, 10);
        System.out.println("----------------------------------------");
        System.out.println("The length:" + r1.getLength());
        System.out.println("The width:" + r1.getWidth());
        System.out.println("The area:" + r1.calculateArea());
        System.out.println("The perimeter:" + r1.calculatePerimeter());
        System.out.println("----------------------------------------");
        System.out.println("The length:" + r2.getLength());
        System.out.println("The width:" + r2.getWidth());
        System.out.println("The area:" + r2.calculateArea());
        System.out.println("The perimeter:" + r2.calculatePerimeter());
        System.out.println("----------------------------------------");
    }

    void problem2() {
        Invoice Inv1 = new Invoice();
        Invoice Inv2 = new Invoice("H123", "Hammer", 5, 15.99);
        System.out.println("----------------------------------------");
        System.out.println("Part Number:" + Inv1.getPartNumber());
        System.out.println("Description:" + Inv1.getPartDescription());
        System.out.println("Quantity:" + Inv1.getQuantity());
        System.out.println("Price Per Item:" + Inv1.getPricePerItem());
        System.out.println("Invoice:" + Inv1.calculateInvoice());
        System.out.println("----------------------------------------");
        System.out.println("Part Number:" + Inv2.getPartNumber());
        System.out.println("Description:" + Inv2.getPartDescription());
        System.out.println("Quantity:" + Inv2.getQuantity());
        System.out.println("Price Per Item:" + Inv2.getPricePerItem());
        System.out.println("Invoice:" + Inv2.calculateInvoice());
        System.out.println("----------------------------------------");
    }

    void problem3() {
        System.out.println("----------------------------------------");
        int[] arr = new int[100000];
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(100000);
        }

        System.out.println("Sorting 100,000 numbers using selection sort...");

        StopWatch watch = new StopWatch();
        watch.start();
        SelectionSort.sort(arr);
        watch.stop();

        System.out.println("Elapsed time: " + watch.getElapsedTime() + " milliseconds");
        System.out.println("Start time: " + watch.getStartTime());
        System.out.println("End time: " + watch.getEndTime());
        System.out.println("----------------------------------------");
    }

    void problem4() {
        System.out.println("----------------------------------------");
        System.out.println("PROBLEM 4: SAVINGS ACCOUNT CLASS");
        System.out.println("----------------------------------------");

        SavingsAccount saver1 = new SavingsAccount(2000.00);
        SavingsAccount saver2 = new SavingsAccount(3000.00);

        SavingsAccount.modifyInterestRate(0.04);
        System.out.println("Initial balances with 4% annual interest:");
        System.out.println("Saver 1: $" + saver1.getSavingsBalance());
        System.out.println("Saver 2: $" + saver2.getSavingsBalance());

        System.out.println("\nCalculating monthly interest for 12 months...");
        for (int month = 1; month <= 12; month++) {
            saver1.calculateMonthlyInterest();
            saver2.calculateMonthlyInterest();
            System.out.printf("Month %2d - Saver1: $%.2f, Saver2: $%.2f%n",
                    month, saver1.getSavingsBalance(), saver2.getSavingsBalance());
        }

        SavingsAccount.modifyInterestRate(0.05);
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();

        System.out.println("\nAfter changing to 5% for one more month:");
        System.out.printf("Saver 1: $%.2f%n", saver1.getSavingsBalance());
        System.out.printf("Saver 2: $%.2f%n", saver2.getSavingsBalance());
        System.out.println("----------------------------------------");
    }

    void problem5() {
        System.out.println("----------------------------------------");
        System.out.println("PROBLEM 5: LIBRARY BOOK CLASS");
        System.out.println("----------------------------------------");

        LibraryBook book1 = new LibraryBook("Java Programming", "John Doe", 600);
        LibraryBook book2 = new LibraryBook();

        System.out.println("Book 1 (valid data):");
        System.out.println("Title: " + book1.getBookTitle());
        System.out.println("Author: " + book1.getAuthor());
        System.out.println("Pages: " + book1.getPages());
        System.out.println("Is thick? " + book1.isThick());

        System.out.println("\nBook 2 (default):");
        System.out.println("Title: " + book2.getBookTitle());
        System.out.println("Author: " + book2.getAuthor());
        System.out.println("Pages: " + book2.getPages());
        System.out.println("Is thick? " + book2.isThick());

        System.out.println("\nAttempting to set pages to -100 (invalid)...");
        book2.setPages(-100);
        System.out.println("Pages after invalid attempt (should remain 1): " + book2.getPages());
        System.out.println("----------------------------------------");
    }

    void problem6() {
        System.out.println("----------------------------------------");
        System.out.println("PROBLEM 6: TEMPERATURE SENSOR ARRAY");
        System.out.println("----------------------------------------");

        Sensor[] sensors = new Sensor[5];
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Choose input method:");
        System.out.println("1. Manual input");
        System.out.println("2. Random data");
        System.out.print("Enter choice (1 or 2): ");

        int choice = scanner.nextInt();
        double total = 0;

        if (choice == 1) {
            for (int i = 0; i < sensors.length; i++) {
                System.out.println("\nSensor " + (i+1) + ":");
                System.out.print("Enter location: ");
                String location = scanner.next();
                System.out.print("Enter temperature reading: ");
                double reading = scanner.nextDouble();
                sensors[i] = new Sensor(location, reading);
            }
        } else {
            String[] locations = {"Living Room", "Bedroom", "Kitchen", "Garage", "Garden"};
            System.out.println("Generating random sensor data:");
            for (int i = 0; i < sensors.length; i++) {
                double reading = -40 + rand.nextDouble() * 90;
                sensors[i] = new Sensor(locations[i], reading);
                System.out.println("Sensor " + (i+1) + ": " + locations[i] +
                        " - Reading: " + String.format("%.2f", sensors[i].getReading()) + "°C");
            }
        }

        System.out.println("\n--- Sensor Readings Summary ---");
        for (int i = 0; i < sensors.length; i++) {
            System.out.println("Sensor " + (i+1) + " (" + sensors[i].getLocation() +
                    "): " + String.format("%.2f", sensors[i].getReading()) + "°C");
            total += sensors[i].getReading();
        }

        double average = total / sensors.length;
        System.out.println("\nAverage temperature across all sensors: " +
                String.format("%.2f", average) + "°C");
        System.out.println("----------------------------------------");
        scanner.close();
    }

    void problem7() {
        System.out.println("----------------------------------------");
        System.out.println("PROBLEM 7: STEP COUNTER CLASS");
        System.out.println("----------------------------------------");

        StepCounter userA = new StepCounter();
        StepCounter userB = new StepCounter();

        System.out.println("Initial state:");
        System.out.println("User A steps: " + userA.getIndividualSteps());
        System.out.println("User B steps: " + userB.getIndividualSteps());
        System.out.println("Total steps all users: " + StepCounter.getTotalStepsAllUsers());

        System.out.println("\nUser A walks 5000 steps");
        userA.walk(5000);
        System.out.println("User B walks 7500 steps");
        userB.walk(7500);

        System.out.println("\nAfter first walk:");
        System.out.println("User A steps: " + userA.getIndividualSteps());
        System.out.println("User B steps: " + userB.getIndividualSteps());
        System.out.println("Total steps all users: " + StepCounter.getTotalStepsAllUsers());

        System.out.println("\nUser A walks another 3000 steps");
        userA.walk(3000);
        System.out.println("User B walks another 2000 steps");
        userB.walk(2000);

        System.out.println("\nAfter second walk:");
        System.out.println("User A steps: " + userA.getIndividualSteps());
        System.out.println("User B steps: " + userB.getIndividualSteps());
        System.out.println("Total steps all users: " + StepCounter.getTotalStepsAllUsers());

        System.out.println("\nResetting global steps...");
        StepCounter.resetGlobalSteps();

        System.out.println("After reset:");
        System.out.println("User A steps (unchanged): " + userA.getIndividualSteps());
        System.out.println("User B steps (unchanged): " + userB.getIndividualSteps());
        System.out.println("Total steps all users (reset to 0): " + StepCounter.getTotalStepsAllUsers());
        System.out.println("----------------------------------------");
    }

    void problem8() {
        System.out.println("----------------------------------------");
        System.out.println("PROBLEM 8: RECURSION VS ITERATION PERFORMANCE");
        System.out.println("----------------------------------------");

        int n = 20;
        int iterations = 1000000;

        System.out.println("Testing factorial of " + n + " performed " + iterations + " times each");

        StopWatch watch1 = new StopWatch();
        watch1.start();

        long recursiveResult = 0;
        for (int i = 0; i < iterations; i++) {
            recursiveResult = MathTool.factorialRecursive(n);
        }
        watch1.stop();

        StopWatch watch2 = new StopWatch();
        watch2.start();

        long iterativeResult = 0;
        for (int i = 0; i < iterations; i++) {
            iterativeResult = MathTool.factorialIterative(n);
        }
        watch2.stop();

        System.out.println("Factorial of " + n + " = " + recursiveResult);
        System.out.println("----------------------------------------");
        System.out.println("Recursive method time: " + watch1.getElapsedTime() + " ms");
        System.out.println("Iterative method time: " + watch2.getElapsedTime() + " ms");
        System.out.println("----------------------------------------");

        long difference = watch1.getElapsedTime() - watch2.getElapsedTime();
        if (difference > 0) {
            System.out.println("Iterative method is " + difference + " ms faster");
        } else if (difference < 0) {
            System.out.println("Recursive method is " + Math.abs(difference) + " ms faster");
        } else {
            System.out.println("Both methods took the same time");
        }

        System.out.println("\nVerification: Both methods produce the same result? " +
                (recursiveResult == iterativeResult));
        System.out.println("----------------------------------------");
    }
}