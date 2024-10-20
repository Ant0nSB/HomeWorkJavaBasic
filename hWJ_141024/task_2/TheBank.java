package de.telran.homeWorkJava.hWJ_141024.task_2;

import java.util.Scanner;

public class TheBank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сумму на вашем счёте : ");
        int sum = scanner.nextInt();

        int days = 0;
        while (sum > 0) {
            int max = 0;

            for (int i = sum - 1; i > 0; i--) {
                if (sum % i == 0) {
                    max = i;
                    break;
                }
            }
            System.out.println("День " + (days + 1) + " На сегодняшний день вам доступна сумма " + max);
            sum -= max;

            if (sum == 1) {
                System.out.println("День " + (days + 2) + " На сегодняшний день у вас не осталось средств в нашем банке.");
                sum -= 1;
                days++;
                break;
            }
            days++;
        }
        System.out.println("Количество затраченных дней для снятия средств составляет : " + days);
    }
}
