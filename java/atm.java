import java.util.Scanner;

public class atm {
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Amount");
    int amount = sc.nextInt();
   
    int[] notes = {500, 200, 100, 50, 20, 10};      

    for(int i = 0; i<notes.length; i++){
        int count = amount / notes[i];

        if(count > 0){
            System.out.println(notes[i] + " x " + count);
        }
        amount = amount % notes[i];
    }
     
 }   
}
