package DataStruckt;

public class insideCHARA implements Runnable {
    stackCHAR chara;
    String name;
    Thread t;
    insideCHARA(stackCHAR chara,String name){
        t = new Thread(this,name);
        System.out.println(name + " created: " + this);
        this.chara = chara;
        this.name = name;
        t.start();
    }

    synchronized public void run(){

        for(int i = 0; i < 12;i++){
            try{

                System.out.println(name + chara.pop() );
                Thread.sleep(1000);

            }catch (InterruptedException e){
                System.out.println("Interrupted");
            }
        }
        System.out.println("END CHARAKTER");
    }





}
