package com.company;

import java.util.Random;
import java.util.Scanner;

public class Exercize_2 {
    public static void main(String[] args) {

        int[][] matrix = new int[5][6];

        Random random = new Random();
        Scanner src = new Scanner(System.in);

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(89) + 10;
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        int index = src.nextInt();
        int sum = 0;
        for (int i = index - 1; i != index; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
            }
        }
        System.out.println(sum);
    }
}
