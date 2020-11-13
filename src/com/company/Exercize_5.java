package com.company;

import java.util.Random;

public class Exercize_5 {
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
        for (int i = rotatedMatrix.length - 1; i >= 0; i--) {
            for (int j = 0; j < rotatedMatrix[i].length; j++) {
                rotatedMatrix[i][j] = matrix[j][i];
                System.out.print(rotatedMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
