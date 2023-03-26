package lesson04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        var x = 100;
        var y = 7l;
        var z = x + y; // 16. какой тип данных переменной z? Тип long

        var in01 = new Scanner(System.in); // 17. какой тип данных переменной in01? Тип Scanner

        // 18. в чём причина ошибки? исправьте её
        int code;
        code = 1;

        // 19. найти и исправить ошибки
        String login = "qwerty";
        String token = "22ffr";
        if (login.equals("qwerty") || token.equals("22ffr")) {
            System.out.println("Токен и логин указаны верно, Вы вошли в систему");
        }

        // 20. найти и исправить ошибки
        Scanner in02 = new Scanner(System.in);
        System.out.println("Введите возраст");
        int age = in02.nextInt();
        if (age < 18 && age > 200) {
            System.out.println("Вы не можете совершать покупки");
        } else if (age >= 18 || age <= 200) {
            System.out.println("Вы можете совершать покупки");
        }

        // 21. найти и исправить ошибки
        Scanner in03 = new Scanner(System.in);
        System.out.println("Где хранятся строки в Java? Введите один из вариантов: пул строк, куча, хранилище строк.");
        String answer = in03.nextLine();
        switch (answer) {
            case "пул строк":
                System.out.println("Вы ввели верный вариант");
            case "куча":
                System.out.println("Вы правы, но лучше уточнить");
            case "хранилище строк":
            default:
                System.out.println("Вы ошиблись");
        }


        // 22. найти и исправить ошибку в решении задачи:
        // напечатать числа от 100 до 0, включая 100 и 0
        int start = 100;
        while (start >= 0) {
            System.out.println(start);
            --start;

        }

        // 23. сколько раз будут выполнены инструкции из тела цикла?
        int first = 1, last = 15;  //Ноль раз; first > last  выдаст false
        for (; first > last; first++) {
            System.out.println(first);
        }

        // 24. Ответьте на вопросы:
        // 1. к какому блоку цикла for перейдет программа, когда значение переменной i будет равно 15,
        // к проверке условия или обновлению счётчиков?  Программа перейдёт к обновлению счётчиков.
        // 2. Сколько раз произойдёт инициализация переменной i?  30 раз
        for (int i = 0; i < 30; i++) {
            if (i == 15) continue;
            System.out.println(i);

        }
    }
}

/*
        //   1. Что означает инициализация переменной? === присвоение значения переменной
        // 2. Из каких символов может состоять имя переменной? === Буквы, числа,подчеркивания, тире. Пробелы не допустимы

        // 3. Будет ли ошибкой использование кириллических символов в именах переменных? ===  Нет, не будет !
        // 4. Какие примитивные типы есть в Java? === byte, short, int, long,float, double,boolean, char

        // 5. Что такое var? ===  переменная (тип undefined) , тип данных которой будет опредлён позже
        // 6. Сколько байт занимает в памяти переменная типа long?  === 8 byte

        // 7. Что такое явное приведение типов? === указание конкретного типа к которому мы хотим привести значение
        // 8. Какой тип данных мы получим в результате сложения short и byte? === int

        // 9. Какой тип данных мы получим в результате сложения long и float? === float
        // 10. Как работает оператор && ? ===  если одно из сравнений раавно false, всё выражение бужет  false

        // 11. Что такое тело цикла? === набор инструкций внутри цикла
        // 12. Что такое итерация цикла? === одно выполнение инструкций из тела

        // 13. Каким образом можно прервать выполнение цикла? === break, return, continie


        // 14. Как будет работать следующее ветвление, если значение переменной равно 18 и если значение переменной равно 14?
             // if (age >= 18) System.out.println("Вы можете просматривать товары и совершать покупки");
        // else if (age < 18) System.out.println("Вы можете просматривать товары, но не совершать покупки");
        ===  при age = 18  выполнится условия из if ; при age = 14  выполнится условия из if else

        // 15. Для чего программам нужен метод main?===это точка входа в приложение,с него начинается выполнение программы
 */