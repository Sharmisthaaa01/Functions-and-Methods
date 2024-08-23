
//Make a function to print the table of a given number n.

import java.util.Scanner;

public class Function6 {
    public static void printTable (int n){

        for (int i = 1; i <= 10; i++) {
            System.out.println((n*i));
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printTable(n);
    }
}

