package com.company;

import java.util.Random;

public class Exercize_3 {
    public static void main(String[] args) {

        int[][] matrix = new int[10][15];
        int[][] rotatedMatrix = new int[15][10];

        Random random = new Random();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(89) + 10;
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < rotatedMatrix.length; i++) {
            for (int j = rotatedMatrix[i].length - 1; j >= 0; j--) {
                rotatedMatrix[i][j] = matrix[j][i];
                System.out.print(rotatedMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
