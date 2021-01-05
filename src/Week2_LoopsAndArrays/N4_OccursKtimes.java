package Week2_LoopsAndArrays;

import java.util.Scanner;

/**
 * Created by Agnesa on Sep, 2020
 *
 * 4. Given an array of integers and one integer k, find an element that occurs exactly k times.
 */
public class N4_OccursKtimes {
    public static void main(String[] args) {
        // 1. input and initialize arrays of integers
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

        // 3. input k number
        System.out.println();
        System.out.println("Please input a k number: ");
        int k = scanner.nextInt();

        // 4. find an element which occurs k times
        for (int i = 0; i < inputArray.length; ++i) {
            int counter = 0;

            for (int j = 0; j < inputArray.length; ++j) {
                if (inputArray[i] == inputArray[j]) {
                    counter++;
                }
                if (counter > k) {
                    break;
                }
            }
            if (counter == k) {
                System.out.println("The answer is: " + inputArray[i]);
                break;
            }
        }
    }
}