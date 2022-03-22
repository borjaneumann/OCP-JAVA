package _04_ControllingFlowWithBranching;

public class _16_TheReturnStatement {
    /*
    Creating methods and using return statements can be used as an alternative to
    using labels and break statements. For example, take a look at this rewrite
    of our earlier FindInMatrix class:

    Just remember that return statements can be used to exit loops quickly and can lead to more
    readable code in practice, especially when used with nested loops.

     */
    private static int[] searchForValue(int[][] list, int v) {
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list[i].length; j++) {
                if (list[i][j] == v) {
                    return new int[]{i, j}; //The return statement inside a
                    // loop will cause the loop to break and further
                    // statements will be ignored by the compiler.
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[][] list = {{1, 13}, {5, 2}, {2, 2}};
        int searchValue = 2;
        int[] results = searchForValue(list, searchValue);
        if (results == null) {
            System.out.println("Value " + searchValue + " not found");
        } else {
            System.out.println("Value " + searchValue + " found at: " +
                    "(" + results[0] + "," + results[1] + ")");
        }
    }
}
