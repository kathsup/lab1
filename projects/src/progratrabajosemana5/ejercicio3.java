
package progratrabajosemana5;

public class ejercicio3 {
   public static void main(String[] args){
   
  
        for (int i = 2; i <= 100; i++) {
            boolean esPrimo = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    esPrimo = false;
                    break;
                }
            }
            if (esPrimo) {
                System.out.print(i + ", ");
            }
   
        }
   
   
   
   
   
   
   
   } 
}
