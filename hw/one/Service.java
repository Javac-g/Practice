package hw.one;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Service {
    double numb;
    public String problem(double numb, int i) throws InterruptedException {

        while(numb != 1){

            if(numb % 2 !=0){

                numb = (numb * 3) + 1;
                Thread.sleep(1000);
                return ("\nNumber[ " + i + " ] - " + numb);

            }
            else if(numb % 2 == 0){

                numb = numb /2;
                Thread.sleep(1000);
                return ("\nNumber[ " + i + " ] - " + numb);
            }

        }

        if(numb == 1){
            System.out.println("\nNumber[ " + i + " ] - " + numb);


        }
        return "";

    }

    public void reader(String filename) throws IOException {
        int i;
        try(FileInputStream fin = new FileInputStream(filename)){


            try{
                do{
                    i = fin.read();
                    if(i != -1){
                        System.out.print ((char)i + " ");
                    }
                }while (i != -1);
            }catch (IOException e){
                System.out.println(e);
            }
        }


    }
    public void recorder(String c,String filename){
        byte[] b;
        try(FileOutputStream fin = new FileOutputStream(filename,true)){
            if (filename.equals("")){
                System.out.println("File name not found");
            }

            try{

                    b = c.getBytes();
                    fin.write(b);

            }catch (IOException e){
                System.out.println(e);
            }
        }catch (IOException e) {
            e.printStackTrace();
        }

    }
}
