package Streams.Practice_04_10_22;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class App_one {
    public static void main(String...args) throws IOException {

        FileInputStream fileInputStream = new FileInputStream(args[0]);
        FileOutputStream fileOutputStream = new FileOutputStream("Streams/Practice_04_10_22/Test.txt");

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
            fileInputStream.close();
            fileOutputStream.close();
        }

    }
}
