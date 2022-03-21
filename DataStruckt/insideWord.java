package DataStruckt;

public class insideWord implements Runnable {

    stackWord word;
    String name;
    Thread t;
    insideWord(stackWord word,String name){
        t = new Thread(this,name);
        System.out.println(name + " created: " + this);
        this.word = word;
        this.name = name;
        t.start();
    }

    synchronized public void run(){

        for(int i = 0; i < 12;i++){
            try{

                System.out.println (name + word.pop()  );
                Thread.sleep(1000);

            }catch (InterruptedException e) {
                System.out.println("Interrupted");
            }
        }
        System.out.println("END STRING");
    }















}
