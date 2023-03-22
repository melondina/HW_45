package HW_45;

//Создайте класс Book (книга), в конструктор которого передавайте
// автора, название книги и количество страниц.
//
//Реализуйте интерфейс для сравнения книг:
// они должны сортироваться по авторам,
// а если авторы совпадают - по названиям
// (и там, и там - по алфавиту, "в словарном порядке").

public class Book {
    private String author;

    private String title;

    private int numberPages;

    public Book(String author, String title, int numberPages) {
        this.author = author;
        this.title = title;
        this.numberPages = numberPages;
    }


}
