package designingMethods;

public class ParameterList {
    void nap(){}

    public void walk1(){}
    public void walk2 {} //Does not compile
    public void walk3(int a){}
    public void walk4 (int a;int b){} //Does not compile
    public void walk5 (int a, int b) {}
}
