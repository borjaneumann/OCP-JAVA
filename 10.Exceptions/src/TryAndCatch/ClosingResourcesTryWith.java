package TryAndCatch;

import java.io.FileInputStream;
import java.io.IOException;

public class ClosingResourcesTryWith {
    public static void main(String[] args) {
        //functionally identical to ClosingResourcesTryCatch with half the lines
    }
    public void readFile (String file) {
        try (FileInputStream is = new FileInputStream("myfile.txt")){
            //read file data
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
