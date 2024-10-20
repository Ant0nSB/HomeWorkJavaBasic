package de.telran.homeWorkJava.hWJ_161024.task_1;
//Создайте массив из 8 случайных целых чисел из интервала [1;50]
//Выведите массив на консоль в строку.
//Замените каждый элемент с нечетным индексом на ноль.
//Снова выведете массив на консоль в отдельной строке.
import java.util.Random;

public class ArrayOne {
    public static void main(String[] args) {
        Random ran = new Random();
        int[] arr = new int[8];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = ran.nextInt(50) + 1;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            if(arr[i] % 2 != 0){
                arr[i] = 0;
            }
        }
        System.out.println("\nМассив после замены нечётных чисел на 0:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}