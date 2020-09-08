package Day1_DataTypes;

import java.util.Scanner;

/**
 * Created by Agnesa on Sep, 2020
 */
public class N9_WeekDays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the number ");
        int number = scanner.nextInt();

        switch (number) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("There is no Week-Day corresponding with entered number");
        }
    }
}
