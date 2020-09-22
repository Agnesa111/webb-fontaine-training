package Week3__FunctionsRecursion;

import java.util.Scanner;

/**
 * Created by Agnesa on Sep, 2020
 * <p>
 * Գրել ֆունկցիա, որը կհաշվի եռանկյան մակերեսը ըստ տրված 3 կողմերի եւ կվերադարձնի այն (ստուգել նաեւ թե կարող է արդյոք այդ 3 կողմերով կազմվել եռանկյուն)
 * Expected Output:
 * Input Side-1: 10
 * Input Side-2: 15
 * Input Side-3: 20
 * The area of the triangle is 72.6184377413890
 */
public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input Side-1: ");
        double side1 = scanner.nextDouble();

        System.out.print("Input Side-2: ");
        double side2 = scanner.nextDouble();

        System.out.print("Input Side-3: ");
        double side3 = scanner.nextDouble();

        if (isTriangleValid(side1, side2, side3)){
            System.out.println("The area of the triangle is " + areaOfTriangle(side1, side2, side3));
        }
        else
            System.out.println("Invalid input");
    }

    private static boolean isTriangleValid(double side1, double side2, double side3) {
        if (side1 + side2 > side3 && side2 + side3 > side1 && side1 + side3 > side2)
            return true;
        else
            return false;
    }

    private static double areaOfTriangle(double side1, double side2, double side3) {
        double area = 0;
        double s = (side1 + side2 + side3) / 2;
        area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
        return area;
    }
}
