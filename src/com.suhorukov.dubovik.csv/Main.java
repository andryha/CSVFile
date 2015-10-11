package com.suhorukov.dubovik.csv;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        if (args.length == 0) {
            System.out.println("\n\tНе указан аргумент!");
        }
        if (args.length == 1) {
            new CSVFile(args[0], null);
        }
        if (args.length == 2) {
            new CSVFile(args[0], args[1]);
        }
        if (args.length > 2) {
            System.out.println("\n\tУказан неверный аргумент!");
        }

//        csv.txt new.csv     (Можно скопировать и добавить в аргумент, результат запишит в файл.)
//        csv_rus_utf8.txt        (Можно скопировать и добавить в аргумент, результат выведет в консоль.)

//        Или всё закомментировать и вызвать на прямую через конструктор
//        new CSVFile("csv.txt", "new.csv");
//        new CSVFile("csv_rus_utf8.txt", null); Результат выведет в консоль

    }
}
