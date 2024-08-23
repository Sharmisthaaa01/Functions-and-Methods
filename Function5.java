//Make a function to check if a given number n is even or not.

import java.util.Scanner;
public class Function5 {
    public static void multiplyTwoNumbers(int a, int b) {
        int c = a*b;
        System.out.println(c);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        multiplyTwoNumbers(a, b);
    }
}
