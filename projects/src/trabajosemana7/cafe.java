
package trabajosemana7;

import java.util.Scanner;


public class cafe {
    
    //variables estaticas para poder utilizarlo en toda la clase 
    public static int cafesPequenos = 0;
    public static int cafesMedianos = 0;
    public static int cafesGrandes = 0;
    public static double totalCaja = 0;

    
    public static double aplicarDescuento(double total) {
        Scanner entrada = new Scanner(System.in); 
        double totalConDescuento = total;

        System.out.println("Ingrese su edad: ");
        int edad = entrada.nextInt(); 
        
        //si tiene más de 65 años se le dara descuento de 15%, sin no el total seguira igual
        if (edad > 65) {
            
            double descuento = total * 0.15;
            totalConDescuento = total - descuento;
            System.out.println("Descuento aplicado: Lps. " + descuento);
        } else {
            System.out.println("No se aplica descuento.");
        }
        totalCaja += totalConDescuento;//va sumando el total a todo lo que se paga a la caja
        return totalConDescuento;
    }
    
    public static double calcularTotal() {
        double costoCafe = cafe();             
        double costoAdicionales = adicionales();
        
        double total = costoCafe + costoAdicionales;//suma los adicionales y precio del cafe 
        System.out.println("Subtotal: Lps. " + total);

        // para aplicar el descuento
        double totalConDescuento = aplicarDescuento(total);

        return totalConDescuento;
    }
    
    public static double cafe(){
    Scanner entrada = new Scanner(System.in); 
    double resultado=0; 
    
        //elegir el tamaño del cafe 
        System.out.println("Elija su tamaño de cafe: ");
        System.out.println("1. Pequeño Lps. 45");
        System.out.println("2. mediano Lps. 56");
        System.out.println("3. grande Lps. 65");
        System.out.print("Ingrese su opcion: ");
        int tamano = entrada.nextInt();
        
        if(tamano ==1 ){
        resultado+=45;
        cafesPequenos++; 
        }
        if(tamano==2){
        resultado+=56;
        cafesMedianos++;
        }
        if(tamano==3){
        resultado+=65;
        cafesGrandes++;//ir sumando la cantidad de cafes vendidos por el tamaño 
        }
        
        return resultado; 
    }
    
    public static double adicionales(){
    Scanner entrada = new Scanner(System.in); 
    double resultado2= 0; 
        
        //elegir adicionales 
        System.out.println("Agregue un complemento: ");
        System.out.println("1. leche Lps. 5");
        System.out.println("2. cremora Lps. 8");
        System.out.println("3. sencillo Lps. 0 ");
        System.out.print("Ingrese su opcion: ");
        int opcion = entrada.nextInt(); 
        
        if(opcion ==1 ){
        resultado2+=5;
        }
        if(opcion==2){
        resultado2+=8;
        }
        if(opcion==3){
        resultado2+=0;
        }
    
        return resultado2; 
    
    }
    
    
    
    
    
    public static void main(String[] args){
  
         Scanner entrada = new Scanner(System.in); 
         int opcion,clientes=0; 
         
         
        do {//hacer mientras no elijan cerrar la caja 
            System.out.println("----------CAFE EXPRESS UNI----------");
            System.out.println("1. Comprar cafe");
            System.out.println("2. cerrar caja");
            System.out.print("Elegir opcion: ");
            opcion = entrada.nextInt(); 
          
            switch(opcion){
            
                case 1:
                    System.out.println("-------Comprar cafe-------");
                    //llamar a los metodos 
                    double totalFinal = calcularTotal();//el total sin descuento 
                    System.out.println("El total a pagar es: Lps. " + totalFinal);//el total ya aplicando el descuento 
                    clientes++;
                    break;

                case 2:
                    System.out.println("-------Cerar caja-------");
                    //muestra la cantidad de cafes que se vendieron por tamaños, la cantidad de clientes y el total en caja
                    System.out.println("Cantidad de clientes atendidos: "+clientes);
                    System.out.println("Cafes pequeños vendidos: " + cafesPequenos);
                    System.out.println("Cafes medianos vendidos: " + cafesMedianos);
                    System.out.println("Cafes grandes vendidos: " + cafesGrandes);
                    System.out.println("Total en caja por ventas del dia: Lps. " + totalCaja);
                    break;
                    
                default:System.out.println("Opcion no valida vuelva a intentarlo");//en caso de ingresar una opción no valida 
                    break;
            
            }
            
        
        }
        while(opcion!=2);
        
        
    }   
}
