package understandingJavaArrays;

public class ArraysVarargs {
//    public static void main(String[] args);
//    public static void main(String args[]);
//    public static void main(String...args);

    //Onlu when passed in a method
    int result;
    public void twoTimes (String x, int...nums){
        System.out.println("The varargs are: " + x);
        for(int s:nums){
            System.out.println(s);

        }

    public static void main(String[] args) {
        ArraysVarargs arraysVarargs = new ArraysVarargs();
        System.out.println(arraysVarargs.twoTimes("hola",1,2,3,4..));
    }


}
