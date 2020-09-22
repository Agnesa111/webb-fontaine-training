package Week3__FunctionsRecursion;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Agnesa on Sep, 2020
 * <p>
 * Գրել ֆունկցիա, որը տրված զանգվածի արժեքները կբազմապատկի 2-ով եւ կվերադարձնի այն.
 * Օրինակ՝ 	doubling([1, 2, 3]) → [2, 4, 6]
 * doubling([6, 8, 6, 8, -1]) → [12, 16, 12, 16, -2]
 * doubling([]) → []
 */
public class DoubleArrayElements {
    public static void main(String[] args) {
        // 1. input and initialize array of integers
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first array size: ");
        if (!scanner.hasNextInt()) {
            System.out.println("Please enter int number: ");
            scanner.next();
        }
        int firstArraySize = scanner.nextInt();
        int[] inputArray = new int[firstArraySize];

        System.out.println("Please input array elements: ");

        for (int i = 0; i < inputArray.length; ++i) {

            while (!scanner.hasNextInt()) {
                System.out.println("Please enter int number: ");
                scanner.next();
            }

            inputArray[i] = scanner.nextInt();
        }

        // 2. call function which doubles array elements
        doubleArrayElements(inputArray);

        // 3. print doubled array
        System.out.println(Arrays.toString(inputArray));
    }

    // 4. function which doubles array elements
    private static void doubleArrayElements(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] *= 2;
        }
    }
}
