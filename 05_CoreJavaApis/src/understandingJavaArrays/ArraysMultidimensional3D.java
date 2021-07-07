package understandingJavaArrays;

public class ArraysMultidimensional3D {
    public static void main(String[] args) {
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


        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++) {
                for (int k = 0; k < arr[i][j].length; k++) {
                    System.out.println(arr[i][j][k]);
                }
            }
        }

    }


}
