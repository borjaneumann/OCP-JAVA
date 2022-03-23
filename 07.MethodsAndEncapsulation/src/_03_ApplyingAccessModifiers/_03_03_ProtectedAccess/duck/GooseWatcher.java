package _03_ApplyingAccessModifiers._03_03_ProtectedAccess.duck;

import _03_ApplyingAccessModifiers._03_03_ProtectedAccess.goose.Goose;

public class GooseWatcher {
    public void watch() {
        Goose goose = new Goose();
//        goose.floatInWater(); // DOES NOT COMPILE
    }

}
