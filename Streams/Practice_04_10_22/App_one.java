package Streams.Practice_04_10_22;

import java.io.*;

public class App_one {
    public static void main(String...args) throws IOException {

        int i = 0;

        if(args.length != 1){

            System.out.println("File not found");
            return;

        }


        try(FileInputStream fileInputStream = new FileInputStream(args[0])){

                do{
                    i = fileInputStream.read();

                    if(i != -1)System.out.print( (char)i);

                }while (i != -1);

        } catch (IOException e) {
            e.printStackTrace();

        }

    }
}
