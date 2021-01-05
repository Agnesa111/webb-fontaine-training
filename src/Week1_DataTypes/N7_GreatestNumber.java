package Week1_DataTypes;

import java.util.Scanner;

/**
 * Created by Agnesa on Sep, 2020
 *
 * 7. Take three numbers from the user and print the greatest number.
 * Test Data: Input first number: 20
 * Input second number: 67
 * Input 3th number: 87
 * Expected Output: The greatest: 87
 */

public class N7_GreatestNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input the 1st number: ");
        int num1 = in.nextInt();

        System.out.print("Input the 2nd number: ");
        int num2 = in.nextInt();

        System.out.print("Input the 3rd number: ");
        int num3 = in.nextInt();

        if (num1 > num2 && num1 > num3) {
            System.out.println("biggest number is: " + num1);
        } else {
            System.out.println("biggest number is: " + Math.max(num2, num3));
        }
    }
}
