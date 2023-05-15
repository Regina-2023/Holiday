package ru.netology.services;

public class HolidayService {
    public int calculate(int income, int expenses, int threshold) {
        int count = 0; // счётчик месяцев отдыха
        int money = 0; // количество денег на счету

        for (int month = 0; month < 12; month++) {
            if (money >= threshold) { // отдыхаем
                money = (money - expenses) / 3;
                count++; // увеличиваем счётчик месяцев отдыха
            } else { //работаем
                money = money + income - expenses;
            }
        }
        return count;
    }
}
