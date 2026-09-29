
public class Player {
    ///// Declare field variables here

    public String playerName;
    public int numOfGuesses = 0;

    ///// Write method(s) here

    /// this increments the numOfGuesses variable
    public void addToNumGuesses() {
        numOfGuesses++;
    }

    /***
     * Start of guessing logic for the computer player, do not change any code below
     ***/
    private class Inner {
        static int lastGuess;
        static int high = 100;
        static int low = 1;
    }

    // Calculate and return the computer player's next guess
    public int computerGuess() {
        int guess = (Inner.high + Inner.low) / 2;
        Inner.lastGuess = guess;
        return guess;
    }

    // Method to tell the computer player about wrong guesses.
    // Parameter value 'true' means the guess was too high,
    // 'false' means the guess was too low.
    public void computerGuessWasWrong(boolean highLow) {
        if (highLow) {
            // The guess was too high
            Inner.high = Inner.lastGuess - 1;
        } else {
            // The guess was too low
            Inner.low = Inner.lastGuess + 1;
        }
    }
} // End of Player class
