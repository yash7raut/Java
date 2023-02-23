package first_java;

import java.util.Scanner;

public class armstrong_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a 3 digit number");
        int num = sc.nextInt();
        sc.close();
        int original_number =  num;
        int sum = 0;

        while(num != 0){
            int digit = num % 10;
            sum += Math.pow(digit, 3);
            num /= 10;
        }
        if(sum == original_number){
            System.out.println(original_number+" is an armstrong Number");
        }
        else{
            System.out.println(original_number+" is not an armstrong Number");
        }
    }
}
