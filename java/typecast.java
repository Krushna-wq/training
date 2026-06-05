// public class typecast {

//     public static void main(String[] args) {
//      float speed = 66.88f;
//        int myspeed = (int)speed;

//        System.out.println(myspeed);
//     }
// }


public class typecast {

    public static void main(String[] args) {
        System.out.println("string to int");
        String numString = "12340";

        int n1 = Integer.parseInt(numString);
        System.out.println("parse int way" +n1+"(math check : "+(n1+n1)+")");

        int n2 = Integer.valueOf(numString);
        System.out.println("parse int way 2 "+n2+"( math check : "+(n2+1)+")");

        String invaldString = "123abe";
        try {
            int badnumber = Integer.parseInt(invaldString);
        }
        catch(NumberFormatException e){
            System.out.println("Error : cannot  convert "+ invaldString +"to int");
        }
    }
}