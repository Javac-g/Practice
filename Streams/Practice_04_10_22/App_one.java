package Streams.Practice_04_10_22;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class App_one {
    public static void main(String...args) throws IOException {

        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;

        if(args.length != 1){

            System.out.println("File not found");

        }
        try {
            int i;
            do{
                i = fileInputStream.read();
                if(i != -1){
                    fileOutputStream.write(i);
                }
            }while (i != -1);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if(fileInputStream != null){
                    fileInputStream.close();
                }
            }catch (IOException e1){
                System.out.println("E1");
            }
            try {
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }
            }catch (IOException e2){
                System.out.println("E2");
            }
        }

    }
}
