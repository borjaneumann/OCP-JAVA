package _02_RecognizingExceptionClasses._02_CheckedExceptionClasses;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

/*
Thrown programmatically when there’s a problem reading
or writing a file
 */
public class _10_IOException {
        public FileInputStream testMethod1(){
            File file = new File("test.txt");
            FileInputStream fileInputStream = null;
            try{
                fileInputStream = new FileInputStream(file);
                fileInputStream.read();
            }catch (IOException e){
                e.printStackTrace();
            }
            finally{
                try{
                    if (fileInputStream != null){
                        fileInputStream.close();
                    }
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
            return fileInputStream;
        }
        public static void main(String[] args){
            _10_IOException instance1 = new _10_IOException();
            instance1.testMethod1();
        }
}
