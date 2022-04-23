import org.junit.*;
import static org.junit.Assert.*;
public class PalindromeTest {
    private Palindrome palindrome = new Palindrome();
    private String str = null;
    @Test
    public void testPalindrome() throws Exception{
        str = "tacocat";
        assertTrue(palindrome.isPalindrome(str));
    }
}