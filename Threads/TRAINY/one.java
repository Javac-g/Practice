package Threads.TRAINY;

import java.io.FileInputStream;
import java.io.IOException;

public class one {
    public static void main(String...args) throws IOException {

        FileInputStream fileInputStream = null;

        int i;

        if(args.length != 1){

            System.out.println("_____FILE NAME NOT FOUND_____");

        }

        try{
            fileInputStream = new FileInputStream(args[0]);
            do{
                i = fileInputStream.read();
                if(i != -1){
                    System.out.print( (char)i + " ");
                }
            }while (i != -1);


        }catch(IOException e){
            System.out.println(e);
        }finally {
            fileInputStream.close();
        }


    }
}
