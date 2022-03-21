package Streams.Files;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class three {
    public static void main(String...args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)) ;
        PrintStream pr = new PrintStream(System.out,true);
        pr.println("Enter number");
        int c = 4211;
        System.out.write(c);
        System.out.write('\n');




    }
}
