package de.telran.homeWorkJava.hWJ_221024.task_3;

public class Order {
    public static void main(String[] args) {
        int a = 7;
        int b = 0;
        int c = -5;
        int temp;  // Временная переменная для смены значений

//        if (a > b && a > c) {
//            a = d;
//            c = Math.min(b, c);
//            b = Math.max(b, c);
//        }
//        if (b > a && b > c) {
//            b = d;
//            b = Math.min(a, c);
//            a = Math.max(a, c);
//        }
//        if (c > a && c > b) {
//            c = d;
//            a = Math.min(a, b);
//            c = Math.max(a, b);
//        }
//            if (a > b && a > c){
//                a = d;
//                c = a;
//                d = c;
//            } else if (b > a && b > c) {
//                d = b;
//            } else if (c > a && c > b) {
//                d = c;
//            }



        // Сравниваем и переставляем числа, чтобы a <= b <= c
        if (a > b) {
            temp = a;
            a = b;
            b = temp;  // Меняем местами a и b, если a больше
        }
        if (b > c) {
            temp = b;
            b = c;
            c = temp;  // Меняем местами b и c, если b больше
        }
        if (a > b) {
            temp = a;
            a = b;
            b = temp;  // Снова проверяем a и b
        }
        System.out.println(a + "," + b + "," + c);
    }
}
