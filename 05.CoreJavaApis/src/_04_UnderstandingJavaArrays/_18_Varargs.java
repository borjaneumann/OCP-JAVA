package _04_UnderstandingJavaArrays;

public class _18_Varargs {

    public static void main(String[] args) {

    /*When you’re creating an array yourself, it looks like what we’ve seen thus
    far. When one is passed to your method, there is another way it can look.
    Here are three examples with a main() method:

        public static void main (String[]args){};
        public static void main (String args[]);
        public static void main (String...args); //varargs = variable arguments
     */
    display(500, "hello"); //The number is: 500 //hello
    display(25, "Hello", "there");//The number is: 25 //Hello //there

    }
    //Onlu when passed in a method
    int result;
    static void display ( int x, String...words){ //An Array of type String names words
        System.out.println("The number is: " + x);
        for (String word : words) {
            System.out.println(word);
        }
    }
}
