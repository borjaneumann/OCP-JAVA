package HandlingExceptions;

import java.io.FileInputStream;
import java.io.IOException;

public class ClosingResourcesTryCatch {
    public static void main(String[] args) {
        ClosingResourcesTryCatch cr = new ClosingResourcesTryCatch();
        cr.readFile("file");
    }
    public void readFile(String file) {
        FileInputStream is = null;
        try {
            is = new FileInputStream("myfile.txt");
            //read file data
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(is != null) {
                try {
                    is.close();
                }catch (IOException e2) {
                    e2.printStackTrace();
                }
            }
        }
    }
}
