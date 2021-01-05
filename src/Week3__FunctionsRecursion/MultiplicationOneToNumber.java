package Week3__FunctionsRecursion;

import java.util.Scanner;

/**
 * Created by Agnesa on Sep, 2020
 */
public class MultiplicationOneToNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number:");
        int num = scanner.nextInt();
        System.out.println(String.format("The Multiplication is %d", multi(num)));
    }

    static int multi(int n) {
        if (n != 0 && (n - 1 != 0)) {
            return n * multi(n - 1);
        } else {
            return n;
        }
    }
}
