import java.util.Scanner;
import java.util.Arrays;
import java.util.List;

public class VowelAndConsonantCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Boolean continueProg = true;
        System.out.println("--- VOWELS AND CONSONANTS COUNTER PROGRAM ---\n");
        mainLoop:
        while(continueProg) {
            // Asks the user to enter a string
            System.out.println("Please, enter the string you want to count vowels and consonants:");
            String userText = scanner.nextLine();
            int txtLen = userText.length();
            List<Character> vowels = Arrays.asList('a', 'e', 'i', 'o', 'u');
            int vowelCount = 0;
            int consonantCount = 0;

            // Iterates through each character
            Boolean isVowel = false;
            for (int i = 0; i < txtLen; i++) {
                char c = userText.charAt(i);
                if (Character.isAlphabetic(c)) {
                    if (vowels.contains(Character.toLowerCase(c))) {
                        isVowel = true;
                        vowelCount += 1;
                    } else {
                        isVowel = false;
                        consonantCount += 1;
                    }
                } else {
                    // Uses the 'continue' statement to ignore non-alphabet characters
                    continue;
                }
                // Prompts the user after every character to continue or exit early
                if (isVowel) {
                    System.out.println("The character #" + (i + 1) + " is the vowel...........'" + c + "'.");    
                } else {
                    System.out.println("The character #" + (i + 1) + " is the consonant.......'" + c + "'.");
                }
                
            }
            
            // Displays the final count of vowels and consonants
            System.out.println("Analisis result:");
            System.out.println(vowelCount + " vowels and " + consonantCount + " consonants were found.");
            
            // Uses the break statement to allow the user to exit early
            Boolean validAnswer = false;
            while (!validAnswer) {
                System.out.println("Whould you like to analise another string? Y (yes) or N (no):");
                String answer = scanner.nextLine();
                if (answer.equalsIgnoreCase("y")) {
                    validAnswer = true;
                } else if (answer.equalsIgnoreCase("n")) {
                    continueProg = false;
                    break mainLoop;
                } else {
                    System.out.println("Invalid option");
                }
            }            
        }
        
        
        scanner.close();
    }
}
