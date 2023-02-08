public class Main {
    public static void main(String[] args){
        User Nikita = new User("Bugakov Nikita",17,"RU");
        User Kirill = new User("Kirill Spirin", 18, "RU");
        User Fouchi = new User("Sergey Nemtsov", 18, "RU");
        System.out.println("Пользователей онлайн "+User.totalOnline);
    }
}
