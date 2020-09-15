package Week2_LoopsAndArrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Agnesa on Sep, 2020
 * <p>
 * 5. Write a program that will convert the entered number into an array.
 * Input:     187
 * Result:   [1, 8, 7]
 */

public class N5_ConvertNumberToArray {
    public static void main(String[] args) {
        // 1. input a number
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int number = scanner.nextInt();

        // 2. get number's length
        String str = Integer.toString(number);
        int length = str.length();
        char[] arr = new char[length];

        // 3. cycling on array char by char
        for (int i = 0; i < length; i++) {
            arr[i] = str.charAt(i);
        }
        System.out.println("Converted array: " + Arrays.toString(arr));
    }
}
