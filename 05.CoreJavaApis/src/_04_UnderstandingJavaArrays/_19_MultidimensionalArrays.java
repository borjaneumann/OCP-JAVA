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

        for (int i = 0; i < rectangle.length; i++){
            for (int j = 0; j < rectangle[i].length; j++) {
                System.out.print(rectangle[i][j]); //Hello there!!!This is a 2D Array!!!
            }
        }

    }


}
