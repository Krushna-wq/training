public class LogestPrefix {
     public static String LongestCommon(String arr[]){
        if (arr == null || arr.length == 0) return "";

        for (int i = 0; i < arr[0].length(); i++) {
            char c = arr[0].charAt(i);
            for (int j = 1; j < arr.length; j++) {
                if (i >= arr[j].length() || arr[j].charAt(i) != c) {
                    return arr[0].substring(0, i);
                }
            }
        }
        return arr[0];
     }



    public static void main(String[] args) {
        String arr[] = {"flower", "flow", "flight" };
        System.out.println(LongestCommon(arr));
    }
}


