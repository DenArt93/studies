package ru.inno.course.Certification1.Task2;

import java.time.LocalDate;

public interface PlantsIndicators {
    LocalDate getLastWateringTime();
    void setLastWateringTime(LocalDate lastWateringTime);
}
