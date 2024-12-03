package ru.netology.services.Java5.services;


public class Main {
    public static void main(String args[]) {
        CalculationRelaxService service = new CalculationRelaxService();
        System.out.print("Месяцы работы фрилансера = ");
        System.out.print(service.RelaxService(10000, 3000, 20000));
    }
}

