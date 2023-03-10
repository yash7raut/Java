package conditionals_loops;

import java.util.Scanner;

public class lowercase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a letter");
        char ch = sc.next().trim().charAt(0);

        if(ch >= 'a' && ch <= 'z'){
            System.out.println(ch+" is lowercase aplhabet");
        }
        else{
            System.out.println(ch+" is not lowercase aplhabet");
        }
        sc.close();

    }
}
