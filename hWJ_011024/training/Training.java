package de.telran.homeWorkJava.hWJ_011024.training;

import java.util.Scanner;

public class Training {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите слово 1 с чётным количеством букв : ");
        String wort1 = scanner.nextLine();

        System.out.println("Введите слово 2 с чётным количеством букв : ");
        String wort2 = scanner.nextLine();

        String oneTail = wort1.substring(0,wort1.length() / 2);

        String twoTail = wort2.substring(wort2.length() / 2);

        String result = oneTail + twoTail;

        System.out.println("Получившийся мутант из двух слов : " + result );
    }
}
