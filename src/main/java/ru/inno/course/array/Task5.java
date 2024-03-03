package ru.inno.course.array;

public class Task5 {


    public static void main(String[] args) {
        String[] name = {"Аркадиий","Веня","Артем","Рак1","Рак2","Рак3","Рак4","Рак5","Рак6","Рак7"};
        for (int rak = 0; rak < name.length && rak < 3; rak++){
            System.out.println(name[rak]);
        }

    }
}
