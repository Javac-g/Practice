package Exceptions;



public class two {
        public void hello(int numb) {
            if(numb > 50){
                System.out.println(numb + " > 50");

            }
            else if (numb < 50 ){
                System.out.println(numb + " < 50 ");

            }
        }
        public void fin()throws MySec{

            throw new MySec(true);
        }
}
