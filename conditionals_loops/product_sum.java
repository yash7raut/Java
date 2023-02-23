package conditionals_loops;

import java.util.Scanner;

public class product_sum{ 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        sc.close();

        int sum=0,mul=1;

        while(num != 0){
            int rightnum = num % 10;
            sum += rightnum;
            mul *= rightnum;
            num /= 10;
        }
        System.out.println(mul - sum);
    }
}

// Given an integer number n, return the difference between the product of its digits and the sum of its digits.
// Input: n = 234
// Output: 15 
// Explanation: 
// Product of digits = 2 * 3 * 4 = 24 
// Sum of digits = 2 + 3 + 4 = 9 
// Result = 24 - 9 = 15