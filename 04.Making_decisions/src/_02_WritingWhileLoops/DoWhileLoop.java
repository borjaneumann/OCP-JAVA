package _02_WritingWhileLoops;

public class DoWhileLoop {
    public static void main(String[] args) {
        int llama = 16;

        if (llama > 10){
            do{
                System.out.println("llama");
                llama--;
            }
            while(llama>10);
        }
    }
}
