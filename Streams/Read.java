package Streams;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;

public class Read {

    public static void main(String...args) throws IOException {

      List<String> str = new ArrayList<>();
      ListIterator<String> iterator = str.listIterator();

      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      System.out.println("Enter your text, stop - for exit");

      for(int i = 0 ; i < 10;i++){

          str.add(br.readLine());


      }
      System.out.println("Your file has: ");
      for(int i = 0 ; i < 10;i++){


            System.out.println("id: " +iterator.nextIndex() + "  value:  " + iterator);
        }
    }
}


