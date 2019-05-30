import static org.junit.Assert.*;

public class ReverseNumberTest {


    public void reverse() throws Exception {
        assertEquals( 321, ReverseNumber.reverse( String.valueOf( 123 ) ) );
        assertEquals( -321, ReverseNumber.reverse( String.valueOf( -123 ) ) );
        assertEquals( 1, ReverseNumber.reverse( String.valueOf( 1000 ) ) );
        assertEquals( 4321234, ReverseNumber.reverse( String.valueOf( 4321234 ) ) );
        assertEquals( 5, ReverseNumber.reverse( String.valueOf( 5 ) ) );
        assertEquals( 89898989, ReverseNumber.reverse( String.valueOf( 98989898 ) ) );
    }


}