package RunTimeExceptionClasses;

public class ArrayIndexOutOfBoundsExceptions {
    public static int array[]={0,2,4,6};

    public static void main(String[] args) {
//        System.out.println(ArrayIndexOutOfBoundsExceptions.array[2]);
//        System.out.println(ArrayIndexOutOfBoundsExceptions.array[5]);
        int total = 0;
        int [] array2 = {1,2,3};
        for (int i = 0; i <=array2.length ; i++) {
            System.out.println(total+=array2[i]);

        }

    }
}
