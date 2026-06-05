import java.util.Scanner;

public class Vowelscount {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string:");
        String inputString = scanner.nextLine().toLowerCase();

        int acount = 0, ecount = 0, icount = 0, ocount = 0, ucount = 0;

        for (int i = 0; i < inputString.length(); i++) {
            char c = inputString.charAt(i);

            switch (c) {
                case 'a':
                    acount++;
                    break;

                case 'e':
                    ecount++;
                    break;

                case 'i':
                    icount++;
                    break;

                case 'o':
                    ocount++;
                    break;

                case 'u':
                    ucount++;
                    break;
            }
        }

        int totalVowels = acount + ecount + icount + ocount + ucount;

        System.out.println("\nVowel Counts:");
        System.out.println("a : " + acount);
        System.out.println("e : " + ecount);
        System.out.println("i : " + icount);
        System.out.println("o : " + ocount);
        System.out.println("u : " + ucount);
        System.out.println("Total vowels are " + totalVowels);

        scanner.close();
    }
}




// import java.util.Scanner;

// public class amount {
//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter amount: ");
//         int amount = sc.nextInt();

//         int[] notes = {500, 200, 100, 50, 20, 10, 5, 2, 1};

//         for (int i = 0; i < notes.length; i++) {

//             int count = amount / notes[i];

//             if (count > 0) {
//                 System.out.println(notes[i] + " x " + count);
//             }

//             amount = amount % notes[i];
//         }

//         sc.close();
//     }
// } {
    
// }