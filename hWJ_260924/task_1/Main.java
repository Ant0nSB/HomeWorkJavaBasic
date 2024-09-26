package de.telran.homeWorkJava.hWJ_260924.task_1;

public class Main {
    public static void main(String[] args) {
        String str = new String("I study Basic Java!");//Создание строки через "New"
        System.out.println(str.charAt(str.length()-2));// Распечатать предпоследний символ строки
        System.out.println(str.contains("Java"));//Проверка на содержание подстроки "Java".
        //Вырезать строку Java c помощью метода String.substring().
        System.out.println(str.substring(str.indexOf("Java"),str.indexOf("Java")+4));

        //Заменить все символы “а” на “о”.
        System.out.println(str.replace('a','o'));
        System.out.println(str.toLowerCase());//Строка в нижнем регистре
        System.out.println(str.toUpperCase());//Строка в верхнем регистре

        //Удаление подстроки"Java"
        str = str.replace("Java","");
        System.out.println(str);

    }
}
