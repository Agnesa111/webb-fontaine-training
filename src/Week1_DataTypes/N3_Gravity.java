package Week1_DataTypes;

import java.util.Scanner;

/**
 * Created by Agnesa on Sep, 2020
 *
 * 3. The force of gravity on the Moon is equal to ~ 17%.
 * Write a program that by entering your weight will count your weight on the Moon.
 */

public class N3_Gravity {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your weight: ");
        double normalWeight = input.nextDouble();

        System.out.println("Your weight on moon is : ");
        double weightOnMoon = normalWeight * 0.17;
        System.out.print(weightOnMoon);
    }
}
