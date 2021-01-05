package Week2_LoopsAndArrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Agnesa on Sep, 2020
 * <p>
 * 8. Write a program that will find and separate the repeating values of two given arrays.
 * Input:     [1,45,6, 72]     [3,4,45,71,1]
 * Result:    [45, 1]
 */

public class N8_RepeatedValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. input first array
        System.out.println("Enter first array size: ");
        if (!scanner.hasNextInt()) {
            System.out.println("Please enter int number: ");
            scanner.next();
        }
        int firstArraySize = scanner.nextInt();
        int[] firstArray = new int[firstArraySize];
        for (int i = 0; i < firstArraySize; ++i) {
            firstArray[i] = (int) (Math.random() * 10);
        }
        System.out.println("First array is: " + Arrays.toString(firstArray));

        // 2. input second array
        System.out.println("Enter second array size: ");
        if (!scanner.hasNextInt()) {
            System.out.println("Please enter int number: ");
            scanner.next();
        }
        int secondArraySize = scanner.nextInt();
        int[] secondArray = new int[secondArraySize];
        for (int i = 0; i < secondArraySize; ++i) {
            secondArray[i] = (int) (Math.random() * 10);
        }
        System.out.println("Second array is: " + Arrays.toString(secondArray));

        // 3. find repeated elements
        System.out.println("Repeated elements in given arrays are: ");
        for (int i = 0; i < firstArraySize - 1; i++) {
            for (int j = 0; j < secondArraySize - 1; j++) {
                if (firstArray[i] == secondArray[j]) {
                    System.out.print(firstArray[i] + " ");
                }
            }
        }
    }
}
