package Threads.Two;


class One {
    synchronized void first(Two two){

        String name = Thread.currentThread().getName();

        System.out.println(name + " Вошел в метод ONE.FIRST");

        try{

            Thread.sleep(1000);

        }catch (Exception e){

            System.out.println("Класс ONE прерван");

        }finally {

            System.out.println(name + " пытается вызвать TWO.LAST");

            two.Last();

        }
    }

    synchronized void Last(){

        System.out.println(" В методе ONE.LAST ");
    }
}
