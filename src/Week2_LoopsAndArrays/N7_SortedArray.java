package Week2_LoopsAndArrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Agnesa on Sep, 2020
 * <p>
 * 7. Write a program that will sort the given mass in ascending and descending order. Use Math.random() method for initializing array elements.
 */

public class N7_SortedArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. input array size
        System.out.println("Please enter array size: ");
        if (!scanner.hasNextInt()) {
            System.out.println("Please enter int number: ");
            scanner.next();
        }
        int arraySize = scanner.nextInt();

        // 2. initialize array with random elements
        int[] array = new int[arraySize];
        for (int i = 0; i < array.length; ++i) {
            array[i] = (int) (Math.random() * 10);
        }
        System.out.println("Unsorted array: " + Arrays.toString(array));

        // 3. create method for ascending order
        int temp;
        for (int j = 0; j < arraySize - 1; ++j) {
            if (array[j] > array[j + 1]) {
                temp = array[j];
                array[j] = array[j + 1];
                array[j + 1] = temp;
                j = -1;
            }
        }
        System.out.println("Sorted ascending: ");
        for (int i = 0; i < arraySize; ++i) {
            System.out.print(" " + array[i]);
        }

        // 4. create another array for reversed elements
        int[] reversedArray = new int[arraySize];

        // 5. for -> input array, fill -> reversed array
        int j = 0;
        for (int i = arraySize - 1; i >= 0; --i) {
            reversedArray[j] = array[i];
            j++;
        }

        // 6. print reversed array
        System.out.println();
        System.out.println("Sorted descending: ");
        for (int element : reversedArray) {
            System.out.print(" " + element);
        }
    }
}
