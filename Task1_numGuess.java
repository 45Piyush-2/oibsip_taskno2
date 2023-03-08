import javax.swing.JOptionPane;
import java.util.Random;

class NumberGuess{
    public int randomNumber;
    public int inputNumber;
    public int noOfGuesses = 0;

    NumberGuess(){
        Random rn = new Random();
        this.randomNumber = rn.nextInt(100);
    }

    void takeUserInput(){
        String s = JOptionPane.showInputDialog(null, "Guess The Number Between 1 & 100.");
        inputNumber = Integer.parseInt(s);
    }

    boolean verifyNumber(){
        noOfGuesses++;
        if (inputNumber == randomNumber) {
            JOptionPane.showMessageDialog(null,
            "Congratulations!! You Guessed The Number Correctly in " + noOfGuesses + " Attempts."
                    + " Your Score Obtained is " + (100 - noOfGuesses));
            return true;
        }
        else if(inputNumber < randomNumber){
        JOptionPane.showMessageDialog(null, "Too Less...");
        }
        else if(inputNumber > randomNumber){
            JOptionPane.showMessageDialog(null, "Too High...");
        }
        return false;
    }   
}

public class Task1_numGuess {
    public static void main(String[] args) {
        NumberGuess Ng = new NumberGuess();
        boolean b = false;

        while (!b) {
            Ng.takeUserInput();
            b=Ng.verifyNumber();
        }        
    }
}




