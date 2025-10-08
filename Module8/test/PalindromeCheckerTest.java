import module_8_2.PalindromeChecker;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class PalindromeCheckerTest {
    // happy path tests
    @Test
    void testIsPalindromeHP() {
        System.out.println("Test isPalindrome() - happy path cases");

        assertTrue(PalindromeChecker.isPalindrome("radar"));
        assertTrue(PalindromeChecker.isPalindrome("A man, a plan, a canal, Panama"));
        assertFalse(PalindromeChecker.isPalindrome("hello"));
        assertFalse(PalindromeChecker.isPalindrome("openai"));
        assertFalse(PalindromeChecker.isPalindrome("string with nördics"));
    }

    // edge case tests
    @Test
    void testIsPalindromeEC() {
        System.out.println("Test isPalindrome() - edge cases");

        assertTrue(PalindromeChecker.isPalindrome("")); // empty string
        assertTrue(PalindromeChecker.isPalindrome("a")); // single character
        assertTrue(PalindromeChecker.isPalindrome(" ")); // single space
        assertTrue(PalindromeChecker.isPalindrome("!!")); // special characters only
        assertFalse(PalindromeChecker.isPalindrome(null)); // null input
    }
}
