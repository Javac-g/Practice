package Streams.Practice_04_10_22;

import java.io.FileInputStream;

import java.io.IOException;

public class App_one {
    public static void main(String...args) throws IOException {




        try(FileInputStream fileInputStream = new FileInputStream(args[0])){
                int i;

                if(args.length != 1){

                        System.out.println("File not found");

                    }
                do{
                    i = fileInputStream.read();
                    if(i != -1){
                        System.out.println((char)i);
                    }
                }while (i != -1);
        } catch (IOException e) {
            e.printStackTrace();

        }

    }
}
