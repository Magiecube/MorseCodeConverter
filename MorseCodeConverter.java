/**
 * Morse Code Converter
 * Description: Converts English text into Morse code.
 * 
 * How to Run:
 * 1. Open a terminal or command prompt.
 * 2. Navigate to the directory containing MorseCodeConverter.java.
 * 3. Compile the program: javac MorseCodeConverter.java
 * 4. Run the program: java MorseCodeConverter
 * 5. Enter text to convert to Morse code or type 'quit' to exit.
 * 
 * Author: Olayemi Jean Clausius Odjetunde
 * Date: 04/15/2024
 * Version: 1.0
 */

import java.util.Scanner;

public class MorseCodeConverter {
    // Arrays to store characters and their corresponding Morse code
    private static final char[] asciiChars = {
        ' ', ',', '.', '?', '0', '1', '2', '3', '4', '5',
        '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F',
        'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P',
        'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'
    };
    private static final String[] morseCodes = {
        " ", "--..--", ".-.-.-", "..--..", "-----", ".----",
        "..---", "...--", "....-", ".....", "-....", "--...",
        "---..", "----.", ".-", "-...", "-.-.", "-..", ".",
        "..-.", "--.", "....", "..", ".---", "-.-", ".-..",
        "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-",
        "..-", "...-", ".--", "-..-", "-.--", "--.."
    };

    // Method to convert a string to Morse code
    public static String convertToMorseCode(String input) {
        StringBuilder morseCode = new StringBuilder();
        for (char c : input.toUpperCase().toCharArray()) {
            for (int i = 0; i < asciiChars.length; i++) {
                if (c == asciiChars[i]) {
                    morseCode.append(morseCodes[i]).append(" ");
                    break;
                }
            }
        }
        return morseCode.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userInput;

        // Loop to allow multiple conversions
        while (true) {
            System.out.print("Enter a string (or 'quit' to exit): ");
            userInput = scanner.nextLine();
            
            // Check if the user wants to quit
            if (userInput.equalsIgnoreCase("quit")) {
                break;
            }

            // Convert the user input to Morse code
            String morseCode = convertToMorseCode(userInput);

            // Print the result
            System.out.println("Original string: " + userInput);
            System.out.println("Morse Code: " + morseCode);
        }

        scanner.close();
    }
}
