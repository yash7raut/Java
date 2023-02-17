import java.util.Scanner;

public class sum_until_x {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of x");
        int x = input.nextInt();
        int number=0;
        int sum = 0; 
        while(number != x){
            number = input.nextInt();
            sum = sum + number;

        }
        System.out.println("The sum of these numbers is "+sum);
        input.close();
    }
}
