import org.junit.Test;
import static org.junit.Assert.*;

public class GFGTest {
    @Test
    public void testBiggestOfThree() {
        assertEquals(10, GFG.biggestOfThree(5, 10, 3));
        assertEquals(20, GFG.biggestOfThree(20, 10, 3));
        assertEquals(30, GFG.biggestOfThree(20, 10, 30));
    }
}
