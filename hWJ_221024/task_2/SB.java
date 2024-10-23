package de.telran.homeWorkJava.hWJ_221024.task_2;

public class SB {
    public static void main(String[] args) {
        // Задаём массив строк с параметрами: ключи и значения идут последовательно
        String[] params = {"model", "V-60", "country", "Germany", "city", "Berlin", "year", null, "active", "true"};

        // Создаём StringBuilder для формирования SQL-запроса
        StringBuilder query = new StringBuilder("SELECT * FROM cars WHERE ");

        // Переменная для отслеживания, добавлено ли первое условие (чтобы правильно поставить AND)
        boolean firstCondition = true;

        // Проходим по массиву с шагом 2, так как параметры идут парами: "ключ" -> "значение"
        for (int i = 0; i < params.length; i += 2) {
            String key = params[i];   // Ключ (например, "model")
            String value = params[i + 1]; // Значение (например, "V-60")

            // Проверяем, что значение не null
            if (value != null) {
                // Если это не первое условие, добавляем "AND"
                if (!firstCondition) {
                    query.append(" AND ");
                }

                // Добавляем ключ и значение в запрос
                query.append(key).append(" = '").append(value).append("'");
                firstCondition = false; // После первого условия добавляем "AND"
            }
        }

        // Выводим итоговый запрос
        System.out.println(query.toString());
    }
}
