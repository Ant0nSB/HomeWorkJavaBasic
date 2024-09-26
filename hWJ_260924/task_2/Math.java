package de.telran.homeWorkJava.hWJ_260924.task_2;

import java.util.Scanner;

public class Math {

    //Метод сложения
    public static int add(int a, int b) {
        return a + b;
    }

    //Метод вычитания
    public static int subtract(int a, int b){
        return a - b;
    }

    // Метод умножения
    public static int multiply(int a, int b){
        return a * b;
    }

    // Метод деления
    public static double divide(double x, double y){
        return x / y;
    }

    public static void main(String[] args) {


    //        //Сложение
//        int x = 10;
//        int y = 2;
//        int res = x + y;
//        System.out.println("10 + 2 = " + res);
//        System.out.println("---------------------");
//        //Вычитание
//        res = x - y;
//        System.out.println("10 - 2 = " + res);
//        System.out.println("---------------------");
//        //Умножение
//        res = x * y;
//        System.out.println("10 * 2 = " + res);
//        System.out.println("---------------------");
//        //Деление
//        res = x / y;
//        System.out.println("10 / 2 = " + res);


        Scanner scanner = new Scanner(System.in);

        //Сложение
        System.out.println("Введите первое слогаемое число :  ");
        int a = scanner.nextInt();
        System.out.println("Введите второе слогаемое число : ");
        int b = scanner.nextInt();
        System.out.println("Сумма чисел равна : " + add(a , b));

        //Вычитание
        System.out.println("Введите первое число : ");
        a = scanner.nextInt();
        System.out.println("Введите вычитаемое число : ");
        b = scanner.nextInt();
        System.out.println("Разница равна : " + subtract(a , b));

        //Умножение
        System.out.println("Введите первый множитель : ");
        a = scanner.nextInt();
        System.out.println("Введите второй множитель : ");
        b = scanner.nextInt();
        System.out.println("Результат равен : " + multiply(a , b));

        //Деление
        System.out.println("Введите делимое число : ");
        double x = scanner.nextInt();
        System.out.println("Введите делитель : ");
        double y = scanner.nextInt();
        System.out.println("Результат равен : " + divide(x , y));



    }

}
