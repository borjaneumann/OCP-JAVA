package _03_ApplyingAccessModifiers._03_03_ProtectedAccess.swan;

import _03_ApplyingAccessModifiers._03_03_ProtectedAccess.shore.Bird;

public class Swan extends Bird { // but subclass of Bird
    public void swim() {
        floatInWater(); // subclass access tosuperclass -> member is used without referring to a variable.
        System.out.println(text); // subclass access tosuperclass -> member is used without referring to a variable.
    }

    public void helpOtherSwanSwim() {
        Swan other = new Swan();
        other.floatInWater(); // subclass access to superclass -> A member is used through a variable (other)
        System.out.println(other.text); // subclass access to superclass -> A member is used through a variable (other)
    }

    public void helpOtherBirdSwim() {
        Bird other = new Bird();  //VERY IMPORTANT, THERE IS NO INHERITANCE HERE!!!
//        other.floatInWater(); // DOES NOTCOMPILE
//        System.out.println(other.text); // DOES NOTCOMPILE
    }
}
