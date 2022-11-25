package lab01;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter a height:");
        int height = keyboard.nextInt();

        for (int i = 0; i < height; i++) {
            for (int j = 1; j <= 2 * height - 1; j++) {
                if (height - i <= j && height + i >= j) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}
