import java.util.HashSet;

public class Player {
private int attemptsLeft;
private HashSet <Character> guessedLetters;

public Player (int maxAttempts) {
      this.attemptsLeft = maxAttempts;
      this.guessedLetters = new HashSet<>();
}

public boolean hasAttemptsLeft() {
      return attemptsLeft > 0;
}

public void loseAttempt() {
      attemptsLeft--;
}

public int getAttemptsLeft() {
      return attemptsLeft;    
} 

public boolean hasGuessedLetter(char letter) {
      return guessedLetters.contains(letter);
}

public void addGuessedLetter(char letter) {
      guessedLetters.add(letter);
} 

}
