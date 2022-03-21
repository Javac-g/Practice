import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Maskify {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static String card;

    private static void mask(String card){

        char[] temp = card.toCharArray();

        for (int i  = 0; i < (temp.length  - 4) ; i++){

            temp[i] = '*' ;

        }
        for(char c : temp){

            System.out.print(c + "  ");

        }

    }

    public static void main(String...args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("\t\t\t\tВВЕДИТЕ НОМЕР КРЕДИТНОЙ КАРТЫ:");
        card = br.readLine();
        mask(card);


    }
}
