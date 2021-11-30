public class StringBuilderCreation {
    public static void main(String[] args) {
        //3 ways to create a StringBuilder
        //the classic one containing an empty sequence of characters
        StringBuilder sb1 =  new StringBuilder();

        //Containing an specific sequence of characters
        StringBuilder sb2 = new StringBuilder("stringBuilder");

        //we only know how big the value is
        StringBuilder sb3 = new StringBuilder(10);


    }
}
