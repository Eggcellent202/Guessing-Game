
///// Add any necessary imports here
import java.util.Random;
import java.util.Scanner;

public class GuessingGame {

    public static void main(String[] args) {
        System.out.println("** GUESSING GAME **");

        ///// Write code to generate the random number to guess here
        Random rand = new Random();

        // 101 because ranges in java removes one
        int numToGuess = rand.nextInt(1, 101);

        ///// Write code to create two Player objects here
        Player Lucas = new Player();
        Player Computer = new Player();

        Scanner scan = new Scanner(System.in);
        while (true) { // Loop until 'break'
            ///// Start of code for human
            System.out.print("Input Your Guess From 1 To 100: ");
            int currentGuess = scan.nextInt();
            Lucas.addToNumGuesses();

            if (currentGuess > numToGuess) {
                System.out.println("Too High!\n");
            }

            else if (currentGuess < numToGuess) {
                System.out.println("Too Low!\n");
            }

            // checks to see if the currentguess variable is a int and not a string or a
            // float
            // else if (currentGuess != ) {
            // System.out.println("Invalid Input, Please Try Again\n");
            // }

            else {
                System.out.println("Congratulation, You Got The Right Number!!!\n");
                System.out.println("The Number Was " + numToGuess + ".");
                System.out.println("It Took " + Lucas.numOfGuesses + " Guesses To Get The Right Answer!\n");
                break;
            }

            ///// Start of code for computer
            System.out.println("The Computer Guessed: " + Computer.computerGuess());
            Computer.addToNumGuesses();

            if (Computer.computerGuess() > numToGuess) {
                System.out.println("The Computer Was Incorrect\n");
                Computer.computerGuessWasWrong(true);
            }

            else if (Computer.computerGuess() < numToGuess) {
                System.out.println("The Computer Was Incorrect\n");
                Computer.computerGuessWasWrong(false);
            }

            else {
                System.out.println("The Computer Got The Right Number!!!\n");
                System.out.println("The Number Was " + numToGuess + ".\n");
                System.out.println("It Took The Computer " + Computer.numOfGuesses + " Guesses To Win!");
                System.out.println("It Took You " + Lucas.numOfGuesses + " Guesses Just For You To Lose!\n");
                break;
            }

        } // End of 'while' loop

        scan.close();
    } // End of main method
} // End of GuessingGame class