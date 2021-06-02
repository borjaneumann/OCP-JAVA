public class Car {
    private int numberOfWheels;
    private int speed;

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public Car(int numberOfWheels, int speed, String brand, String model) {
        this.numberOfWheels = numberOfWheels;
        this.speed = speed;
        this.brand = brand;
        this.model = model;
    }

    @Override
    public String toString() {
        return "Car{" +
                "numberOfWheels=" + numberOfWheels +
                ", speed=" + speed +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                '}';
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    private String brand;
    private String model;

}
