package lab01;

import java.util.Scanner;
import java.lang.Math;

public class Solve {
    public static void solveFirstDegreeOneVariable() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a:");
        double a = sc.nextDouble();
        if (a == 0) {
            System.out.println("Can't solve!");
            return;
        }
        System.out.println("Input b:");
        double b = sc.nextDouble();
        System.out.println("Result x=" + b / a);
    }

    public static void solveFirstDegreeTwoVariable() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input a11:");
        double a11 = sc.nextDouble();
        System.out.println("Input a12:");
        double a12 = sc.nextDouble();
        System.out.println("Input a21:");
        double a21 = sc.nextDouble();
        System.out.println("Input a22:");
        double a22 = sc.nextDouble();
        System.out.println("Input b1:");
        double b1 = sc.nextDouble();
        System.out.println("Input b2:");
        double b2 = sc.nextDouble();

        double D = a11 * a22 - a21 * a12;
        double Dx = b1 * a22 - b2 * a12;
        double Dy = a11 * b2 - a21 * b1;
        if (D != 0) {
            System.out.println("x1:" + Dx / D);
            System.out.println("x2:" + Dy / D);
        } else if (Dx != 0 || Dy != 0) {
            System.out.println("No solution");
        } else {
            System.out.println("infinitely many solutions");
        }
    }

    public static void solveSecondDegreeOneVariable() {
        Scanner sc = new Scanner(System.in);
        double a, b, c;
        do {
            System.out.println("Input a:");
            a = sc.nextDouble();

        } while (a == 0);
        System.out.println("Input b:");
        b = sc.nextDouble();
        System.out.println("Input c:");
        c = sc.nextDouble();
        double delta = b * b - 4 * a * c;
        if (delta > 0) {
            System.out.println("x1=" + ((-b + Math.sqrt(delta)) / (2 * a)));
            System.out.println("x2=" + ((-b - Math.sqrt(delta)) / (2 * a)));
        } else if (delta == 0) {
            System.out.println("x1=x2=" + (-b / (2 * a)));
        } else {
            System.out.println("No solution");
        }

    }

    public static void main(String[] args) {
        int choice;
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Solve ax+b=0:\n");
        System.out.println("2.Solve a_11*x_1+a_12*x_2=b1");
        System.out.println("        a_21*x_1+a_22*x_2=b2\n");
        System.out.println("3. Solve a*x^2 + b*x +c=0\n");
        System.out.println("Enter your choice:");
        choice = sc.nextInt();

        switch (choice) {
            case 1:
                solveFirstDegreeOneVariable();
                break;
            case 2:
                solveFirstDegreeTwoVariable();
                break;
            case 3:
                solveSecondDegreeOneVariable();
                break;
            default:
                System.out.println("Choice wrong!");
                break;

        }
    }
}
