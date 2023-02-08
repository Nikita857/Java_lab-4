public class Author {
    String FIO;
    int age;
    String dateBorn;
    Book book;

    public Author(String FIO, int age, String dateBorn) {
        this.FIO = FIO;
        this.age = age;
        this.dateBorn = dateBorn;


    }

    public String toString() {
        return "FIO: " + FIO + " Age: " + age + " Date born: " + dateBorn;
    }
}
