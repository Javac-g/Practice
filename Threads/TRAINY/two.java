package Threads.TRAINY;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class two {

    public static void main(String...args) throws IOException {

        int i;
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream;

        if(args.length != 2){
            System.out.println("FILE NAME NOT ENTERED");
        }

        try{
            fileInputStream = new FileInputStream(args[0]);
            fileOutputStream = new FileOutputStream(args[1]);

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
        }

    }


}
