package ru.inno.course.basics;

public class Homework1 {
    // проверка строки на пустое значение. Возвращаем true или false
    public static void main(String[] args) {
        System.out.println("isBlank() проверяем если строка пуста или содержит только кодовые точки пробелов.");
        String str = "";
        Boolean result = str.isBlank();
        System.out.println(result);

        System.out.println("isEmpty() Проверяем строку на пустоту и возвращаем true или false");
        String str1 = "  ";
        Boolean result1 = str1.isEmpty();
        System.out.println(result1);

        System.out.println("substring Проверяем возвращение буквы заданого индекса слова waRzone");
        String r = "warzone";
        String result2 = r.substring(2, 3);
        System.out.println(result2);

        System.out.println("indexOf Проверяем идекс первой определенной буквы wArzone");
        String rr = "warzone";
        int result3 = rr.indexOf("o", 1);
        System.out.println(result3);

        System.out.println("lastIndexOf Проверяем идекс последней определенной буквы слова innopolis");
        String rrr = "innopolis";
        int result4 = rrr.lastIndexOf("n", 8);
        System.out.println(result4);

        System.out.println("toLowerCase Проверяем преобразование в нижний регистр INNOPOLIS");
        String rrrr = "INNOPOLIS";
        String result5 = rrrr.toLowerCase();
        System.out.println(result5);

        System.out.println("toUpperCase Проверяем преобразование в нижний регистр innopolis");
        String rrrrr = "innopolis";
        String result6 = rrrr.toUpperCase();
        System.out.println(result6);

        System.out.println("replace Проверяем преобразование замену строки innopolis на Denis");
        String ra = "Hello innopolis";
        String result7 = ra.replace("innopolis", "Denis");
        System.out.println(result7);

        System.out.println("startsWith Проверяем начало строки в скобках с указанного символа символов");
        String rb = "Будущий Автотестировщик";
        Boolean result8 = rb.startsWith("Б");
        System.out.println(result8);

        System.out.println("endsWith Проверяем конец строки в скобках с указанного символа символов");
        Boolean result9 = rb.endsWith("щик");
        System.out.println(result9);

        System.out.println("repeat Проверяем копирование строки Hello");
        String rc = "Hello";
        String result10 = rc.repeat(100);
        System.out.println(result10);

        System.out.println("contains Проверка содержания последовательность символов");
        String rak = "Я будущий Тестировщик";
        Boolean result11 = rak.contains("буду");
        System.out.println(result11);

        System.out.println("concat Проверка объединения двух строк");
        String akr = "Я будущий";
        String akf = " Тестировщик";
        String result12 = akr.concat(akf);
        System.out.println(result12);

        System.out.println("trim Проверка удаления начальных и конечных пробелов");
        String er = "    Я будущий Тестировщик     ";
        String result13 = er.trim();
        System.out.println(result13);

    }
}






