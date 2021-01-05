package Week3__FunctionsRecursion;

/**
 * Created by Agnesa on Sep, 2020
 * <p>
 * Գրել ֆունկցիաներ, որոնք ստանալով երկու զանգված, կանեն հետեւյալը՝
 * * կմիացնի այդ զանգվածները եւ կվերադարձնի այն.
 * * կգումարի առաջի եւ երկրորդ զանգվածների միջին թվաբ-ը եւ կվերադարձնի
 */

import java.util.Arrays;
import java.util.Scanner;

public class ConcatTwoArraysAndCalculateAverage {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
// input first array
        System.out.println("Enter  first array size: ");
        if (!scanner.hasNextInt()) {
            System.out.println("Please enter int number: ");
            scanner.next();
        }
        int firstArraySize = scanner.nextInt();
        int[] inputFirstArray = new int[firstArraySize];

        System.out.println("Please input array elements: ");

        for (int i = 0; i < inputFirstArray.length; ++i) {

            while (!scanner.hasNextInt()) {
                System.out.println("Please enter int number: ");
                scanner.next();
            }

            inputFirstArray[i] = scanner.nextInt();
        }
// input second array
        System.out.println("Enter  second array size: ");
        if (!scanner.hasNextInt()) {
            System.out.println("Please enter int number: ");
            scanner.next();
        }
        int secondArraySize = scanner.nextInt();
        int[] inputSecondArray = new int[secondArraySize];

        System.out.println("Please input array elements: ");

        for (int i = 0; i < inputSecondArray.length; ++i) {

            while (!scanner.hasNextInt()) {
                System.out.println("Please enter int number: ");
                scanner.next();
            }

            inputSecondArray[i] = scanner.nextInt();
        }

        int thirdArray[] = new int[firstArraySize + secondArraySize];

        concatArrays(inputFirstArray, inputSecondArray, thirdArray);
        System.out.println("Concatenation of two arrays is: " + Arrays.toString(thirdArray));

        System.out.println("Average of two arrays is: " + avg((inputFirstArray)) + avg((inputSecondArray)));
    }

    private static void concatArrays(int[] firstArray, int[] secondArray, int[] thirdArray) {
        for (int i = 0; i < firstArray.length; i++) {
            thirdArray[i] = firstArray[i];
        }
        for (int i = firstArray.length, j = 0; j < secondArray.length; i++, j++) {
            thirdArray[i] = secondArray[j];
        }
    }

    private static double avg(int[] array) {
        int x = 0;
        for (int i = 0; i < array.length; i++) {
            x = x + array[i];
        }
        return (double) x / array.length;
    }
}
