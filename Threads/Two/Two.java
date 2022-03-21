package Threads.Two;
class Two {

    synchronized void Second(One one){

        String name = Thread . currentThread() . getName();

        System . out . println(name + " вошел в метод TWO.SECOND ");

        try{

            Thread.sleep(1000);

        }catch (Exception e){

            System.out.println("Класс TWO прерван");

        }finally {

            System.out.println(name + " пытается вызвать ONE.LAST");

            one.Last();

        }
    }

    synchronized void Last(){

        System.out.println(" в методе TWO.LAST");
    }
}
