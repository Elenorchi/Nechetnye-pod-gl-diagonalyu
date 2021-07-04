package com.TMS;

/* Создаём квадратную матрицу, размер вводим с клавиатуры. Заполняем
случайными числами в диапазоне от 0 до 50. И выводим на консоль(в виде
матрицы).
Вывести нечетные элементы находящиеся под главной
диагональю(включительно). */


import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rnd = new Random();
        int b = 0;
        System.out.println("Введите размер кв.матрицы: ");
        int a = scan.nextInt();
        int[][] massive = new int[a][a];
        for (int i = 0; i < massive.length; i++) {
            for (int j = 0; j < massive[i].length; j++) {
                massive[i][j] = rnd.nextInt(50);
                System.out.print(massive[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < massive.length; i++) {
            for (int j = 0; j <= i; j++) {
                if (massive[i][j] % 2 != 0) {
                    System.out.print(massive[i][j] + " ");
                }
            }
        }
    }
}