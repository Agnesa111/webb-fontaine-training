package Week3__FunctionsRecursion;

import java.util.Scanner;

/**
 * Created by Agnesa on Sep, 2020
 * <p>
 * Գրել ֆունկցիա, որը կգումարի եւ կհաշվի իրեն տրված արգումենտների գումարը եւ կվերադարձնի այն; (overloading and varargs)
 * Օրինակ՝   1, 3, 4 -----> result is: 8
 * 2, 4, 8, 5, 6 ----> result is: 25
 * 1, 2   -----> result is: 3
 * 8   ---> result is: 8
 */
public class SumOfArrayElements {
    public static void main(String[] args) {
        // 1. input and initialize array of integers
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter  array size: ");
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

        // 2. call function which calculates sum of array elements
        sumOfArrayElements(inputArray);
    }

    // 3. function which calculates sum of array elements
    private static void sumOfArrayElements(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; ++i) {
            sum += array[i];
        }
        System.out.println("Sum of array is: " + sum);
    }
}