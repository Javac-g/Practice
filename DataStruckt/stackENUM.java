package DataStruckt;

import java.util.ArrayList;


public class stackENUM {

    private ArrayList<String> myArrayList  = new ArrayList<String>();



    void push(String item){

        myArrayList.add(item);
    }

    void pop(){
        for (int i = 0; i < myArrayList.size(); i++)
            System.out.println(myArrayList.get(i));
    }
}
