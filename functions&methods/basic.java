import java.util.Scanner;

public class basic {
    public static void main(String[] args) {
        int ans = sum();
        System.out.println(ans);
    }
    static int sum(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = sc.nextInt();
        System.out.println("Enter the 2nd Number");
        int b = sc.nextInt();
        int answer = a + b;
        sc.close();
        return answer;
    }
}
