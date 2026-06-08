// // import java.util.*;

// // public class first {
// //   public static void main(String[] args) {
// //    Scanner sc = new Scanner(System.in);

// //   }    
// // }


// import java.util.ArrayList;
// import java.util.*;

// public class PrimeArrayList {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         ArrayList<Integer> primes = new ArrayList<>();
//         System.out.print(" enter a number ");
//         int num = sc.nextInt();

//         for (int i = 2; i <= num; i++) {
//             boolean isPrime = true;
//             for (int j = 2; j * j <= i; j++) {
//                 if (i % j == 0) {
//                     isPrime = false;
//                     break;
//                 }
//             }
//             if (isPrime) {
//                 primes.add(i);
//             }
//         }

//         System.out.println(primes);
//     }
// }


// optimized code 

import java.util.ArrayList;
import java.util.Scanner;

public class PrimeArrayList {

    public static boolean isPrime(int num) {
        if (num < 2) {                // check the number is greater than 2 if not return false
            return false;
        }

        for (int i = 2; i * i <= num; i++) {   // started for loop from 2 to num and check the condition
            if (num % i == 0) {                 //  num % i == 0 if the value is exact zero then its not a prime
                return false;
            }
        }

        return true;        // otherwise return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> primes = new ArrayList<>();  // created empty list

        System.out.print("Enter a number: ");
        int num = sc.nextInt();                    // input from user

        for (int i = 2; i <= num; i++) {    // started for loop from 2 to num and check the value of isPrime  
            if (isPrime(i)) {              // if the value of isPrime = true the if statement adds that prime number in list 
                primes.add(i);            
            }
        }

        System.out.println(primes);   // print primses

        sc.close();
    }
}