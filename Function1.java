// print a given name in a function

import java.util.Scanner;

public class Function1 {
    public static void printMyName(String name){
        System.out.println(name);
        return;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;
        name = sc.nextLine();

//        call the function
        printMyName(name);
    }
}
