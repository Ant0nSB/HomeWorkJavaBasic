package de.telran.homeWorkJava.hWJ_011024.task_3;

import java.util.Scanner;

import static de.telran.homeWorkJava.hWJ_011024.task_3.Methods.exchangeDol;
import static de.telran.homeWorkJava.hWJ_011024.task_3.Methods.exchangeEu;

public class Converter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите сумму в Евро: ");
        double eu = scanner.nextDouble();
        System.out.println("Ваша сумма в долларах (США): " + exchangeDol(eu));

        System.out.println("-----------------------------------");

        System.out.println("Введите сумму в Долларах (США): ");
        double dol = scanner.nextDouble();
        System.out.println("Ваша сумма в Евро: " + exchangeEu(dol));


    }
}
