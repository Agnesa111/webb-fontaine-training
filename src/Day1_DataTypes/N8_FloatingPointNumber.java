package Day1_DataTypes;

import java.util.Scanner;

/**
 * Created by Agnesa on Sep, 2020
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
