public class SquareRootBinarySearch {

    public static int findSquareRoot(int n) {
      
        if (n == 0 || n == 1) {
            return n;
        }

        int start = 1;
        int end = n;
        int ans = 0;

        while (start <= end) {
            
            int mid = start + (end - start) / 2; 
            
            
            long square = (long) mid * mid; 

            if (square == n) {
                return mid; 
            } else if (square < n) {
                ans = mid;     
                start = mid + 1; 
            } else {
                end = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int target1 = 16;
       

        System.out.println("Square root of " + target1 + " is: " + findSquareRoot(target1));
       
    }
}
