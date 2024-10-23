package de.telran.homeWorkJava.hWJ_221024.task_1;

public class Arr {
    public static void main(String[] args) {
        int[] arrOne = {1, 2, 3, 4, 5, 7}; // Массив с пропущенным элементом
        int n = arrOne.length + 1;   // Количество элементов от 1 до n (здесь n = 5)

        // Находим полную сумму чисел от 1 до n
        int fullSum = n * (n + 1) / 2;

        // Суммируем все элементы массива
        int sum = 0;
        for (int i = 0; i < arrOne.length; i++) {
            sum += arrOne[i];
        }

        // Вычисляем недостающее число
        int missingNumber = fullSum - sum;

        System.out.println("Недостающее число: " + missingNumber);
    }
}

