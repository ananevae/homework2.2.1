package com.company;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static int SIZE = 8;

    public static void printMatrix(int colors[][]) {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.format("%4d", colors[i][j]);
            }
            System.out.println();
        }
    }

    public static void rotate90(int colors[][], int rotatedColors[][]) {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                rotatedColors[i][j] = colors[SIZE - j - 1][i];
            }
        }
    }

    public static void main(String[] args) {
        int[][] colors = new int[SIZE][SIZE];

        Random random = new Random();
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                colors[i][j] = random.nextInt(256);
            }
        }

        printMatrix(colors);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите угол поворота, кратный 90");
        int angle = scanner.nextInt();

        int[][] rotatedColors = new int[SIZE][SIZE];
        for (int ii = 0; ii < angle/90; ii++) {
            rotate90(colors, rotatedColors);
            for (int i = 0; i < SIZE; i++) {
                for (int j = 0; j < SIZE; j++) {
                    colors[i][j] = rotatedColors[i][j];
                }
            }
        }
        printMatrix(rotatedColors);
    }
}
