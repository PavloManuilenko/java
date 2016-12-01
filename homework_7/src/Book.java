/*9. Создать класс Book с полями: name (строка), bookType (перечисление), author (строка), year (целое число).
Написать конструктор со всеми параметрами. Опишите с помощью enum тип данных для хранения литературных жанров (роман, сказка, комедия, драма, научная фантастика, детектив).
Создать объекты класса книга (число объектов соответствует числу жанров).*/
public class Book {
    String name;
    String author;
    int year;
    BookType kind;

    public Book(String name, String author, int year, BookType kind){
        this.name = name;
        this.author = author;
        this.year = year;
        this.kind = kind;
    }
}

enum BookType {
    novel, fairyTale, comedy, drama, scienceFiction, detective;
}