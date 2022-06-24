package _5_SortingData.ComparableExample;

public class Laptop implements Comparable <Laptop>{
    private String brand;
    private String color;
    private int price;

    public Laptop(String brand, String color, int price) {
        this.brand = brand;
        this.color = color;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(Laptop laptop) { //Also possible to add on declaration class comparable<Laptop>
        if  (this.getPrice() > laptop.getPrice() ) return 1;
        else return -1;
    }
}
