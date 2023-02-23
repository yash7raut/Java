package flow_of_programs;

import java.util.Scanner;

class sum_of_numbers{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number");
        int input1 = input.nextInt();
        System.out.println("Enter the second number");
        int input2 = input.nextInt();
        int result = input1 + input2;
        System.out.println("THe sum of thwo number is "+result);
        input.close();
    }
}