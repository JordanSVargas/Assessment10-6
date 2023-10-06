import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Jordan Car", 60, 16000, Size.SMALL, 5);
        Drone drone1 = new Drone("Eagle");
        FlyingCar flyingCar = new FlyingCar("SkyCar", 80, 25000, Size.MEDIUM, 4, true);

        List<Vehicle> vehicleList = new ArrayList<>();
        vehicleList.add(car1);
        vehicleList.add(drone1);
        vehicleList.add(flyingCar);
        for (Vehicle vehicle : vehicleList) {
            System.out.println("Name: " + vehicle.getName() + ", Type: " + vehicle.getClass().getSimpleName());
        }
    }
}