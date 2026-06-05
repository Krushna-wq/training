import java.util.Random;
import java.util.Scanner;

public class InnerGuessingGame {  
    public static void main(String[] args) {

        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        //  System.out.println("Enter the Number");
        // int RandomNum = sc.nextInt();
       

        
        int NumToGuess = rand.nextInt(100) + 1;
        int numberOFTries = 0;
        int guess;
        

        System.out.println("Guess the Number between 1 to 100");

        do {
            System.out.println("enter the number");
            guess = sc.nextInt();
            guess++;
            if(guess > NumToGuess){
                System.out.println("Number is High!");
            }else if(guess < NumToGuess){
                System.out.println("Number is Low!");
            }else {
                System.out.println("Correct!");
                System.out.println("You guessed it in " + guess + " attempts.");
            }

        } while (guess != NumToGuess);

       
    }
}


