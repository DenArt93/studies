package ru.inno.course.lessons7;

public class Task3 {
    public static void main(String[] args) {
        int balance = 16;
        if (balance % 2 == 0 && balance % 4 == 0) {
            System.out.println("Четное число. Кратно четырем");
        } else {
            if (balance % 2 != 0 && balance % 3 == 0) {
                System.out.println("Нечетное число. Кратно трем.");
            }
        }

    }
}

/*
3. if-else + if
Доработайте решение второго задания:
если число четное И(!) делится на 4 без остатка, напишите "Четное число. Кратно четырем"
если число нечетное И(!) делится на 3 без остатка, напишите "Нечетное число. Кратно трем."
 */
