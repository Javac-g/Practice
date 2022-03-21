package DataStruckt;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class runner {
    public static void main(String...args) throws IOException {

        stackNUM number = new stackNUM(12);
        stackWord word = new stackWord(12);
        stackBOOL bool = new stackBOOL(12);
        stackCHAR charakter = new stackCHAR(12);
        stackENUM enums = new stackENUM();


        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));

        String[] one = new String[12] ;
        boolean[] two = new boolean[12] ;
        char[]three = new char[12] ;
        int four[] = new int[12];
        String[] E = new String[12];


        for(int i = 0;i < 11; i++){
            System.out.println("ENTER STRING: ");
            one[i] = b.readLine();
            word.push(one[i]);

        }
        for(int i = 0;i < 11; i++){
            System.out.println("ENTER BOOLEAN");
            String X = b.readLine();
            boolean Y = Boolean.parseBoolean(X);
            two[i] = Y;
            bool.push(two[i]);

        }
        for(int i = 0;i < 11; i++){
            System.out.println("ENTER CHARAKTER");
            three[i] = (char)b.read();
            charakter.push(three[i]);

        }
        for(int i = 0;i < 11; i++){
            System.out.println("ENTER NUMBERS: ");
            four[i] = b.read();
            number.push(four[i]);

        }
        for(int i = 0; i < 11; i++){
            System.out.println("ENTER ENUM");
            E[i] = b.readLine();
            enums.push(E[i]);

        }



        insideDigit digit = new insideDigit(number,"Numbers: ");
        insideWord insideWord = new insideWord(word,"Words: ");
        insideCHARA insideCHARA = new insideCHARA(charakter,"Charakters: ");
        insideBOOL insideBOOL = new insideBOOL(bool, "Boleans: ");
        insideENUMS insideENUMS = new insideENUMS(enums, "Enums");

        System.out.println(digit.name+ ": Is alive :  "+ digit.t.isAlive());
        System.out.println(insideWord.name+ ": Is alive :  "+ insideWord.t.isAlive());
        System.out.println(insideCHARA.name+ ": Is alive :  "+ insideCHARA.t.isAlive());
        System.out.println(insideBOOL.name+ ": Is alive :  "+ insideBOOL.t.isAlive());
        System.out.println(insideENUMS.name+ ": Is alive :  "+ insideENUMS.t.isAlive());

        System.out.println("STACKS HAVE: ");

        try{
            digit.t.join();
            insideWord.t.join();
            insideCHARA.t.join();
            insideBOOL.t.join();
            insideENUMS.t.join();

        }catch (InterruptedException e){
            System.out.println("INTERRUPTED");
        }finally {
            System.out.println(digit.name+ ": Is alive :  "+ digit.t.isAlive());
            System.out.println(insideWord.name+ ": Is alive :  "+ insideWord.t.isAlive());
            System.out.println(insideCHARA.name+ ": Is alive :  "+ insideCHARA.t.isAlive());
            System.out.println(insideBOOL.name+ ": Is alive :  "+ insideBOOL.t.isAlive());
            System.out.println(insideENUMS.name+ ": Is alive :  "+ insideENUMS.t.isAlive());
        }





    }
}
