package MorseConverter;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestMorse {
    @Test
    public void testLetterToMorse() {
        Converter converter = new Converter();
        String testData = "E";  // Test converting a letter to Morse
        String expected = "*";  // Expected Morse code for "E"
        String actual = converter.getMorse(testData);  // Actual result
        assertEquals(expected, actual);
    }

    @Test
    public void testMorseToLetter() {
        Converter converter = new Converter();
        String testData = "*";  // Test converting Morse to letter
        String expected = "E";  // Expected letter for Morse "*"
        String actual = converter.getEng(testData);  // Actual result
        assertEquals(expected, actual);
    }

    @Test
    public void testWordToMorse() {
        Converter converter = new Converter();
        String testData = "HELLO";  // Test converting a word to Morse
        String expected = "**** * *-** *-** ---";  // Expected Morse code for "HELLO"
        String actual = converter.convertWordToMorse(testData);  // Actual result
        assertEquals(expected, actual);
    }

    @Test
    public void testMorseToWord() {
        Converter converter = new Converter();
        String testData = "**** * *-** *-** ---";  // Test converting Morse to a word
        String expected = "HELLO";  // Expected word
        String actual = converter.convertMorseToWord(testData);  // Actual result
        assertEquals(expected, actual);
    }

    @Test
    public void testNumberToMorse() {
        Converter converter = new Converter();
        String testData = "5";  // Test converting a number to Morse
        String expected = "*****";  // Expected Morse code for "5"
        String actual = converter.getMorse(testData);  // Actual result
        assertEquals(expected, actual);
    }

    @Test
    public void testMorseToNumber() {
        Converter converter = new Converter();
        String testData = "*****";  // Test converting Morse to a number
        String expected = "5";  // Expected number
        String actual = converter.getEng(testData);  // Actual result
        assertEquals(expected, actual);
    }

    @Test
    public void testInvalidLetter() {
        Converter converter = new Converter();
        String testData = "#";  // Test an invalid character
        String result = converter.getMorse(testData);  // Get the Morse code for invalid input
        assertNull(result);  // Expect null as invalid input is handled
    }

    @Test
    public void testInvalidMorseCode() {
        Converter converter = new Converter();
        String testData = "---***";  // Test an invalid Morse code
        String result = converter.getEng(testData);  // Get the letter for invalid Morse code
        assertNull(result);  // Expect null as invalid input is handled
    }
}
