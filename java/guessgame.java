// import java.util.Scanner;

// public class first {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter the Age");
//         int age = sc.nextInt();

//         if (age < 5) {
//             System.out.println("Baby");
//         } else if (age >= 5 && age <= 12) {
//             System.out.println("Child");
//         } else if (age >= 13 && age <= 19) {
//             System.out.println("Teenage");
//         } else if (age >= 20 && age <= 50) {
//             System.out.println("Adult");
//         } else if (age >= 51 && age <= 80) {
//             System.out.println("Old");
//         } else {
//             System.out.println("Invalid");
//         }

//     }
// }

// public class first {

//     public static void main(String[] args) {
//         int countdown = 3;

//         while(countdown > 0){
//             System.out.println(countdown);
//             countdown--;
//         }
//         System.out.println("Happy New Year!!");
//     }
// }

import java.util.Random;
import java.util.Scanner;

public class guessgame {
    public static void main(String[] args) {

        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);

        int secretNumber = rand.nextInt(100) + 1; 
        int guess;
        int attempts = 0;

        System.out.println("Guess a number between 1 and 100");

        do {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            attempts++;

            if (guess > secretNumber) {
                System.out.println("Too High!");
            } else if (guess < secretNumber) {
                System.out.println("Too Low!");
            } else {
                System.out.println("Correct!");
                System.out.println("You guessed it in " + attempts + " attempts.");
            }

        } while (guess != secretNumber);

        scanner.close();
    }
}