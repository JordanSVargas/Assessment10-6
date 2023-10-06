import java.util.List;
import java.util.Map;
import java.util.Collections;

public class VehicleApp {
    public void printListOfVehiclesNames(List<Vehicle> vehicles) {
        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle.getName());
        }
    }
    public void printListOfFlyableObjects(List<Flyable> flyables){
        for (Flyable flyable : flyables) {
            System.out.println(flyable.getName() + " can fly.");
        }
    }
    public void sortAndPrintDriveableVehicles(List<Driveable> driveables){
        Collections.sort(driveables);
        for (Driveable driveable : driveables) {
            System.out.println(driveable.getName());
        }
    }
    public void printPassengerNumbersOnly(Map<Integer, String> passengers){
        for (Map.Entry<Integer, String> entry : passengers.entrySet()) {
            System.out.println("Passenger: " + entry.getValue() + ", Number: " + entry.getKey());
        }
    }
}
