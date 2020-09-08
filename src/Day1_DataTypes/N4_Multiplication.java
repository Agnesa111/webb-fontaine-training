package Day1_DataTypes;

import java.util.Scanner;

/**
 * Created by Agnesa on Sep, 2020
 */
public class N4_Multiplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = input.nextInt();

        System.out.println("The Multiplication Table is:");
        for (int i = 0; i <= 10; i++) {
            System.out.println(num + "*" + (i) + "=" + (num * i));
        }
    }
}
