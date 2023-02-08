public class Book {
    int amountPages;
    String name;
    String genre;
    String publicDate;
    Author author;

    public Book(int amountPages, String name, String genre, String publicDate, Author author) {
        this.amountPages = amountPages;
        this.name = name;
        this.genre = genre;
        this.publicDate = publicDate;
        this.author = author;
    }
    public String toString(){
        return " Количество страниц "+amountPages+"\n *******\n Название книги "+name+"\n *******\n Жанр "+genre+"\n *******\n Дата публикации "+publicDate+"\n *******\n Автор "+author;
    }

}
