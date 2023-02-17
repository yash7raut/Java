package first_java;

import java.util.Scanner;

public class greeting_message {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter your Name");
        String input = sc.nextLine();
        System.out.println("Greeting's to you "+input+". What's on your mind for today." );
        sc.close();
    }
}
