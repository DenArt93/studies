package ru.inno.course.basics;

public class Test {

    public static void main(String[] args) {
        //.toLowerCase(), .toUpperCase() Возвращает в верхнем и нижнем регистре
        String name = "home work";
        String result = name;
        System.out.println(result.toUpperCase());
        System.out.println(result.toLowerCase());

        //.trim() Убираем пробелы до и после
        String text = "    Привет Инополис!     ";
        String result2 = text;
        System.out.println(result2.trim());

        //.isEmpty() Проверяем строку на пустоту и возвращаем true или false
        String str = "  ";
        String result3 = str;
        System.out.println(result3.isEmpty());

        //.isBlank() проверяем если строка пуста или содержит только кодовые точки пробелов.
        System.out.println(result3.isBlank());

        //.substring() возвращает строку с задоного индекса или до endIndex-1
        System.out.println(result.substring(1, 3));

        //.indexOf() найти первый индекс буквы "o" начиная с индекса 7
        String myStr = "Hello Innopolis, I am taking your course.";
        String result4 = myStr;
        System.out.println(myStr.indexOf("o",7));

        //.lastIndexOf() найти последний индекс буквы "o" начиная с индекса 7
        System.out.println(myStr.lastIndexOf("o",7));

        //.replace() заменяем имя на свое
        String value = "Hello innopolis";
        String result5 = value;
        System.out.println(result5.replaceAll("innopolis", "Denis"));

        //.startsWith() узнать начинается ли строка с указанных символов
        System.out.println(result5.startsWith("Hel"));

        //.endWith() проверить, заканчивается ли строка указанными символами.
        System.out.println(result5.endsWith("is"));

        //.repeat() повторить строку n раз
        int a = 5;
        String result6 = Integer.toString(a);
        System.out.println(result6.repeat(5));

        //.contains() проверяем, содержит ли строка последовательность символов.
        System.out.println(result5.contains("inn"));

        //.concat() объединить две строки
        String d = "innopolis ";
        String f = "The best";
        String result7 = d.concat(f);
        System.out.println(result7);

    }
}
