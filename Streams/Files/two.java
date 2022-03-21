package Streams.Files;

import java.io.*;

public class two {

    public static void main(String...args) throws IOException {



        int i;

        if(args.length != 1){
            System.out.println("ENTER FILE NAME FIRST");
            return;
        }

        try(FileInputStream file = new FileInputStream(args[0]);
            PrintStream pr = new PrintStream(System.out,true)) {
            do{
                i = file.read();
                if(i != -1){
                    pr.print((char)i);
                }
            }while (i != -1);
        }catch (IOException e){
            System.out.println("ERROR: " + e);
        }

    }
}
