package ru.itmo.lesson09;

import ru.itmo.lesson09.interfaces.CommonInterface;
import ru.itmo.lesson09.utils.Delimiter;
import ru.itmo.lesson09.utils.ParentUtils;
import ru.itmo.lesson09.utils.Upper;

public class Main {
    public static void main(String[] args) {
        CommonInterface logger01 = new Delimiter(new Upper(new ConsoleWriter()));
        logger01.log("сообщение from Delimiter");

        CommonInterface logger02 = new Upper(new Delimiter(new AppFileWriter()));
        logger02.log("сообщение from Upper");
    }
}



/*
Реализовать следующий функционал
  AppLogger logger01 = new Delimiter(new Upper(new ConsoleWriter()));
  logger01.log("сообщение");
После вызова метода log к переданному в метод тексту (с обеих сторон) должны быть добавлены символы === (функционал обеспечивает метод класса Delimiter). Далее переданный в метод текст, к которому уже добавлены символы ===, приводится к верхнему регистру (функционал обеспечивает метод класса Upper). Далее сформированный текст выводится в консоль ( функционал обеспечивает метод класса ConsoleWriter)

    AppLogger logger02 = new Upper(new Delimiter(new AppFileWriter()));
    logger02.log("сообщение");
После вызова метода log переданный в метод текст приводится к верхнему регистру (функционал обеспечивает метод класса Upper). Далее к тексту в верхнем регистре добавляются символы === (функционал обеспечивает метод класса Delimiter). Далее сформированный текст записывается в файл (функционал обеспечивает метод класса AppFileWriter)

    Используйте следующий код для записи в файл:
    try {
        Files.writeString(Paths.get("file-name.txt"), "данные", StandardOpenOption.APPEND);
        // "данные" будут записаны в конец (StandardOpenOption.APPEND) файла "file-name.txt"
    } catch (IOException e) {
        System.out.println("Данные не были записаны");
    }
В программе классы ConsoleWriter и AppFileWriter - классы с основным функционалом (вывод в консоль и запись в файл), могут работать самостоятельно, например:

    ConsoleWriter console = new ConsoleWriter();
    console.log("данные"); // данные будут выведены в консоль

    AppFileWriter file = new AppFileWriter();
    file.log("данные"); // данные будут записаны в файл
Классы Upper и Delimiter обеспечивают дополнительный функционал, их конструктор должен принимать на вход экземпляры классов, обеспечивающих дополнительный функционал или экземпляры классов, обеспечивающих основной функционал. Создавать цепочку дополнительного функционала можно до тех пор, пока в конструктор не будет передан экземпляр основного функционала.

В программе возможно появление новых дополнительных и основных классов.

Подумайте, какие родительские классы и интерфейсы нужно создать и как их использовать, чтобы обеспечить подобный механизм
 */