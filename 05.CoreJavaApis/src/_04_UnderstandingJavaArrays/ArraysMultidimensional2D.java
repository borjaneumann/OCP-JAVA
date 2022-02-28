package _04_UnderstandingJavaArrays;

public class ArraysMultidimensional2D {
    public static void main(String[] args) {
        int[][] vars1; //2D Array
        int vars2 [][]; //2D Array
        int[] vars3 []; //2D Array. Confusing style.

        int[] vars4 [], space [][]; // 2D Array and 3D Array. Confusing style
        String [][] rectangle = new String[3][2];
        rectangle[0][0]="Hello";
        rectangle[0][1]=" there";
        rectangle[1][0]="!!!";
        rectangle[1][1]="This is ";
        rectangle[2][0]="a 2D";
        rectangle[2][1]=" Array!!!";

        for (int i = 0; i < rectangle.length; i++){
            for (int j = 0; j < rectangle[i].length; j++) {
                System.out.print(rectangle[i][j]);
            }
        }

    }


}
