package Week1_DataTypes;

import java.util.Scanner;

/**
 * Created by Agnesa on Sep, 2020
 *
 * 8. Write a program that reads a floating-point number and prints "zero" if the number is zero. Otherwise, print "positive" or "negative". Add "small" if the absolute value of the number is less than 1, or "large" if it exceeds 1,000,000.
 * Test Data: Input a number: 20.6
 * Expected Output: positive
 */

public class N8_FloatingPointNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a number: ");
        float number = in.nextFloat();
        if (number > 0) {
            if (number < 1) {
                System.out.println("Positive Small");
            } else if (number > 1000000) {
                System.out.println("Positive Large");
            } else {
                System.out.println("Positive");
            }
        } else if (number < 0) {
            if (Math.abs(number) < 1) {
                System.out.println("Negative Small");
            } else if (Math.abs(number) > 1000000) {
                System.out.println("Negative Large");
            } else {
                System.out.println("Negative");
            }
        } else if (number==0){
            System.out.println("Zero");
        }
    }
}
