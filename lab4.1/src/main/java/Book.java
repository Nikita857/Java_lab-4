public class Book {

    String author;
    int amountPages;
    String name;
    String genre;
    String publicDate;

    public Book(String author, int amountPages, String name, String genre, String publicDate) {
        this.author = author;
        this.amountPages = amountPages;
        this.name = name;
        this.genre = genre;
        this.publicDate = publicDate;
        ReturnObjectData();
    }

    void ReturnObjectData(){
        System.out.println(author + "," + amountPages + "," + name + "," + genre + "," + publicDate);
    }

    public static String ReturnValues (String author,
            int amountPages,
            String name,
            String genre,
            String publicDate) {
        System.out.println(author + "," + amountPages + "," + name + "," + genre + "," + publicDate);
        String res = author + "," + amountPages + "," + name + "," + genre + "," + publicDate;
        return res;
    }
}
