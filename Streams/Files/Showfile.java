package Streams.Files;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Showfile {
    public static void main(String...args){
        int i;

        if(args.length != 1){
            System.out.println("NO files to read");
        }

        try(FileInputStream fin = new FileInputStream(args[0])){

            do{
                i = fin.read();
                if(i != -1){
                    System.out.print((char)i);
                }
            }while (i != -1);

        }catch (FileNotFoundException e){
            System.out.println("FILE NOT FOUND: " + e);
        }catch (IOException e1){
            System.out.println("INPUT_OUTPUT ERROR: " + e1);
        }
    }
}
