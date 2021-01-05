package Week1_DataTypes;

import java.util.Scanner;

/**
 * Created by Agnesa on Sep, 2020
 *
 * 2. Write a program that reads a number in inches, converts it to meters.
 * Note: One inch is 0.0254 meter.
 * Test Data: Input a value for inch: 1000
 * Expected Output: 1000.0 inch is 25.4 meters
 */

public class N2_Inches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double inchToMeter = 0.0254;

        System.out.print("Input a value for inch: ");
        double inch = input.nextDouble();

        double meters = inch * inchToMeter;
        System.out.println(inch + " inch is " + meters + " meters");
    }
}
