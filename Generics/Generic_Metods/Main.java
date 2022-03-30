package Generics.Generic_Metods;

public class Main {

    public static void main(String...args){
        One one = new One();
        Integer[] nums = {1,2,3,4,5,6,7};
        String[] str = {"one","two","three","four","five","six","seven","eight"};

        if(one.isin(3,nums)){
            System.out.println(3 + ": in nums");
        }
        if(one.isin("two",str)){

            System.out.println("two in str");

        }


    }
}
