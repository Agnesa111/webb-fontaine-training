package Week1_DataTypes;

import java.util.Scanner;

/**
 * Created by Agnesa on Sep, 2020
 * <p>
 * 10. Write a program which prints "Odd Number" if the int variable “number” is odd, or “Even Number” otherwise. The program shall always print “bye!” before exiting.
 * Test Data: Input a number: 19
 * Expected Output: Odd Number   bye!
 */

public class N10_OddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number: ");

        if (scanner.hasNextInt()) {
            int a = scanner.nextInt();
            if (a % 2 == 0) {
                System.out.println("Even number");
            } else
                System.out.println("Odd number");

            System.out.println("Bye!");
        } else
            System.out.println("Invalid input");
    }
}