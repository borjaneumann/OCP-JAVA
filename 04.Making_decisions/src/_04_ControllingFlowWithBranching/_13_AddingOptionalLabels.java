package _04_ControllingFlowWithBranching;

public class _13_AddingOptionalLabels {
    /*
    A label is an optional pointer to the head of a statement that allows the
    application flow to jump to it or break from it. It is a single identifier that
    is proceeded by a colon (:).

    Labels follow the same rules for formatting as identifiers. For readability,
    they are commonly expressed using uppercase letters, with underscores
    between words, to distinguish them from regular variables. When dealing
    with only one loop, labels do not add any value, but as we’ll see in the
    next section, they are extremely useful in nested structures.

    While this topic is not on the exam, it is possible to add optional
    labels to control and block statements.
    */
    public static void main(String[] args) {
        int[][] myComplexArray = {{5,2,1,3},{3,9,8,9},{5,7,12,7}};
        OUTER_LOOP: for(int[] mySimpleArray : myComplexArray) {
            INNER_LOOP: for(int i=0; i<mySimpleArray.length; i++) {
                System.out.print(mySimpleArray[i]+"\t");
            }
            System.out.println();
        }
    }


}
