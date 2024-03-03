package ru.inno.course.Certification1.Task2;

import java.util.Random;

public class Sensor {
    public static int getHumidity(){

        Random random = new Random();
        return random.nextInt(101);
    }
}
