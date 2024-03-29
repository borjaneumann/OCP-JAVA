package _03_ConstructingForLoops;

public class _10_WorkingWithForLoops {
    public static void main(String[] args) {

        /*1. CREATING AN INFINITE LOOP
        for(;;) {
            System.out.println("Hello world");
        }
         */
        //2. ADDING MULTIPLE TERMS TO THE FOR STATEMENT
        int  x = 0;
        for (long y = 0, z = 4 ; x < 5 && y < 10; x++, y++) {
            System.out.print(y + " ");
        }
        System.out.print(x + " ");
        System.out.println();

        /* 3. Redeclaring a variable in the initializing block IT DOESNT COMPILE!!
        int l = 0;
        for (int l = 4; l < 5 ; l++) {//DOESNT COMPILE
            System.out.println(l + " ");
        }*/
        int r = 0;
        for ( r = 4; r < 5 ; r++) {//IT DOES COMPILE
            System.out.println(r + " ");
        }

        /* 4. USING INCOMPATIBLE DATA TYPES IN THE INITIALIZING BLOCK
        The variables in the initializing block must be of the same type.
        int b = 0;
        for(int y = 0, long z = 4; b < 5; b++){//DOES NOT COMPILE
            System.out.println( y + " ");
        }
         */
        //5.USING LOOP VARIABLES OUTSIDE THE LOOP
        for (long i = 0, j =4; j < 5 && i < 10 ; i++, j++) {
            System.out.println("Example number 5: " + i + " ");
        }
       //System.out.println(j) // DOES NOT COMPILE;

        //6. PRINTING ELEMENTS IN REVERSE
        for (int i = 5; i > -3; i--) {
            System.out.println("Reverse loop 1: " + i);
        }
        String name = "Alexander";
        for (int i = name.length() - 1; i >= 0; i--) {
            System.out.println("Reverse loop 2: " + name.charAt(i));
        }
        name  = "Apollo";
        for (int i = 6 - 1; i >= 0; i--) {
            System.out.println(name.charAt(i));
        }
        System.out.println("Letter at index 5: " + name.charAt(5));
    }
}

