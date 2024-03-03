package ru.inno.course.oop;

public class Task2 {
    public static void main(String[] args) {
        Room room0 = new Room();
        Flat flat0 = new Flat("Игровая", "Гостинная", "Ванная комната", "Кухня");
        room0.playStation = "приставка";
        room0.tv = "телевизор";
        room0.kettle = "чайник";
        room0.fridge = "холодильник";
        room0.doubleBed = "диван";
        room0.bidet = "биде";
        System.out.println(flat0.gaming + " комната содержит, следующие предметы: " + room0.playStation + ", " + room0.tv);
        System.out.println(flat0.kitchen + " содержит, следующие предметы: " + room0.fridge + ", " + room0.kettle );
        System.out.println(flat0.livingRoom + " содержит, следующие предметы: " + room0.doubleBed);
        System.out.println(flat0.bathroom + " содержит, следующие предметы: " + room0.bidet );
    }
}
