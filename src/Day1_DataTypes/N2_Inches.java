package Day1_DataTypes;

import java.util.Scanner;

/**
 * Created by Agnesa on Sep, 2020
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
