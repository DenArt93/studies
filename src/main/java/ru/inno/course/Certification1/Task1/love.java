package ru.inno.course.Certification1.Task1;

import java.util.Scanner;

public class love {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // ввод длины забора
        System.out.println("Введите длину забора (в см): ");
        int fenceLength = scanner.nextInt();

        // вычисляем длинну букв = 310
        int lettersLength = 15 / 3 * 62;

        // вычеслить длинну пробелов = 36
       int spaseLength = 12 * 3;

        // вычеслить длинну надписи

       int messageLength = lettersLength + spaseLength;

        // проверка надписи на заборе
        if (messageLength <= fenceLength) {
            System.out.println("Надпись поместиться на заборе!");
        } else {
            System.out.println("Надпись не поместиться на заборе. Не хватает " + (messageLength - fenceLength) + " см.");
        }
    }
}
