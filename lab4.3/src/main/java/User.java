

public class User {
    String FIO;
    int age;
    String country;
    String email;
    static int totalOnline = 0;

    public User(String FIO, int age, String country){
        this.FIO = FIO;
        this.age = age;
        this.email = email;
        this.country = country;
        totalOnline+=1;
    }

}
