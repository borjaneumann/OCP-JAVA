package SuperReference2;

public class Beetle extends Insect{
    protected  int numberOfLegs = 6;
    short age = 3;
    public void printData() {
        System.out.println(this.label);
        System.out.println(super.label);
        System.out.println(this.age);
//        System.out.println(super.age); //doesn't compile there is no age in the parent
        System.out.println(numberOfLegs);
    }

    public static void main(String[] args) {
        new Beetle().printData();
    }
}
