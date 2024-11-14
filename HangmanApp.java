public class HangmanApp {
      public static void main(String[] args) {
            String wordToGuess = "JAVA";
            int maxAttempts = 6;

            HangmanGame game = new HangmanGame(wordToGuess, maxAttempts);
            game.start();
      }
}
