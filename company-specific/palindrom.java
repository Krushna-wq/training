// public class palindrom {
//     public static boolean isPalindrome(String str){
//         str = str.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
//         for(int i = 0; i<=str.length()/2; i++){
//             int n = str.length();
//             if(str.charAt(i) != str.charAt(n-i-1)){
//                 return false;
//             }
//         }
//         return true;
//     }

//     public static void main(String[] args) {
//         String str = "madam";
//         System.out.println(isPalindrome(str));
//     }
// }


// using stack 
import java.util.Stack;

public class palindrom {
    public static boolean isPalindrome(String str) {
        str = str.replaceAll("[^A-Za-z0-9]", "").toLowerCase();

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != stack.pop()) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String str = "madam";
        System.out.println(isPalindrome(str));
    }
}