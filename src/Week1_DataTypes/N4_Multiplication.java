package Week1_DataTypes;

import java.util.Scanner;

/**
 * Created by Agnesa on Sep, 2020
 *
 * 4. Write a program that will prompt you to enter a natural number and print the multiplication table corresponding to the number on the screen.
 Test Data: Input a number: 2
 Expected Output:
 1 X 1 = 1
 1 X 2 = 2
 …………
 1 X 9 = 9
 */

public class N4_Multiplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = input.nextInt();

        System.out.println("The Multiplication Table is:");
        for (int i = 0; i <= 10; i++) {
            System.out.println(num + "*" + (i) + "=" + (num * i));
        }
    }
}
