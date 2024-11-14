import java.util.HashSet;

public class GameWorld {
      private String word;
      private HashSet<Character> guessedLetters;
      
      public GameWorld(String word) {
            this.word = word.toLowerCase();
            this.guessedLetters = new HashSet<>();
      }

      public boolean guessLetter(char letter) {
            letter = Character.toLowerCase(letter);
            if(guessedLetters.contains(letter)) {
                  guessedLetters.add(letter);
                  return word.contains(String.valueOf(letter));
            }

            return false;
      }

      public boolean isFullyGuessed(){

                        for(char letter : word.toCharArray()) {
                              if(!guessedLetters.contains(letter)) {
                                    return false; 
                              }
                        }
            return true;
      }

      public String getMaskedWord() {
            StringBuilder maskedWord = new StringBuilder();
            for(char letter : word.toCharArray()) {
                        if(guessedLetters.contains(letter)) {
                              maskedWord.append(letter);
                        } else {
                              maskedWord.append('_');
                        }

                        maskedWord.append(' ');
            }

            return maskedWord.toString();


            
      }

      public String getWord() {
            return word;
      }
}
