package com.company;

import java.util.Random;
import java.util.Scanner;

public class Exercize_6 {

    public static void main(String[] args) {

        int[][] matrix = new int[10][15];
        int[][] rotatedMatrix = new int[15][10];

        Scanner src = new Scanner(System.in);
        Random random = new Random();

        System.out.println();

        System.out.println("Original matrix :");
        System.out.println("--------------------------------------------");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(89) + 10;
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("--------------------------------------------");
        System.out.println();
        while (true) {

            System.out.println("For 90 degrees press 1");
            System.out.println("For 180 degrees press 2");
            System.out.println("For 270 degrees press 3");
            System.out.println("For program termination press 4\n");

            System.out.print("Option (1, 2, 3 or 4) -> ");

            int option = src.nextInt();

            System.out.println();

            switch (option) {
                // 90 degrees clockwise
                case 1 -> {
                    System.out.println("This matrix is rotated in 90 degrees");
                    System.out.println("-----------------------------");
                    for (int i = 0; i < rotatedMatrix.length; i++) {
                        for (int j = rotatedMatrix[i].length - 1; j >= 0; j--) {
                            rotatedMatrix[i][j] = matrix[j][i];
                            System.out.print(rotatedMatrix[i][j] + " ");
                        }
                        System.out.println();
                    }
                    System.out.println("-----------------------------");
                }
                // 180 degrees clockwise
                case 2 -> {
                    System.out.println("This matrix is rotated in 180 degrees");
                    System.out.println("--------------------------------------------");
                    for (int i = 0; i < matrix.length; i++) {
                        for (int j = 0; j < matrix[i].length; j++) {
                            System.out.print(matrix[matrix.length - i - 1][matrix[i].length - 1 - j] + " ");
                        }
                        System.out.println();
                    }
                    System.out.println("--------------------------------------------");
                }
                // 270 degrees clockwise
                case 3 -> {
                    System.out.println("This matrix is rotated in 270 degrees");
                    System.out.println("-----------------------------");
                    for (int i = rotatedMatrix.length - 1; i >= 0; i--) {
                        for (int j = 0; j < rotatedMatrix[i].length; j++) {
                            rotatedMatrix[i][j] = matrix[j][i];
                            System.out.print(rotatedMatrix[i][j] + " ");
                        }
                        System.out.println();
                    }
                    System.out.println("-----------------------------");
                }
                // Exit program
                case 4 -> {
                    System.out.println("Termination...");
                    System.exit(0);
                }
                default -> System.out.println("Something went wrong. Try again\n");
            }
        }
    }
}