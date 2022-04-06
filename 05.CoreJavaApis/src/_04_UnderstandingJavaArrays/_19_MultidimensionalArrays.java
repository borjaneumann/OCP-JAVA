package _04_UnderstandingJavaArrays;

public class _19_MultidimensionalArrays {
    /*Arrays are objects, and of course array components can be objects.
    arrays can hold other arrays, and of course they can.
     */
    public static void main(String[] args) {

        //CREATING A MULTIDIMENSIONAL ARRAY

        int[][] vars1; //2D Array
        int vars2 [][]; //2D Array
        int[] vars3 []; //2D Array. Confusing style.
        int[] vars4 [], space [][]; // 2D Array and 3D Array. Confusing style

        //You can specify the size of your multidimensional array in the declaration if you like:
        String [][] rectangle = new String[3][2]; //Indexes are describing the arrau.
        //Three elements and each element contains 2 elements.
        rectangle[0][0]="Hello";
        rectangle[0][1]=" there";
        rectangle[1][0]="!!!";
        rectangle[1][1]="This is ";
        rectangle[2][0]="a 2D";
        rectangle[2][1]=" Array!!!";
        // The most common operation on a multidimensional array is to loop
        //through it. This example prints out a 2D array:
        for (int i = 0; i < rectangle.length; i++){
            for (int j = 0; j < rectangle[i].length; j++) {
                System.out.print(rectangle[i][j]); //Hello there!!!This is a 2D Array!!!
            }
        }
        //While that array happens to be rectangular in shape, an array doesn’t need
        //to be. Consider this one:
        int[][] differentSizes = {{1, 4}, {3}, {9,8,7}};

        /*Another way to create an asymmetric array is to initialize just an array’s
        first dimension and define the size of each array component in a separate
        statement:*/
        int [][] args1 = new int[4][];
        for (int i = 0; i < args1.length; i++) {
            for (int j = 0; j < args1[i].length; j++) {
                System.out.println(args1[i][j]);
            }

        }
        args1[0] = new int[5];
        args1[1] = new int[3];
        /*This technique reveals what you really get with Java: arrays of arrays that,
        properly managed, offer a multidimensional effect.*/

        //3 DIMENSIONAL ARRAYS
        int[][][] arr = new int[2][3][2];
        arr[0][0][0] = 1;
        arr[0][0][1] = 2;
        arr[0][1][0] = 3;
        arr[0][1][1] = 4;
        arr[0][2][0] = 5;
        arr[0][2][1] = 6;
        arr[1][0][0] = 7;
        arr[1][0][1] = 8;
        arr[1][1][0] = 9;
        arr[1][1][1] = 1;
        arr[1][2][0] = 2;
        arr[1][2][1] = 3;
        System.out.println();
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++) {
                for (int k = 0; k < arr[i][j].length; k++) {
                    System.out.print(arr[i][j][k]);
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
