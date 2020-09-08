package Day1_DataTypes;

import java.util.Scanner;

/**
 * Created by Agnesa on Sep, 2020
 */
public class N5_Calculator {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        double num1 = num.nextDouble();

        System.out.println("Enter the second number: ");
        double num2 = num.nextDouble();

        System.out.println("Enter an operator: ");
        char operator = num.next().charAt(0);

        double result;
        switch (operator) {
            case ('+'):
                result = num1 + num2;
                break;
            case ('-'):
                result = num1 - num2;
                break;
            case ('*'):
                result = num1 * num2;
                break;
            case ('/'):
                if (num2 == 0) {
                    System.out.println("Invalid input");
                    return;
                } else
                    result = num1 / num2;
                break;
            default:
                System.out.println("incorrect operator");
                return;
        }
        System.out.println(num1 + " " + operator + " " + num2 + "=" + result);
    }
}
