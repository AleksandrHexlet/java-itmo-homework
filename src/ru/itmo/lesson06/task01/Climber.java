package ru.itmo.lesson06.task01;

public class Climber {
    private String name = "Ivan";
    private String address = "Moscow";

    public void setName(String name) {
        if(name.length() > 2) this.name = name;
    }

    public void setAddress(String address) {
        if(address.length() > 4) this.address = address;
    }

    @Override
    public String toString() {
        return "Climber{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}


/*
//Задача 1. Описать объектную модель Альпинист, Гора, Группа для восхождения на гору.
//        Альпинист создаётся с именем (не менее 3 символов) и адресом проживания (не менее 5 символов).
//        Гора создаётся с названием (не менее 4 символов), страной (не менее 4 символов) и высотой (не менее 100 метров)
//        Группа для восхождения на гору создаётся со следующими характеристиками и возможностями:
//        идёт набор в группу или нет;
//        массив альпинистов;
//        гора;
//        должна быть возможность добавить альпиниста в группу (в массив), если набор ещё идёт
//        В методе main (отдельного класса) создать:
//        3 группы для восхождений на 3 различных горы.
//        В первой группе 3 альпиниста (набор закрыт)
//        Во второй и третьей группах по 2 альпиниста (набор в эти группы открыт)
//        При выполнении задания необходимо обращать внимание на модификаторы доступа и выполнять все необходимые проверки.
 */