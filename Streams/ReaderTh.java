package Streams;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReaderTh {
    public static void main(String...args) throws IOException {
        String[] st = new String[100];
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0 ; i < 10; i++){
            st[i] = b.readLine();
        }
        System.out.println("Your file content: ");
        for(int i = 0;i < 10;i++){
            System.out.println(st[i]);
        }
    }
}
