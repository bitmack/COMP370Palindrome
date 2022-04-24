import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

public class PalindromeTest {
    private Palindrome palindrome = new Palindrome();
    private String str = null;
    @Test
    public void testPalindrome() throws Exception{
        str = "tacocat";
        assertTrue(palindrome.isPalindrome(str));
    }
}