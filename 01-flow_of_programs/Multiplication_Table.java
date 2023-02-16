import java.util.Scanner;

public class Multiplication_Table {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Number");
        int number = input.nextInt();
        for(int i=1; i<=10; i++){
            System.out.println(number+" x "+i+" = "+number*i);
        }
        input.close();

    }
}
