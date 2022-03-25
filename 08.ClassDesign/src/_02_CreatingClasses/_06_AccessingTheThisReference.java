package _02_CreatingClasses;

public class _06_AccessingTheThisReference {
    /*
    The this reference refers to the current instance of the class
    and can be used to access any member of the class, including inherited members.
    It can be used in any instance method, constructor, and instance initializer block.
    It cannot be used when there is no implicit instance of the class, such as in a static method or
    static initializer block.
     */
    // What do you think the following program prints?
    private String color;

    //Unsual cases
    private String color1;
    private int height;
    private int length;

    public void setColor(String color) {
//            color = color;
        this.color = color; // Now prints PINK out
    }
    public static void main(String... unused) {
        _06_AccessingTheThisReference f = new _06_AccessingTheThisReference();
        f.setColor("PINK");
        System.out.println(f.color);// null

        //Unsual cases
        _06_AccessingTheThisReference uc = new _06_AccessingTheThisReference();
        uc.setData(1, 2);
        System.out.println(uc.length + " " + uc.height + " " + uc.color1);
    }
    public void setData(int length, int theheight) {
        length = this.length; //backwards no good!
        height = theheight; // Fine because it is a different name. "This" is not needed, no name collision.
        this.color1 = "white";
    }
}
