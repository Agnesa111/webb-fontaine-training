package Week2_LoopsAndArrays;

import java.util.Scanner;

/**
 * Created by Agnesa on Sep, 2020
 * <p>
 * 1. Given an array of integers, create another array that have elements of the first array in reversed order.
 * Input:     [8, 9, 5, 100, 78]
 * Result:   [78, 100, 5, 9, 8]
 */

public class N1_ReversedArray {
    public static void main(String[] args) {
        // 1. input and initialize array of integers
        Scanner scanner = new Scanner(System.in);
        int ARRAYLENGTH = 5;

        int[] inputArray = new int[ARRAYLENGTH];
        System.out.println("Please input array elements: ");

        for (int i = 0; i < inputArray.length; ++i) {

            while (!scanner.hasNextInt()) {
                System.out.println("Please enter int number: ");
                scanner.next();
            }

            inputArray[i] = scanner.nextInt();
        }

        // 2. print input array
        for (int element : inputArray) {
            System.out.print(" " + element);
        }

        // 3. create another array for reversed elements
        int[] reversedArray = new int[ARRAYLENGTH];

        // 4. for -> input array, fill -> reversed array
        int j = 0;
        for (int i = inputArray.length - 1; i >= 0; --i) {
            reversedArray[j] = inputArray[i];
            j++;
        }

        // 5. print reversed array
        System.out.println();
        System.out.println("Printing reversed array: ");
        for (int element : reversedArray) {
            System.out.print(" " + element);
        }

        // 6. finish
        System.out.println();
        System.out.println("Finish!");
    }
}
