package SuperReference;

public class Bat extends Mammal{
    String type = "Bat";
    public String getType() {
        return super.type + ":" + this.type; //Really good example
    }

    public static void main(String[] args) {
        System.out.println(new Bat().getType());
    }
}
