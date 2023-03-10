package conditionals_loops;

import java.util.Scanner;

public class occurences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a several digits number");
        int num = sc.nextInt();
        System.out.println("Enter the number whose occurences is to be find");
        int n = sc.nextInt();
        int a = num;
        int count = 0;
        int x = 0;
        while(num > 0){
            x = num % 10;
            if(x == n){
                count+=1;
            }
            num = num / 10;
        }
        System.out.println("The number "+n+" appears "+count+" times in "+a);
        sc.close();
    }
}


// basic approch to count the number of occurences in a digit.