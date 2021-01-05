package Week2_LoopsAndArrays;

import java.util.Scanner;

/**
 * Created by Agnesa on Sep, 2020
 * <p>
 * 2. Write a program that will calculate the arithmetic mean of array elements (type of elements: double, array size: 10).
 */

public class N2_ArithmeticMean {
    public static void main(String[] args) {
        // 1. input and initialize array of doubles
        Scanner scanner = new Scanner(System.in);
        int ARRAYLENGTH = 10;

        double[] inputArray = new double[ARRAYLENGTH];
        System.out.println("Please input 10 array elements: ");

        for (int i = 0; i < inputArray.length; ++i) {

            while (!scanner.hasNextDouble()) {
                System.out.println("Please enter double number: ");
                scanner.next();
            }

            inputArray[i] = scanner.nextDouble();
        }

        // 2. calculation of arithmetic mean
        double sum = 0;
        for (int i = 0; i < inputArray.length; ++i) {
            sum += inputArray[i];
        }
        System.out.println("Arithmetic mean of array is: " + sum / ARRAYLENGTH);
    }
}
