package first_java;

import java.util.Scanner;

public class fibonnaci_series {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int a = 0;
        int b = 1;
        System.out.print(a+", "+b+", ");
        int x;
        for(int i=2; i<number; i++){
            x = a+b;
            a = b;
            b = x;
            System.out.print(x+" ,");
        }
        sc.close();
    }
}
