package lesson01;

public class Main {
    public static void main(String[] args) {

        int length = 5;
        int weight = 4;

        System.out.println("Площадь равна: " + (length * weight));

        int num = 3;
        System.out.println("Число в кубе равно: " + (num * num * num));


        double time = 3;
        double distance = 15;

        System.out.println("Скорость равна: " + ((distance*1000)/(time * 60 * 60)) + " метров в секунду");


        int number = 79;
        int sumNumber = (int)((number/10) + (number%10));
        System.out.println(" первое число из 79 равно: " + (number/10));
        System.out.println(" второе число из 79 равно: " + (number%10));
        System.out.println(" Сумма чисел 7 и 9 равна: " + sumNumber);

    }
}




/*
Задачи на арифметические операторы
Даны длина, ширина прямоугольника. Найти и вывести в консоль его площадь.

Дано целое число. Найти и вывести в консоль данное число в кубе.

Даны две переменные типа double: время (в часах) и расстояние (в километрах). Найти и вывести в консоль скорость, выраженную в метрах в секунду.

Задача на арифметические! операторы
Если самостоятельно разберетесь с оператором % (взятие остатка от деления). Если не разберетесь, не делайте, обсудим на занятии

Найти сумму цифр 2х значного числа

Например,

для числа 45 сумма цифр равна 9
для числа 11 сумма цифр равна 2
 */