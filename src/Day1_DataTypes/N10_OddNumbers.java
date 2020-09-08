package Day1_DataTypes;

import java.util.Scanner;

/**
 * Created by Agnesa on Sep, 2020
 */
public class N10_OddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number: ");
        float a = scanner.nextFloat();

        if (a % 2 == 0) {
            System.out.println("Even number");
        } else
            System.out.println("Odd number");

        System.out.println("Bye!");
    }
}
