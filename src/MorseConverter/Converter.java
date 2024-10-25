package MorseConverter;
import java.util.HashMap;


public class Converter {
    private final HashMap<String, String> engToMorse;
    private final HashMap<String, String> morseToEng;

    public Converter() {
        engToMorse = new HashMap<>();
        engToMorse.put("A", "*-");
        engToMorse.put("B", "-***");
        engToMorse.put("C", "-*-*");
        engToMorse.put("D", "-**");
        engToMorse.put("E", "*");
        engToMorse.put("F", "**-*");
        engToMorse.put("G", "--*");
        engToMorse.put("H", "****");
        engToMorse.put("I", "**");
        engToMorse.put("J", "*---");
        engToMorse.put("K", "-*-");
        engToMorse.put("L", "*-**");
        engToMorse.put("M", "--");
        engToMorse.put("N", "-*");
        engToMorse.put("O", "---");
        engToMorse.put("P", "*--*");
        engToMorse.put("Q", "--*-");
        engToMorse.put("R", "*-*");
        engToMorse.put("S", "***");
        engToMorse.put("T", "-");
        engToMorse.put("U", "**-");
        engToMorse.put("V", "***-");
        engToMorse.put("W", "*--");
        engToMorse.put("X", "-**-");
        engToMorse.put("Y", "-*--");
        engToMorse.put("Z", "--**");
        engToMorse.put("0", "-----");
        engToMorse.put("1", "*----");
        engToMorse.put("2", "**---");
        engToMorse.put("3", "***--");
        engToMorse.put("4", "****-");
        engToMorse.put("5", "*****");
        engToMorse.put("6", "-****");
        engToMorse.put("7", "--***");
        engToMorse.put("8", "---**");
        engToMorse.put("9", "----*");
        engToMorse.put(" ", " ");

        morseToEng = new HashMap<>();
        morseToEng.put("*-", "A");
        morseToEng.put("-***", "B");
        morseToEng.put("-*-*", "C");
        morseToEng.put("-**", "D");
        morseToEng.put("*", "E");
        morseToEng.put("**-*", "F");
        morseToEng.put("--*", "G");
        morseToEng.put("****", "H");
        morseToEng.put("**", "I");
        morseToEng.put("*---", "J");
        morseToEng.put("-*-", "K");
        morseToEng.put("*-**", "L");
        morseToEng.put("--", "M");
        morseToEng.put("-*", "N");
        morseToEng.put("---", "O");
        morseToEng.put("*--*", "P");
        morseToEng.put("--*-", "Q");
        morseToEng.put("*-*", "R");
        morseToEng.put("***", "S");
        morseToEng.put("-", "T");
        morseToEng.put("**-", "U");
        morseToEng.put("***-", "V");
        morseToEng.put("*--", "W");
        morseToEng.put("-**-", "X");
        morseToEng.put("-*--", "Y");
        morseToEng.put("--**", "Z");
        morseToEng.put("-----", "0");
        morseToEng.put("*----", "1");
        morseToEng.put("**---", "2");
        morseToEng.put("***--", "3");
        morseToEng.put("****-", "4");
        morseToEng.put("*****", "5");
        morseToEng.put("-****", "6");
        morseToEng.put("--***", "7");
        morseToEng.put("---**", "8");
        morseToEng.put("----*", "9");
        morseToEng.put(" ", " ");
    }

    public String getMorse(String eng) {
        return engToMorse.getOrDefault(eng, null);
    }

    public String getEng(String morse) {
        return morseToEng.getOrDefault(morse, null);
    }

    //  metod för att konvertera en morsekod till ett ord
    public String convertWordToMorse(String word) {
        StringBuilder morseResult = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            String morseChar = getMorse(String.valueOf(word.charAt(i)).toUpperCase());
            if (morseChar != null) {
                morseResult.append(morseChar);
                if (i < word.length() - 1) {
                    morseResult.append(" ");  // Lägg bara till mellanslag om det inte är sista bokstaven
                }
            } else {
                return null;  // Returnera null om ett tecken inte finns
            }
        }
        return morseResult.toString();
    }

    public String convertMorseToWord(String morse) {
        StringBuilder textResult = new StringBuilder();
        String[] morseLetters = morse.split(" ");  // Dela upp morsekoden med mellanslag
        for (int i = 0; i < morseLetters.length; i++) {
            String letter = getEng(morseLetters[i]);  // Hämta bokstaven
            if (letter != null) {
                textResult.append(letter);  // Lägg till bokstaven i resultatet
            } else {
                return null;  // Returnera null om morsekoden inte har en motsvarande bokstav
            }
        }
        return textResult.toString();
    }
}
