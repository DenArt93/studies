package ru.inno.course.oop;

public class Task3 {
    public static void main(String[] args) {
        Item abidas = new Item("Кроссовки", 123456, 5);
        abidas.price = 4999.99f;
        System.out.println("Артикул:"+abidas.vendorCode+" "+"Наименование товара:"+abidas.name+" "+"Цена:"+abidas.price+" "+"Колличество:"+abidas.amount);

        Item belarusianKnitwear = new Item("Трусы", 129999,200);
        belarusianKnitwear.color = "red";
        belarusianKnitwear.price = 99.99f;
        System.out.println("Артикул:"+belarusianKnitwear.vendorCode+" "+"Наименование товара:"+belarusianKnitwear.name+" "+"Цена:"+belarusianKnitwear.price+" "+"Колличество:"+belarusianKnitwear.amount+" "+"Цвет:"+belarusianKnitwear.color);

        Item ccm = new Item("Клюшка", 778899,10);
        ccm.color = "green";
        ccm.price = 1499999.99f;
        System.out.println("Артикул:"+ccm.vendorCode+" "+"Наименование товара:"+ccm.name+" "+"Цена:"+ccm.price+" "+"Колличество:"+ccm.amount+" "+"Цвет:"+ccm.color);

        Item bmw = new Item("Машина", 998877, 1);
        bmw.color = "black";
        bmw.price = 2000000.99f;
        System.out.println("Артикул:"+bmw.vendorCode+" "+"Наименование товара:"+bmw.name+" "+"Цена:"+bmw.price+" "+"Колличество:"+bmw.amount+" "+"Цвет:"+bmw.color);

        Item lg = new Item("стиральная машина", 332244, 300);
        lg.color = "white";
        lg.price = 299.99f;
        System.out.println("Артикул:"+lg.vendorCode+" "+"Наименование товара:"+lg.name+" "+"Цена:"+lg.price+" "+"Колличество:"+lg.amount+" "+"Цвет:"+lg.color);


    }



}
