
// Write a function to calculate the factorial of a number.

import java.util.Scanner;


public class Function3 {
    public static void printFactorial(int n) {
        //loop
        if(n < 0) {
            System.out.println("Invalid Number");
            return;
        }

//        initialize with 1 as factorial value
        int factorial = 1;

        for(int i=n; i>=1; i--) {
            factorial = factorial * i;
        }

        System.out.println(factorial);
        return;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();


        printFactorial(n);
    }
}
