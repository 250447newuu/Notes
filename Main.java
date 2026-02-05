import java.util.Scanner;
import java.util.Random;
public class Main {
    Scanner scanner = new Scanner(System.in);
    Random rand= new Random();
    public static void main(String[] args) {
        Main m = new Main();
        //m.problem1(args);
        //m.problem2();
        //m.problem3();
        //m.problem4();
        //m.problem5();
        //m.problem6();
        //m.problem7();
        m.problem8();
        //m.problem9();
    }
    void problem1(String[] args){
        int sum=0;
        for(String number:args){
            sum+=Integer.parseInt(number);
        }
        System.out.println(sum);
    }
    void problem2(){
       int r=rand.nextInt(10)+1;
       double c=2*Math.PI*r;
       double a=Math.PI*r*r;
       System.out.printf("The circumference %.2f%n",c);
        System.out.printf("The area %.2f%n",a);
    }
    void problem3() {
        System.out.print("Enter the score: ");
        int s = scanner.nextInt();
        if(s>=0 && s<=100){
            System.out.print("Grade: ");
            if (s < 100 && s > 90)
                System.out.print("A");
            else if (s>=80)
                System.out.print("B");
            else if (s>=70)
                System.out.print("C");
            else if(s>=60)
                System.out.print("D");
            else
                System.out.print("F");
        }else{
            System.out.print("Invalid score");
        }
        }
        void problem4(){
        System.out.print("Enter your weight: ");
        double w=scanner.nextDouble();
        System.out.print("Enter your height ");
        double h=scanner.nextDouble();
        double b=w/h/h;
        System.out.printf("Your Body Mass Index is %.2f%n",b);
        if(18.5>=b)
            System.out.println("You are underweight");
        else if(b>18.5 && b<=24.9)
            System.out.println("You are Normal weight");
        else if(b>=25 && b<=29.9)
            System.out.println("You are overweight");
        else
            System.out.println("You are Obese");
        }
        void problem5(){
        System.out.print("Enter a number: ");
        int n=scanner.nextInt();
        int sum=0;
        if(n>=1){
            for(int i=1;i<=n; i++){
                sum+=(i*i);
            }
        }else{
            System.out.println("Enter a number more than 1");
        }
            System.out.println("Sum="+sum);
        }
        void problem6(){
        System.out.print("Enter a number: ");
        int n=scanner.nextInt();
        if(n>=0){
            if(n==0) {
                System.out.println("Factorial 1");
            }else{
                int fac=1;
                for(int i=1;i<=n;i++){
                    fac*=i;
                }
                System.out.println("Factorial "+fac);
            }
        }else {
            System.out.print("Enter a positive number");
        }
        }
        void problem7() {
            System.out.print("Enter a number: ");
            double a = scanner.nextDouble();
            int count = 0;
            while (a >= 1) {
                count++;
                a/=10;
            }
            System.out.println(count);
        }
        void problem8(){
        System.out.print("Enter a number: ");
        int a=
        }
    }