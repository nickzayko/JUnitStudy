package com.andersen.developer;

public class DeveloperLogic {

//    вычисляет часовую ставку
    public int calculateHourRate(Developer developer){
        return developer.getSalary() / 20 / 8;
    }

//    вычисляем годовой доход
    public int calculateAnnualSalary(Developer developer){
        return developer.getSalary() * 12;
    }
}
