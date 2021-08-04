package protectedAccess;

public class Gosling extends Bird{
    public void swim(){
        floatInWater(); //calling protected member
        System.out.println(text); //accessing protected member
    }

}
