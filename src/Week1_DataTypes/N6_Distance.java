package Week1_DataTypes;

import java.util.Scanner;

/**
 * Created by Agnesa on Sep, 2020
 * <p>
 * 6. Write a program that will suggest you to enter the coordinates of 2 cities and will calculate:
 * a) The distance between 2 cities
 * b) The middle point between 2 cities
 */

public class N6_Distance {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Latitude 1: ");
        double x1 = input.nextDouble();
        System.out.println("Enter Longitude 1: ");
        double y1 = input.nextDouble();

        System.out.println("Enter Latitude 2: ");
        double x2 = input.nextDouble();
        System.out.println("Enter Longitude 2: ");
        double y2 = input.nextDouble();

        System.out.println("The Distance Is: ");
        System.out.println(Math.pow((y2 - y1), 2));
        System.out.println("Middle Latitude is: " + (x1 + x2) / 2);
        System.out.println("Middle Longitude is: " + (y1 + y2) / 2);
    }
}
