package Week2_LoopsAndArrays;

import java.util.Scanner;

/**
 * Created by Agnesa on Sep, 2020
 * 10. Input a number and the program will print a message a given number of times. The process should continue until the user inputs the number '-1'.
 */

public class N10_PrintMessage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter count of messages: ");
        if (!scanner.hasNextInt()) {
            System.out.println("Please enter int number: ");
            scanner.next();
        }
        int count = scanner.nextInt();

        while (count != -1) {
            for (int i = 1; i <= count; i++) {
                System.out.println("Message" );
            }
            System.out.println("Please enter count of messages: ");
            System.out.println("Enter '-1' for exit");
            if (!scanner.hasNextInt()) {
                System.out.println("Please enter int number: ");
                scanner.next();
            }
            count = scanner.nextInt();
        }
        System.out.println("Exit!");
    }
}
