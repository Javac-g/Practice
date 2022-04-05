package Codewars.PangramChecker;

public class MyMetod {
    String input;

    MyMetod(String input){
        this.input = input;
    }
    static String cleaner(String s){
        String clean = "";
        String lower = s;
        for(int i = 0; i < lower.length()-1; i++){
            if(lower.charAt(i) != ' ' ){

                clean += lower.toLowerCase().charAt(i);


            }

        }

        System.out.println("\nString : " + clean);
        System.out.println("String Size: " + clean.length());

        return clean + " ";
    }

    Integer check(String clean,int count){

        char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m', 'n','o','p','q','r','s','t','u','v','w','x','y','z'};
        char[] temp = clean.toCharArray();
        for(int i = 0 ; i <= temp.length-1;i++){
            for(int j = 0; j <= alphabet.length-1;j++) {
                if (alphabet[j] == clean.charAt(i)) {
                    System.out.print(" j: " + j);
                    System.out.print(" i: " + i);
                    count++;
                    alphabet[j] = '*';
                    break;

                }

            }
        }
        return count;
    }

    boolean answer(int count){

        boolean answer = false;
        if(count >= 25){
            answer = true;

        }

        else if(count < 25){
            answer = false;


        }
        return answer;
    }

}


