package Week2_LoopsAndArrays;

import java.util.Scanner;

/**
 * Created by Agnesa on Sep, 2020
 * <p>
 * 3. Given 2 arrays, find an element in the first array that doesn’t occur in the second array.
 */

public class N3_ExtraElement {
    public static void main(String[] args) {
        // 1. input and initialize first array
        Scanner scanner = new Scanner(System.in);
        int ARRAYLENGTH = 5;

        int[] firstArray = new int[ARRAYLENGTH];
        System.out.println("Please input first array elements: ");

        for (int i = 0; i < firstArray.length; ++i) {

            while (!scanner.hasNextInt()) {
                System.out.println("Please enter int number: ");
                scanner.next();
            }

            firstArray[i] = scanner.nextInt();
        }

        // 2. print first input array
        for (int element : firstArray) {
            System.out.print(" " + element);
        }

        // 3. input and initialize second array
        int[] secondArray = new int[ARRAYLENGTH];
        System.out.println("Please input second array elements: ");

        for (int i = 0; i < secondArray.length; ++i) {

            while (!scanner.hasNextInt()) {
                System.out.println("Please enter int number: ");
                scanner.next();
            }

            secondArray[i] = scanner.nextInt();
        }

        // 4. print second input array
        for (int element : secondArray) {
            System.out.print(" " + element);
        }

        // 5. find extra element
        int i = 0;
        for (int j = 0; j < secondArray.length; ++j) {
            if (firstArray[i] != secondArray[j]) {
                System.out.println("Extra element: " + firstArray[i]);
            }
            i++;
        }
    }
}