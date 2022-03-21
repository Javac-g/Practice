package hw.one;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Runner {

    static String n;
    public static void main(String...args) throws IOException {
        Service starter = new Service();
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("ENTER SOME TEXT");
            n = scanner.nextLine() + "\n";
            starter.recorder(n, "C:\\Users\\Max.000\\IdeaProjects\\Oracle\\enum\\src\\hw\\one\\hello.txt");
        }while (!n.equals("stop"));
        starter.reader("C:\\Users\\Max.000\\IdeaProjects\\Oracle\\enum\\src\\hw\\one\\hello.txt");







    }
}
