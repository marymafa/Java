
import static org.junit.Assert.assertEquals;


public class KataTest {

    public void BasicTests() {
        assertEquals(true, Kata.compare("AD", "BC"));
        assertEquals(false, Kata.compare("AD", "DD"));
    }

}