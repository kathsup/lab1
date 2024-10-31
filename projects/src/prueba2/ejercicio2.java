
package prueba2;

import java.util.Scanner;

public class ejercicio2 {
  public static void main(String[]args){

Scanner entrada = new Scanner(System.in);
double enero, febrero, marzo, abril, mayo, junio, julio, agosto, septiembre, octubre, noviembre, diciembre, consumototal, promedio ; 
 

      System.out.println("***Ingresar el consumo mensual de los ultimos 12 meses***");  
      System.out.println("Ingresar el consumo mensual de enero: ");
      enero = entrada.nextDouble(); 
      
      System.out.println("Ingresar el consumo mensual de febrero: ");
      febrero = entrada.nextDouble(); 
      
      System.out.println("Ingresar el consumo mensual de marzo: ");
      marzo = entrada.nextDouble(); 
      
      System.out.println("Ingresar el consumo mensual de abril: ");
      abril = entrada.nextDouble(); 
      
      System.out.println("Ingresar el consumo mensual de mayo: ");
      mayo = entrada.nextDouble(); 
      
      System.out.println("Ingresar el consumo mensual de junio: ");
      junio = entrada.nextDouble(); 
      
      System.out.println("Ingresar el consumo mensual de julio: ");
      julio = entrada.nextDouble();
      
      System.out.println("Ingresar el consumo mensual de agosto: ");
      agosto = entrada.nextDouble(); 
      
      System.out.println("Ingresar el consumo mensual de septiembre: ");
      septiembre = entrada.nextDouble(); 
      
      System.out.println("Ingresar el consumo mensual de octubre: ");
      octubre = entrada.nextDouble(); 
      
      System.out.println("Ingresar el consumo mensual de noviembre: ");
      noviembre = entrada.nextDouble(); 
      
      System.out.println("Ingresar el consumo mensual de diciembre: ");
      diciembre  = entrada.nextDouble(); 
      
      consumototal = enero+febrero+marzo+abril+mayo+junio+julio+agosto+septiembre+octubre+noviembre+diciembre; 
      System.out.println("el consumo total es: "+consumototal);
      
      promedio = consumototal/12; 
      System.out.println("El consumo total es: "+ promedio );











}  
}
