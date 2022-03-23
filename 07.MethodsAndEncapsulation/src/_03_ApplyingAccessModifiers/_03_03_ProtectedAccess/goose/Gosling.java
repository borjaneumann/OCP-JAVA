package _03_ApplyingAccessModifiers._03_03_ProtectedAccess.shore;

import _03_ApplyingAccessModifiers._03_03_ProtectedAccess.Bird;

public class Gosling extends Bird {
    public void swim(){
        floatInWater(); //calling protected member
        System.out.println(text); //accessing protected member
    }

}
