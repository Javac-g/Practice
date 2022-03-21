package Streams.Files;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {

    public static void main(String...args) {
        int i;

        FileInputStream original = null;
        FileOutputStream copy =  null;

        if(args.length != 2){

            System.out.println("MUST BE TWO ARGUMENTS");
            return;

        }

        try{
            original = new FileInputStream(args[0]);
            copy = new FileOutputStream(args[1]);
            do{
                i = original.read();
                if(i != -1){
                    copy.write(i);
                }
            }while (i != -1);
        }catch (IOException e){
            System.out.println("IO EXCEPTION");
        }finally {
            try {
                if (original != null) {
                    original.close();
                }
            } catch (IOException e1) {
                System.out.println("ERRR CLOSE INPUT: " + e1);
            }

            try {
                if (copy != null) {
                    copy.close();
                }
            } catch (IOException e2) {
                System.out.println("ERRR CLOSE OUTPUT: " + e2);
            }

        }

    }

}
