package ru.itmo.lesson19.task03;

import ru.itmo.lesson14.task.task01.Fruit;

import java.util.Optional;

public class Task03 {
    public static void main(String[] args) {


        // Задания на методы Optional:
        // 1. написать метод, который принимает на вход тип фрукта, стоимость и количество
        // и возвращает Optional контейнер с экземпляром типа Fruit
        // или Optional контейнер с null ссылкой, если тип фрукта == null, а стоимость или количество меньше 1

        // 2. написать метод, который принимает на вход экземпляр типа Fruit
        // и возвращает true, если его передан не null, количество фруктов больше 5, а стоимость не больше 100
        // Вместо обычных проверок использовать тип Optional и подходящие методы

        // 3. написать метод, который принимает на вход экземпляр типа Fruit
        // и возвращает
        // название фрукта (FruitType.getName()) в Optional контейнере, если тип фрукта определен,
        // и Optional контейнер с null ссылкой, если тип фрукта == null
        // Вместо обычных проверок использовать тип Optional и подходящие методы


        OptionalMethods optionalMethods = new OptionalMethods();
        Fruit fruit1 = new Fruit(Fruit.FruitType.APPLE,10,20);
        Fruit fruit2 = new Fruit(Fruit.FruitType.BANANA,90,920);


        System.out.println("optionalContainer02 = " + optionalMethods.optionalContainer02(fruit1));
        System.out.println("optionalContainer01 = " + optionalMethods.optionalContainer01(fruit1.getType(),123,456));
        System.out.println("optionalContainer03 = " + optionalMethods.optionalContainer03(fruit2));


    }


}


