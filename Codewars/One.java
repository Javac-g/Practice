package Codewars;

public class One {
    static int count = 0;
    static char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m', 'n','o','p','q','r','s','t','u','v','w','x','y','z'};

    static public boolean check(String sentence){

        boolean answer = false;
        String one = "";
        String lower = sentence;
        for(int i = 0; i < lower.length()-1; i++){
            if(lower.charAt(i) != ' ' ){

                one += lower.toLowerCase().charAt(i);


            }

        }

        System.out.println("\nString : " + one);
        System.out.println("String Size: " + one.length());

        char[] temp = one.toCharArray();
        for(int i = 0 ; i <= temp.length-1;i++){
            for(int j = 0; j <= alphabet.length-1;j++) {
                if (alphabet[j] == one.charAt(i)) {
                    System.out.print(" j: " + j);
                    System.out.print(" i: " + i);
                    count++;
                    alphabet[j] = '*';
                    break;

                }

            }

            if(count >= 25){
                answer = true;

            }

            else if(count < 25){
                answer = false;


            }
        }

        System.out.println("\nFlags: " + count);
        System.out.print("Assigned letters: ");
        for(char c: alphabet ){

            System.out.print(c + " ");
        };
        System.out.println("\n____________________N E X T____________________\n");
        count = 0;
        alphabet = new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        return answer;

    }


    public static void main(String...args){

        check("The quick brown fox jumps over the lazy dog.");
        check("You shall not pass!");
        check("ocjmgw zeqarkhu tviypxfdbl sn");
        check("povqxknneav fcsxwyuihrg z jdwt mc lba");
        check("ABCD45EFGH,IJK,LMNOPQR56STUVW3XY");
    }

}




