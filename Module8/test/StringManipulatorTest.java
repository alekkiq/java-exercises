import module_8_1.StringManipulator;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class StringManipulatorTest {
    @Test
    void testConcatenate() {
        System.out.println("Testing concatenate method");

        assertEquals("HelloWorld", StringManipulator.concatenate("Hello", "World"));
        assertEquals("JavaJUnit", StringManipulator.concatenate("Java", "JUnit"));
        assertEquals("", StringManipulator.concatenate("", ""));

        assertEquals("Test", StringManipulator.concatenate("", "Test"));
        assertEquals("Test", StringManipulator.concatenate("Test", ""));
    }

    @Test
    void testFindLength() {
        System.out.println("Testing findLength method");

        assertEquals(5, StringManipulator.findLength("Hello"));
        assertEquals(0, StringManipulator.findLength(""));
        assertEquals(12, StringManipulator.findLength("JavaJUnit123"));
        assertEquals(0, StringManipulator.findLength(null)); // Intentional error for demonstration
    }

    @Test
    void testConvertToUpperCase() {
        System.out.println("Testing convertToUpperCase method");

        assertEquals("HELLO", StringManipulator.convertToUpperCase("hello"));
        assertEquals("JAVA", StringManipulator.convertToUpperCase("Java"));
        assertEquals("", StringManipulator.convertToUpperCase(""));
    }

    @Test
    void testConvertToLowerCase() {
        System.out.println("Testing convertToLowerCase method");

        assertEquals("hello", StringManipulator.convertToLowerCase("HELLO"));
        assertEquals("java", StringManipulator.convertToLowerCase("Java"));
        assertEquals("", StringManipulator.convertToLowerCase(""));
    }

    @Test
    void testContainsSubstring() {
        System.out.println("Testing containsSubstring method");

        assertTrue(StringManipulator.containsSubstring("HelloWorld", "World"));
        assertFalse(StringManipulator.containsSubstring("JavaJUnit", "Python"));
        assertTrue(StringManipulator.containsSubstring("OpenAI", "AI"));
        assertFalse(StringManipulator.containsSubstring("Test", "test")); // case-sensitive
    }
}
