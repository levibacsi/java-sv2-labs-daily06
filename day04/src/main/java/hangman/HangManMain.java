package hangman;

import java.util.Scanner;

public class HangManMain {

    public static void main(String[] args) {
        new HangManMain().run();
    }

    private void run() {
        int chances = 8;
        String wordToFind = "hippopotamus";
        String status = "_".repeat(wordToFind.length());

        while (chances > 0) {
            System.out.println("Remaining number of guesses: " + chances);
            System.out.println("Known letters of the word: " + status);
            System.out.println("Enter a letter");

            Scanner scanner = new Scanner(System.in);
            String guess = scanner.nextLine();

            String wordFound = updateWordFound(wordToFind, status, guess);
            if (wordFound.equals(wordToFind)){
                chances = 0;
            }
            if (wordFound.equals(status)) {
                chances--;
            }
            status = wordFound;

        }
        if (status.equals(wordToFind)){
            System.out.println("Well done! You found out the word " + wordToFind);
        } else {
            System.out.println("You lose");
        }
    }

    private String updateWordFound(String wordToFind, String status, String guess) {
        char[] chars = status.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (wordToFind.charAt(i) == guess.charAt(0)) {
                chars[i] = guess.charAt(0);
            }
        }
        return new String(chars);
    }

}
