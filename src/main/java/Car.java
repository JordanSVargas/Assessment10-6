public class Car extends Vehicle {

    private int numberOfDoors;
    private final float EXTRA_TAX = 0.05f;

    public Car(String name, int speed, float price, Size engineSize, int numberOfDoors) {
        super(name, speed, price, new Engine(engineSize));
        this.numberOfDoors = numberOfDoors;
    }

    public void printNumberOfDoors() {
        System.out.println("Number of doors: " + numberOfDoors);
    }


}
