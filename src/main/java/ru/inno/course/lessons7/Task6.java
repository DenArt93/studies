package ru.inno.course.lessons7;

public class Task6 {
    public static void main(String[] args) {
        String password = "Qwerty09876543";
        if (password.equals("Qwerty0987654321")){
            System.out.println("Доступ разрешен");
        } else System.out.println("Доступ запрещен");
    }


}



/*
6. Сравнение строк
Переменная String с именем password
Если пароль равен "Qwerty0987654321", написать "Доступ разрешен"
Иначе "Доступ запрещен"
Помните, что строки сравниваются через метод equals()
 */