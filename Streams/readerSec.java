package Streams;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class readerSec {
    public static void main(String...args) throws IOException {
        String str;
        BufferedReader sl = new BufferedReader(new InputStreamReader(System.in));
        do{
            str = sl.readLine();
            System.out.println("second: " + str );
        }while(!str.equals("stop"));


    }
}
