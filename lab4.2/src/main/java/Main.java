
public class Main {
    public static void main(String[] args){

        Author BradPitt = new Author("BradPitt",23,"15.12.1797");
        Book How = new Book(1000,"How to","Fantasy","давно",BradPitt);

        System.out.println(How.toString());


    }
}
