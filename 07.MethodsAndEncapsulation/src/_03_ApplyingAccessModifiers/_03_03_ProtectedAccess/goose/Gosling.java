package _03_ApplyingAccessModifiers._03_03_ProtectedAccess.goose;

import _03_ApplyingAccessModifiers._03_03_ProtectedAccess.shore.Bird;

public class Gosling extends Bird {
    /*Since Gosling is a subclass of Bird, it can access these members even
    though it is in a different package.
     */
    public void swim(){
        floatInWater(); //calling protected member
        System.out.println(text); //accessing protected member
    }

}
