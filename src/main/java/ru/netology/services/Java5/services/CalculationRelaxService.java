package ru.netology.services.Java5.services;

public class CalculationRelaxService {
    public int RelaxService(int income, int exspenses, int threshold) {

        int count = 0; // счетчик месяцев отдыха
        int money = 0; // количество денег на счету

        for (int month = 0; month < 12; month++) {

            if (money >= threshold) { // можем ли отдыхать
                count++; // увеличиваем счетчик месяцев отдыха
                money = money - exspenses;
                money = money / 3;

            } else {
                money = money + income - exspenses;
            }
        }
        return count;

    }
}
