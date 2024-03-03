package ru.inno.course.Certification1.Task2;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class Plants implements PlantsIndicators{
    private String name;
    private int age;
    private LocalDate lastWateringTime;

    public Plants(String name, int age, LocalDate lastWateringTime) {
        this.name = name;
        this.age = age;
        this.lastWateringTime = lastWateringTime;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    @Override
    public LocalDate getLastWateringTime() {
        return lastWateringTime;
    }

    @Override
    public void setLastWateringTime(LocalDate lastWateringTime) {
        this.lastWateringTime = lastWateringTime;
    }

    public void waterCactus() {
        LocalDate currentDate = LocalDate.now();
        Season currentSeason = getSeason(currentDate);

        if (currentSeason == Season.WINTER || currentSeason == Season.SPRING) {
            lastWateringTime = lastWateringTime.plusMonths(1);
        } else if (currentSeason == Season.SUMMER && ChronoUnit.DAYS.between(lastWateringTime, currentDate) >= 2) {
            int humidity = Sensor.getHumidity();
            if (humidity < 30) {
                lastWateringTime = currentDate;
            }
        } else if (currentSeason == Season.AUTUMN) {
            lastWateringTime = lastWateringTime.plusWeeks(1);
        }
    }

    private Season getSeason(LocalDate date) {
        Month month = date.getMonth();
        if (month == Month.DECEMBER || month == Month.JANUARY || month == Month.FEBRUARY) {
            return Season.WINTER;
        } else if (month == Month.MARCH || month == Month.APRIL || month == Month.MAY) {
            return Season.SPRING;
        } else if (month == Month.JUNE || month == Month.JULY || month == Month.AUGUST) {
            return Season.SUMMER;
        } else {
            return Season.AUTUMN;
        }
    }

}
