package de.telran.homeWorkJava.hWJ_011024.task_2;

import java.util.Scanner;

import static de.telran.homeWorkJava.hWJ_011024.task_2.Methods.*;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите число : ");
        double num1 = sc.nextDouble();

        System.out.println("Введите второе число : ");
        double num2 = sc.nextDouble();

        System.out.println("Сумма = " + add(num1,num2));
        System.out.println("Разность = " + subtract(num1,num2));
        System.out.println("Произведение = " + multiply(num1,num2));
        System.out.println("Частное = " + divide(num1,num2));
    }
}
