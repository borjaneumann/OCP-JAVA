package _02_WorkingWithVarargs;

public class _08_WorkingWithVarargs {
    /*
    A varargs parameter must be the last element in a method’s parameter list.
    This means you are allowed to have only one varargs parameter per method.
     */
    public void  walk (int...nums){}
    public void walk2 (int start, int...nums){}
//    public void walk3(int...nums1, int start){} //doesn't compile
//    public void walk4(int...start, int...nums){}//doesn't compile

    public static void main(String[] args) {
        _08_WorkingWithVarargs wwv = new _08_WorkingWithVarargs();
        wwv.walk2(1); // Creates an array of length 0.
        wwv.walk2(1,2);
        wwv.walk2(1,2,3); // Passing a list of elements
        wwv.walk2(1, new int[]{4,5}); // Passing an array
        /*
        When calling a method with a varargs parameter, you have a choice. You
        can pass in an array, or you can list the elements of the array and let Java
        create it for you. You can even omit the varargs values in the method call
        and Java will create an array of length zero for you.

        You’ve seen that Java will create an empty array if no parameters are
        passed for a vararg. However, it is still possible to pass null explicitly:

        walk(1, null); // throws a NullPointerException in walk()

        Since null isn’t an int, Java treats it as an array reference that happens to
        be null. It just passes on the null array object to walk. Then the walk()
        method throws an exception because it tries to determine the length of
        null.
         */

        run(11, 22);     // 22
    }
    public static void run(int... nums) {
            System.out.println(nums[1]);
         }
}
