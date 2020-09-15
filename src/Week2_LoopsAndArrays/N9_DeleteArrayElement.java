package Week2_LoopsAndArrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Agnesa on Sep, 2020
 * <p>
 * 9. Write a program that will delete the array element of the given index.
 */

public class N9_DeleteArrayElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

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

        System.out.println("Please enter an index: ");
        if (!scanner.hasNextInt() || scanner.nextInt() >= firstArraySize - 1) {
            System.out.println("Please enter valid index: ");
            scanner.next();
        }
        int index = scanner.nextInt();

        int[] secondArray = new int[firstArraySize - 1];

        for (int i = 0, k = 0; i < firstArray.length; i++) {
            if (i == index) {
                continue;
            }
            secondArray[k++] = firstArray[i];
        }
        System.out.print("Array with removed element: " + Arrays.toString(secondArray));
    }
}

