package lab01;

import java.util.Scanner;

public class AddTwoMatrices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int col, row;
        System.out.print("Enter column:");
        col = sc.nextInt();
        System.out.print("Enter row:");
        row = sc.nextInt();

        int[][] matric1 = new int[row][col];
        int[][] matric2 = new int[row][col];
        int[][] sumMatric = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("Enter Matric1[" + i + "][" + j + "]:");
                matric1[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("Enter Matric2[" + i + "][" + j + "]:");
                matric2[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                sumMatric[i][j] = matric1[i][j] + matric2[i][j];
            }
        }
        System.out.println("Result for add matric1 and matric2:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(" " + sumMatric[i][j]);
            }
            System.out.println("");
        }

    }
}
