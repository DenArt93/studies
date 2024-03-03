package ru.inno.course.array;

public class Task3 {
    public static void main(String[] args) {
        Movie[] films = {
                new Movie("Отступники",8.5,"криминал","Гонконг",true),
                new Movie("Гарри_Поттер",9.9,"криминал","Великобритания",true),
                new Movie("Американский пирог", 8.1, "комедия","USA",false)
        };
        for (Movie myFilms:films)
        System.out.println(myFilms.oscar + ", " + myFilms.name + ", " + myFilms.genre + ", " + myFilms.rating);
    }
}
