package first_java;

import java.util.Scanner;

public class palindrome_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String revstr = "";
        int strlength = str.length();
        for( int i = (strlength - 1); i >= 0; i-- ){
            revstr = revstr + str.charAt(i);
        }
        if(str.toLowerCase().equals(revstr.toLowerCase())){
            System.out.println(str+" is a palindrome");
        }
        else{
            System.out.println(str+ " is not a palindrome");
        }
        sc.close();
    }
}
