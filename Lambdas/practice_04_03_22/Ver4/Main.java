package Lambdas.practice_04_03_22.Ver4;

public class Main {

    static <T extends Tool,V> String create(T t, V v){

        return "Values:  " + t.process(v);

    }
    public static void main(String...args){
        Tool<String> one = (msg) -> {
            String result = "";


            for(int i = 0;i <= msg.length()-1;  i++){
                if(msg.charAt(i) != ' '){
                    result += msg.charAt(i);
                }
            }
            return result;
        };

        Tool<Integer> two = (num) ->num * num;

        System.out.println(create(one,"H E L L O"));
        System.out.println(create(two,99));


    }
}
