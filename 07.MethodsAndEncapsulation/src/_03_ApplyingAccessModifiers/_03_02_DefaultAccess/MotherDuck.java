package _03_ApplyingAccessModifiers._03_02_DefaultAccess;

public class MotherDuck {
    String noise = "quack";
    void quack (){
        System.out.println(noise); //default access is ok
    }
    private void makeNoise(){
        quack(); //default access is ok
    }
}
