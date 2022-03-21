package Threads.TRAINY;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class three {

    public static void main(String...args){
        int i;

        if (args.length != 2){

            System.out.println("ENTER FILE NAME");


        }

        try(FileInputStream fileInputStream = new FileInputStream(args[0]);
            FileOutputStream fileOutputStream = new FileOutputStream(args[1])){

            do{
                i = fileInputStream.read();
                if(i != -1){
                    fileOutputStream.write(i);
                }
            }while (i != -1);

        }catch(IOException e){
            e.printStackTrace();
        }finally {
            System.out.println("FIN");
        }




    }

}
