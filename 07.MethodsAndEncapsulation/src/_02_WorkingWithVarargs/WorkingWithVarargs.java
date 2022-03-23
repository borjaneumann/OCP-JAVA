package designingMethods;

public class WorkingWithVarargs {
    public void  walk (int...nums){}
    public void walk2 (int start, int...nums){}
//    public void walk3(int...nums1, int start){} //doesn't compile
//    public void walk4(int...start, int...nums){}//doesn't compile

    public static void main(String[] args) {
        WorkingWithVarargs wwv = new WorkingWithVarargs();
        wwv.walk2(1);
        wwv.walk2(1,2);
        wwv.walk2(1,2,3);
        wwv.walk2(1, new int[]{4,5});
    }
//    public static void run(int... nums) {
//            System.out.println(nums[1]);
//         }
//         public static void main(String[] args) {
//            run(11, 22);     // 22
//         }
}
