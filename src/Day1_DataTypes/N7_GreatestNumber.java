package Day1_DataTypes;

import java.util.Scanner;

/**
 * Created by Agnesa on Sep, 2020
 */
public class N7_GreatestNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input the 1st number: ");
        int num1 = in.nextInt();

        System.out.print("Input the 2nd number: ");
        int num2 = in.nextInt();

        System.out.print("Input the 3rd number: ");
        int num3 = in.nextInt();

        if (num1 >= num2 && num1 >= num3) {
            System.out.println("The greatest: " + num1);
        } else if (num2 >= num1 && num2 >= num3) {
            System.out.println("The greatest: " + num2);
        } else
            System.out.println("The greatest: " + num3);
    }
}
