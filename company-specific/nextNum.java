
// import java.util.*;
// public class nextNum {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a Number");
//         int num = sc.nextInt();
//         int sum = 0;
//         for(int i = 0; i<num; i++){
//             sum = i + 1;
//         }
//         System.out.println(sum);
//     }

// }


import java.util.*;

public class nextNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        String num = sc.next();

        String result = "";

        for (int i = 0; i < num.length(); i++) {
            int digit = num.charAt(i) - '0';
            result += (digit + 1);
        }

        System.out.println(result);

        sc.close();
    }
}