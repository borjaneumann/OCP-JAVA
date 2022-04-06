package _02_UsingTheStringBuilderClass;

public class _06_MutabilityAndChaining {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("start");
        sb.append("+middle"); //It returns a reference to sb which is ingnored as it is not stored in any variable.
        StringBuilder same = sb.append("+end");

        System.out.println("sb:" + sb); //sb:start+middle+end -> sb is mutable!!
        System.out.println("Same: "+ same);//Same: start+middle+end -> sb and same are pointing to the same object.

        /*There’s only one StringBuilder object here. We know that because new StringBuilder()
        was called only once.
        There are two variables referring to that object, which has a value of "abcde".
        Those two variables are still referring to that same object, which now has a value of "abcdefg".
        Incidentally, the assignment back to b does absolutely nothing. b is already
        pointing to that StringBuilder.
         */
        StringBuilder a = new StringBuilder("abc"); //the only object here!!
        StringBuilder b = a.append("de"); //because both potint ot the same object, when b is updated,
        // a also gets updated.
        b = b.append("f").append("g");
        System.out.println("a = " + a); //abcdefg
        System.out.println("b = " + b); //abcdefg

    }
}
