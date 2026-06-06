
//parent class
abstract class DeliveryVehicle{
    String vehicleId;
    //constructor
    DeliveryVehicle(String vehicleId){
        this.vehicleId = vehicleId;
    }
    //

    public void dispatch(){
        System.out.println("Vehicle "+vehicleId+"is moving");
    }
    abstract void navi_dest();

}
interface AutomatedSystem{
   String systemmVersion = "1.23";
   void runtest(); // abstract function
}

class Drone extends DeliveryVehicle implements AutomatedSystem{
    int battery;
   Drone(String vehicleId, int battery ){
    super(vehicleId);
    this.battery = battery;
   }   
   @Override
   void navi_dest() {
    System.out.println("Drone "+ vehicleId+"moving");
   }
   @Override
   public void runtest(){
    System.out.println("System "+systemmVersion+"scanning");
   }

   public class abstraction { 
    public static void main(String[] args) {
        Drone myDrone = new Drone("drone-99", 88);
        System.out.println("Absrtact class function");
        myDrone.dispatch();
        myDrone.navi_dest();
        System.out.println("Interface function");
        myDrone.runtest();
    }
   }
}

