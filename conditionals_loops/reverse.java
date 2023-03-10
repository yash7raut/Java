package conditionals_loops;

import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to be reversed.");
        int num = sc.nextInt();
        int ans =  0;
        while(num > 0){
            int x = num % 10;
            num = num / 10;
            ans = (ans*10) + x;
        } 
        System.out.println("The reverse of this number is "+ans);
        sc.close();
    }
}
// Basic approach to reverse a Number.