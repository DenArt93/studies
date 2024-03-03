package ru.inno.course.oop;

public class Item {
    String name;
    int vendorCode;
    float price;
    int amount;
    String color;
    String size;
    public Item(String name,int vendorCode,int amount) {
        this.name = name;
        this.vendorCode = vendorCode;
        this.amount = amount;
        System.out.println("Мы создали класс товара"+name);

    }





}
