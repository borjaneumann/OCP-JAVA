package _05_UnderstandingPackageDeclarationsAndImports;

import java.util.Random;

public class ImportExample {
    public static void main(String[] args) {
        Random r = new Random();
        System.out.println(r.nextInt(10)); // it prints out a random number between 0 and 9
    }
}
