package ru.inno.course.lessons7;

public class Task4 {
    public static void main(String[] args) {
        String url = "https://vk.com";
        if (url.startsWith("https://")){
            System.out.println("Соединение безопасно");
        } else System.out.println("Небезопано. Не указывайте логины, пароли и данные банковских карт");

    }
}
/*
4. Проверка адреса
Создайте переменную типа String с именем url
Положите в переменную любой http-адрес (http://vk.com, например)
Опишите условие:
Если адрес начинается на https://, напишите "Соединение безопасное"
Иначе напишите "Небезопано. Не указывайте логины, пароли и данные банковских карт"
 */
