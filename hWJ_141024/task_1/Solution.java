package de.telran.homeWorkJava.hWJ_141024.task_1;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите температурное значение для колбы 1 : ");
        double temperature1 = scanner.nextDouble();
        System.out.println("Введите температурное значение для колбы 2 : ");
        double temperature2 = scanner.nextDouble();

        System.out.println((temperature1 > 100 && temperature2 < 100) ? "Всё в ажуре!" : "Всему кранты!");
    }
}
