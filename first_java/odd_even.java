package first_java;

import java.util.Scanner;

public class odd_even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int input = sc.nextInt();
        if(input % 2 == 0){
            System.out.println("The given Number is Even");
        }
        else{
            System.out.println("The given number is Odd");
        }
        sc.close();
    }

    
}
