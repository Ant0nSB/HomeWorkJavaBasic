package de.telran.homeWorkJava.hWJ_011024.task_1;

import java.util.Scanner; // Импортируем класс для работы с вводом данных

public class Wort { // Определяем класс
    public static void main(String[] args) { // Основной метод программы
        Scanner sc = new Scanner(System.in); // Создаём объект Scanner для ввода данных

        // Запрашиваем первое слово
        System.out.println("Введите первое слово с четным количеством букв: ");
        String str = sc.nextLine(); // Считываем первое слово от пользователя

        // Запрашиваем второе слово
        System.out.println("Введите второе слово с четным количеством букв: ");
        String str2 = sc.nextLine(); // Считываем второе слово от пользователя

        // Извлекаем первую половину первого слова
        String firstHalf = str.substring(0, str.length() / 2);
        // Извлекаем вторую половину второго слова
        String secondHalf = str2.substring(str2.length() / 2);

        // Объединяем обе половины
        String result = firstHalf + secondHalf;
        // Выводим результат на экран
        System.out.println("Результат: " + result);


    }
}
