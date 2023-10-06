public abstract class Vehicle extends Product{
    private int speed;
    private float price;
    private Engine engine;
    protected final float TAX_AMOUNT  = .10F;

    public Vehicle(String name, int speed, float price, Engine engine) {
        super(name);
        this.speed = speed;
        this.price = price;
        this.engine = engine;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public float getTAX_AMOUNT() {
        return TAX_AMOUNT;
    }

    public static void printVehicleType() {

    }

    public static void getPriceAfterTax(){

    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "speed=" + speed +
                ", price=" + price +
                ", engine=" + engine +
                ", TAX_AMOUNT=" + TAX_AMOUNT +
                '}';
    }
}
