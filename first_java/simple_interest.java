package first_java;

import java.util.Scanner;

public class simple_interest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Principle amount");
        float principle = sc.nextFloat();
        System.out.println("Enter the Rate of Interest");
        float rate = sc.nextFloat();
        System.out.println("The the period of time in years");
        float time = sc.nextFloat();
        float interest = (principle * rate * time)/100;
        System.out.println("The amount of simple interest you earned is "+interest+" Rupees");
        sc.close();
    }
}