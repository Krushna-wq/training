// Parent Class
class DeliveryVehicle {
  String vehicleId;

  public DeliveryVehicle(String vehicleId) {
    this.vehicleId = vehicleId;
  }

  public void dispatch() {
    System.out.println("Vehicle " + vehicleId + " is moving");
  }
}

// Child Class
class DroneDelivery extends DeliveryVehicle {

  public DroneDelivery(String vehicleId) {
    super(vehicleId); // Calling parent constructor
  }

  @Override
  public void dispatch() {
    System.out.println("Drone " + vehicleId + " is moving");
  }
}

// Class demonstrating Method Overloading
class LogisticsManager {

  public void scheduleDelivery(String address) {
    System.out.println("Scheduling delivery to " + address);
  }

  // Overloaded method
  public void scheduleDelivery(String address, String timeSlot) {
    System.out.println(
        "Standard delivery scheduled to " + address +
            " during " + timeSlot + " slot");
  }

  public void scheduleDroneDelivery(String address, String timeSlot) {
    System.out.println(
        "Drone delivery scheduled to " + address +
            " during " + timeSlot + " slot");
  }

  public void scheduleDelivery(int trackingID) {
    System.out.println("Querying tracking ID: " + trackingID);
  }
}

// Main Class
public class polymorphism {

  public static void main(String[] args) {

    System.out.println("=== Method Overloading ===");

    LogisticsManager manager = new LogisticsManager();

    manager.scheduleDelivery("123 Kalana, Pune");
    manager.scheduleDelivery("Santacruz West, Mumbai", "4 PM - 8 PM");
    manager.scheduleDroneDelivery("Baner, Pune", "10 AM - 12 PM");
    manager.scheduleDelivery(346985);

    System.out.println("\n=== Method Overriding ===");

    DeliveryVehicle vehicle = new DeliveryVehicle("Van1");
    vehicle.dispatch();

    DeliveryVehicle droneVehicle = new DroneDelivery("Drone1");
    droneVehicle.dispatch();
  }
}