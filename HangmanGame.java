import java.util.Scanner;

public class HangmanGame {
      private GameWorld gameWorld;
      private Player player;
      private Scanner scanner;

      public HangmanGame(String wordToGuess, int maxAttempts) {
            this.gameWorld = new GameWorld(wordToGuess);
            this.player = new Player(maxAttempts);
            this.scanner = new Scanner(System.in);
      }

      public void start() {
            System.out.println("Welcome to Hangman!");

            while(player.hasAttemptsLeft() && !gameWorld.isFullyGuessed()) {
                  System.out.println("\nWord to guess: " + gameWorld.getMaskedWord());
                  System.out.println("Attempts Left: " + player.getAttemptsLeft());
                  System.out.println("Enter a letter to guess: ");
                  char guess = scanner.nextLine().toLowerCase().charAt(0);

                  if(player.hasGuessedLetter(guess)) {
                        System.out.println("You already guessed that letter!");

                  } else {
                        player.addGuessedLetter(guess);

                        if(gameWorld.guessLetter(guess)) {
                              System.out.println("Good guess!");
                        } else {
                              System.out.println("Wrong guess.");
                              player.loseAttempt();
                        }
                  }
            }
            this.endGame();
      }


      private void endGame() {
            if(gameWorld.isFullyGuessed()) {
                  System.out.println("\nCongratulations! You guessed the word: " + gameWorld.getWord());
            } else {
                  System.out.println("\nGame over! The word was: " + gameWorld.getWord());
            }

            scanner.close();
      }
}