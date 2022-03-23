package _03_ApplyingAccessModifiers._03_01_PrivateAccess;

public class FatherDuck {
    private String noise = "quack";
    private void quack(){
        System.out.println(noise); // private access is ok
    }
    private void makeNoise(){
        quack(); // private access is ok
    }
}
