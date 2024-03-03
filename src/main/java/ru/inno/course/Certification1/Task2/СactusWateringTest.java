package ru.inno.course.Certification1.Task2;

import java.time.LocalDate;
import java.time.Month;

public class СactusWateringTest {
    public static void main(String[] args) {
        LocalDate lastWateringDate = LocalDate.of(2024, Month.JULY,1);
        Plants cactus = new Plants("Cactus",3,lastWateringDate);
        System.out.println("дата последнего полива: "+ cactus.getLastWateringTime());
        cactus.waterCactus();
        System.out.println("дата следующего полива: "+ cactus.getLastWateringTime());
    }
}
