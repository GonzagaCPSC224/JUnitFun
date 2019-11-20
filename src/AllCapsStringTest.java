import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AllCapsStringTest {

    @Test
    public void testConstructor() {
        AllCapsString allCapsString = new AllCapsString("hello");
        assertEquals(allCapsString.getCapsStr(), "HELLO");
        // actual value, expected value
    }
}
