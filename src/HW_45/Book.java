package HW_45;

//Создайте класс Book (книга), в конструктор которого передавайте
// автора, название книги и количество страниц.
//
//Реализуйте интерфейс для сравнения книг:
// они должны сортироваться по авторам,
// а если авторы совпадают - по названиям
// (и там, и там - по алфавиту, "в словарном порядке").

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Book {
    private String author;

    private String title;

    private int numberPages;

    public Book(String author, String title, int numberPages) {
        this.author = author;
        this.title = title;
        this.numberPages = numberPages;
    }

    public static Book readBook() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter book`s author: ");
        String author = br.readLine();
        System.out.print("Enter book`s title: ");
        String title = br.readLine();
        System.out.print("Enter number of pages: ");
        int numberPages = Integer.parseInt(br.readLine());

        return new Book(author, title, numberPages);
    }


}
