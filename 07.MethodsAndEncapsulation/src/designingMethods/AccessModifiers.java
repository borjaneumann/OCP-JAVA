package designingMethods;

public class AccessModifiers {

    //private
    private String greeting ( String name){
        return "my name is " + name;
    }
    //Default
    void farewell (){
        System.out.println("Farewell!!");
    }

    public static void main(String[] args) {

    }
}
