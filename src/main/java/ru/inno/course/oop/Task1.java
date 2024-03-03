package ru.inno.course.oop;

public class Task1 {

    public static void main(String[] args) {
        // 1 программа
        String cardNumber = "1234 5678 9012 3456"; // создаем переменную тип строка
        cardNumber = cardNumber.replaceAll(" ",""); // убираем пробелы с помощью метода replaceAll

        System.out.println(cardNumber.replaceAll(".\\d{11}","**** **** **** ")); // с помощью replaceAll меняем 11 индексов на *
// 2 программа
        int length = cardNumber.length(); // созданна переменная длинна в которой считаются идекс переменной номера карты
        if (length > 12) {
            cardNumber = "**** **** **** " + cardNumber.substring(12, 16);
            System.out.println(cardNumber); // выводим на экран по условию 12-* и 4 послдние цифры номера карты
        }else {
            System.out.println("номер карты содержит только цифры");
        }
    }
}
