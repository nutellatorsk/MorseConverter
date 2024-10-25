package MorseConverter;
import java.util.Scanner;

public class MorseToTextConverter {
    public static void main(String[] args) {
        Converter converter = new Converter();
        Scanner scan = new Scanner(System.in);

        // Input for converting a word to Morse code
        System.out.println("Enter a word to convert to Morse code (A-Z, 0-9):");
        String text = scan.nextLine();
        String morseCode = converter.convertWordToMorse(text);  // Convert word to Morse code

        // Error handling: If the input is invalid
        if (morseCode == null || morseCode.isEmpty()) {
            System.out.println("Error: Invalid input. Please enter a valid word or number.");
        } else {
            System.out.println("The Morse code for " + text + " is: " + morseCode);
        }

        // Input for converting Morse code to a word
        System.out.println("Enter Morse code to convert to text (use * for dots and - for dashes, and space between letters):");
        String morseInput = scan.nextLine();
        String textResult = converter.convertMorseToWord(morseInput);  // Convert Morse code to text

        // Error handling: If the Morse code is invalid
        if (textResult == null || textResult.isEmpty()) {
            System.out.println("Error: Invalid Morse code. Please enter valid Morse code.");
        } else {
            System.out.println("The text for " + morseInput + " is: " + textResult);
        }

        scan.close();
    }
}