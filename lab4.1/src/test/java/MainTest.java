import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void main() {
        assertEquals("Alexander Sergeevich Pushkin,300,Captain daughter,Classic,10.05.1890",Book.ReturnValues("Alexander Sergeevich Pushkin",300,"Captain daughter","Classic","10.05.1890"));
    }


}