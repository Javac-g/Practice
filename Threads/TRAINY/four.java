package Threads.TRAINY;

import java.io.*;
import java.nio.Buffer;
import java.util.Scanner;

public class four {
    public static void main(String...args){
        byte[] b;
        String i;
        int c = 0;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        if(args.length != 2){
            System.out.println("ENTER STRING PLEASE");
        }

        try(FileOutputStream fileOutputStream = new FileOutputStream(args[0],true)){


            do{
                System.out.println("ENTER: \n");
                i = bufferedReader.readLine() + "\n";
                b=i.getBytes();
                fileOutputStream.write(b);

            }while (++c < 10);
        }catch(IOException e){

        }


    }
}
