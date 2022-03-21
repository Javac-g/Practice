package DataStruckt;

public class insideENUMS implements Runnable {

    stackENUM stackENUM;
    String name;
    Thread t;
    insideENUMS(stackENUM stackENUM,String name){
        this.name = name;
        t = new Thread(this, name);
        this.stackENUM = stackENUM;

        t.start();
    }

    public void run(){
        for(int i = 0; i < 12;i++){
            try{
                stackENUM.pop();
                Thread.sleep(500);

            }catch (InterruptedException e){
                System.out.println("Interrupted");
            }finally {
                System.out.println("END ENUM");
            }
        }
    }



}
