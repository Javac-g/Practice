package Lambdas.Practice_04_06_22.Links_To_GenMet.One;

import java.util.ArrayList;
import java.util.Collections;

public class App {
    static int compare(Data a, Data b){

        return a.getVal() - b.getVal();
    }
    public static void main(String...args){
        ArrayList<Data> al = new ArrayList<Data>();

        al.add(new Data(1));
        al.add(new Data(4));
        al.add(new Data(2));
        al.add(new Data(9));
        al.add(new Data(3));
        al.add(new Data(7));

        Data max = Collections.max(al,App::compare);
        System.out.println(max.getVal());

    }
}
