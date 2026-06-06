class smartphone {
  public  boolean isON;
  public int brightness;
  public void turnOn(){
    isON = true;
    brightness = 100;
  }
  public void status() {
    System.out.println(" brightness status " + (isON ? " ON ":" OFF ")+"at"+ brightness+"%");
  }
   
}

 public class oops{
      public static void main(String[] args) {
        
        smartphone obj1 = new smartphone();
        obj1.turnOn();
        obj1.status();
        smartphone obj2 = new smartphone();
        obj2.turnOn();
        obj2.status();
      }
        
    }

