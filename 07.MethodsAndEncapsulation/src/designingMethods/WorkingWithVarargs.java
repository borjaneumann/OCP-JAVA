package designingMethods;

public class WorkingWithVarargs {
    public void  walk (int...nums){}
    public void walk2 (int start, int...nums){}
    public void walk3(int...nums1, int start){} //doesn't compile
    public void walk4(int...start, int...nums){}//doesn't compile
}
