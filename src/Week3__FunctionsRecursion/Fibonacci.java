package Week3__FunctionsRecursion;

import java.util.Scanner;

/**
 * Created by Agnesa on Sep, 2020
 */
public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        if (!scanner.hasNextInt()) {
            System.out.println("Please enter int number: ");
            scanner.next();
        }
        int n = scanner.nextInt();
        System.out.println(fib(n));
    }

    static int fib(int n)
    {
        if (n <= 1)
            return n;
        return fib(n-1) + fib(n-2);
    }
}
