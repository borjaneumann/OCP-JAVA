package designingMethods;

public class ReturnType {
    public void walk1(){}
    public void walk2(){return;}
    public String walk3(){return "";}
    public String walk4(){}; //does not compile
    public walk5(){}; //does not compile
    public String int walk6(){}; //does not compile
    String walk7 (int a) { if (a==4) return "";}//does not compile

    int integer(){
        return 9;
    }
    int longMethod(){
        return  9L; //doesn't compile
    }
    int integerExpanded(){
        int temp = 9;
        return temp;
    }
    int longMethodExpanded(){
        int temp = 9L; //it doesn't compile
        return temp;
    }


}