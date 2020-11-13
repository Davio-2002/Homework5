package com.company;

import java.util.Random;

public class Exercise_1 {

    public static void main(String[] args) {

        int[][] matrix = new int[10][15];
        Random random = new Random();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(89) + 10;
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        int min = matrix[0][0];
        for (int[] ints : matrix) {
            for (int anInt : ints) {
                if (anInt < min) {
                    min = anInt;
                }
            }
        }
        System.out.println("Minimum number is : " + min);
    }
}