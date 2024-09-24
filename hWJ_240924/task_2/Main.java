package de.telran.homeWorkJava.hWJ_240924.task_2;

public class Main {
    public static void main(String[] args) {
        int x = 345;
        int num1 = x / 100;
        int num2 = (x % 100) / 10;
        int num3 = x % 10;
        System.out.println("Число 345 -> " + num1 + ", " + num2 + ", " + num3);
    }
}
