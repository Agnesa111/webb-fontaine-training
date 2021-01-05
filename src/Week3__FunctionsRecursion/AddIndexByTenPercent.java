package Week3__FunctionsRecursion;

import java.util.Scanner;

/**
 * Created by Agnesa on Sep, 2020
 * <p>
 * Գրել ֆունկցիա, որը տրված զանգվածի տրված ինդեքսի արժեքը կմեծացնի 10% -ով.
 */
public class AddIndexByTenPercent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter array size: ");
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

        for (double d : increaseIndexBy10Percent(inputArray, 0)) {
            System.out.println(d);
        }
    }

    private static double[] increaseIndexBy10Percent(int[] arr, int index) {
        double[] increasedArray = new double[ arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (i == index) {
                increasedArray[i] = arr[i] * 0.1;
                continue;
            }
            increasedArray[i] = arr[i];
        }
        return increasedArray;
    }
}
