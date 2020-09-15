package Week2_LoopsAndArrays;

import java.util.Scanner;

/**
 * Created by Agnesa on Sep, 2020
 * <p>
 * 6. Represent the given two-dimensional array in the same sequence of a one-dimensional array.
 */

public class N6_TwoDimensionalToOneDimensional {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. input first array
        System.out.println("Enter first array size: ");
        if (!scanner.hasNextInt()) {
            System.out.println("Please enter int number: ");
            scanner.next();
        }
        int firstArraySize = scanner.nextInt();

        // 2. input second array
        System.out.println("Enter second array size: ");
        if (!scanner.hasNextInt()) {
            System.out.println("Please enter int number: ");
            scanner.next();
        }
        int secondArraySize = scanner.nextInt();

        //3. make two-dimensional array
        int[][] array = new int[firstArraySize][secondArraySize];
        for (int i = 0; i < firstArraySize; ++i) {
            for (int j = 0; j < firstArraySize; ++j) {
                array[i][j] = (int) (Math.random() * 10);
                System.out.print(" " + array[i][j] + " ");
            }
        }
    }
}
