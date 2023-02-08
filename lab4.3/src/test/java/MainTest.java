import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void main() {
        User Nikita = new User("Bugakov Nikita",17,"RU");
        User Kirill = new User("Kirill Spirin", 18, "RU");
        User Fouchi = new User("Sergey Nemtsov", 18, "RU");
        assertEquals(3,User.totalOnline);
    }
}