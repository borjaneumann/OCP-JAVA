package _04_ControllingFlowWithBranching;

public class _12_NestedLoops {
    /*
    The final type of control flow structures we will cover in this chapter are
    branching statements.

    Before we move into branching statements, we need to introduce the
    concept of nested loops. A nested loop is a loop that contains another loop
    including while, do/while, for, and for-each loops.
     */
    public static void main(String[] args) {
        int[][] myComplexArray = {{5, 2, 1, 3}, {3, 9, 8, 9}, {5, 7, 12, 7}};

        for (int[] mySimpleArray : myComplexArray) {
            for (int i = 0; i < mySimpleArray.length; i++) {
                System.out.print(mySimpleArray[i] + "\t");
            }
            System.out.println();
        }

    /*
    5	2	1	3
    3	9	8	9
    5	7	12	7

    Nested loops can include while and do/while, as shown in this example.
    See whether you can determine what this code will output:
     */
        System.out.println();
        System.out.print("hungryHippopotamus: ");
        int hungryHippopotamus = 8;
        while (hungryHippopotamus > 0) {
            do {
                hungryHippopotamus -= 2;
            } while (hungryHippopotamus > 5);
            hungryHippopotamus--;
            System.out.print(hungryHippopotamus + ", "); // 3 , 0 ,
        }
    }
    /*
    Exam tip:
    Some of the most time-consuming questions you may see on the
    exam could involve nested loops with lots of branching. We
    recommend you try to answer the question right away, but if you
    start to think it is going to take too long, you should mark it and
    come back to it later. Remember, all questions on the exam are weighted evenly!
     */
}
