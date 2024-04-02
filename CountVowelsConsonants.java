import java.util.Scanner;

public class CountVowelsConsonants {
    public static void main(String[] args) {
        // Input from user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        scanner.close();

        // Convert the input string to lowercase for case-insensitive counting
        inputString = inputString.toLowerCase();

        // Initialize counters
        int vowelCount = 0;
        int consonantCount = 0;

        // Iterate through each character in the string
        for (int i = 0; i < inputString.length(); i++) {
            char currentChar = inputString.charAt(i);

            // Check if the character is a vowel
            if (currentChar == 'a' || currentChar == 'e' || currentChar == 'i' ||
                currentChar == 'o' || currentChar == 'u') {
                vowelCount++;
            } else if (Character.isLetter(currentChar)) {
                // Check if the character is a consonant
                consonantCount++;
            }
        }

        // Display the results
        System.out.println("Number of vowels: " + vowelCount);
        System.out.println("Number of consonants: " + consonantCount);
    }
}

