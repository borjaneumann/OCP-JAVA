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
    //protected
    protected String greeting  (){
        return null;
    }
    public int number (){
        return 0;
    }
    public static void main(String[] args) {

    }
}
