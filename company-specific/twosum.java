public class twosum {
   public static void TwoSum(int arr[], int target){
       int left = 0;
       int right = arr.length - 1;
       
       while(left < right) {
           int sum = arr[left] + arr[right];
           if(sum == target) {
               System.out.println(left + ", " + right);
               return;
           } else if(sum < target) {
               left++;  
           } else {
               right--;
           }
       }
       System.out.println("No pair found");
   }

    public static void main(String[] args) {
        int arr[] = {2, 7, 11, 15};
        TwoSum(arr, 9);
    }
}
