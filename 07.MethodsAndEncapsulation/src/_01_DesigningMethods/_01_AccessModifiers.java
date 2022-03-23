package _01_DesigningMethods;

public class _01_AccessModifiers {
    /*
    * private -> The private modifier means the method can be called only from
    within the same class.

    * Default -> (Package-Private) Access With default access, the method can
    be called only from classes in the same package. This one is tricky
    because there is no keyword for default access. You simply omit the
    access modifier.

    * protected The protected modifier means the method can be called only
    from classes in the same package or subclasses. You’ll learn about
    subclasses in Chapter 8, “Class Design.”

    * public The public modifier means the method can be called from any class.

    public void walk1() {}
    default void walk2() {} // DOES NOT COMPILE
    void public walk3() {} // DOES NOT COMPILE
    void walk4() {}

    Examples
    PRIVATE
    private String greeting ( String name){
        return "my name is " + name;
    }
    DEFAULT
    void farewell (){
        System.out.println("Farewell!!");
    }
    PROTECTED
    protected String greeting  (){
        return null;
    }
    PUBLIC
    public int number (){
        return 0;
    }
    public static void main(String[] args) {

     */
}
