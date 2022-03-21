package _03_ConstructingForLoops;

public class _11_TheForEachLoop {
    public static void main(String[] args) {
        /*
        For loop version
        public void printNames(String[] names) {
            for(int counter=0; counter<names.length; counter++)
            System.out.println(names[counter]);
        }
         */
        /* For each loop
        The for-each loop is a specialized structure designed to iterate over arrays and various
        Collection Framework classes

        Syntax:

        for(datatype instance : collection) {
        //Body
        }

        The collection must be one of the following:
        * A built-in Java array
        * An object whose type implements java.lang.Iterable. This does not include
        all of the Collections Framework classes or interfaces, but only those that
        implement or extend that Collection interface.
        String and StringBuilder do not implement Iterable and cannot be used as the right side of a for-each
        statement.

        The left side of the for-each loop must include a declaration for an
        instance of a variable whose type is compatible with the type of the array
        or collection on the right side of the statement. A var may also be used for
        the variable type declaration, with the specific type determined by the
        right side of the for-each statement. On each iteration of the loop, the
        named variable on the left side of the statement is assigned a new value
        from the array or collection on the right side of the statement.


         */
        final String [] names = new String[4];
        names[0] = "Tony";
        names[1] = "John";
        names[2] = "Pete";
        names[3] = "Julia";
        for ( String name: names){
            System.out.println("names: " + name);
        }
    }

}
