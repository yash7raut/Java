package first_java;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int input = sc.nextInt();
        int x = 1;
        for(int i = 1; i<=input; i++){
            x = x * i;
        }
        System.out.println("The factorial of "+input+" is "+x);
        sc.close();
    }
}
