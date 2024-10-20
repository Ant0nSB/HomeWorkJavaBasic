package de.telran.homeWorkJava.hWJ_161024.task_2;

import java.util.Random;

//Создайте массив из 5 случайных целых чисел из интервала [10;99]
//Выведите его на консоль в строку.
//Определите и выведите на экран сообщение о том, является ли массив строго возрастающей последовательностью.
public class ArrayTwo {
    public static void main(String[] args) {
        Random random = new Random();
        int []arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(10,100);

            System.out.print(arr[i]+ " ");
        }
        boolean isIncreasing = true;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] >= arr[i - 1]){
                isIncreasing = false;
                break;
            }
        }
        if (isIncreasing){
            System.out.println("Массив строго возрастающий.");
        }else {
            System.out.println("Массив не является строго возрастающим.");
        }
    }
}
