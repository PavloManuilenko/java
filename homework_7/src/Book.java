public class Book {
    String name;
    String author;
    int year;
    bookType kind;

    public Book(String name, String author, int year, bookType kind){
        this.name = name;
        this.author = author;
        this.year = year;
        this.kind = kind;
    }
}

enum bookType {
    novel, fairyTale, comedy, drama, scienceFiction, detective;
}