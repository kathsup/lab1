
package trabajoEnclaseSemana6;

import java.util.Scanner;

//hereda de empleado
public class Bonificacion extends Empleado{
    
    //atributos 
     double bonificacion; 
     int antiguedad; 

     //constructor 
    public Bonificacion(double bonificacion, int antiguedad, String nombre, double salario, char genero, int edad) {
        super(nombre, salario, genero, edad);
        this.bonificacion = bonificacion;
        this.antiguedad = antiguedad;
    }

    
     //funcion para establecer el salario final en base al salario y la antiguedad en la empresa 
     public double salarioFinal(double salario,int antiguedad){
     
         //si el salario es mayor a 18900 y tiene más de 5 años de antiguedad tendra un 10% de bonnificacion
         if (salario>18900 && antiguedad>5){
             this.bonificacion= (salario+(salario*0.10));
         }
         else{// si tiene entre 25000 y 45000 y más de 7 años de antiguedad tendra 15% de bonificacion 
         if((salario>25000&&salario<45000)&&antiguedad>7){
         this.bonificacion = (salario+(salario*0.15));
         }
         else{
         if(salario>45000){ //si tiene un sueldo mayor a 45000 tiene una bonificacion de 20%
         this.bonificacion = (salario+(salario*0.20));
         }
         else{//si no es ninguna no aplica 
             System.out.println("NO APLICA A BONIFICACION");
             this.bonificacion=salario; //sigue teniendo su sueldo normal 
         }
         }
         }
     return this.bonificacion;//retorna la bonificacion, el atributo de la clase 
     }
    
     public void mostrarDatos(){ //procedimiento para mostrar la informacion del empleado 
         System.out.println("Nombre: "+nombre+"\nGenero: "+genero+"\nEdad: "+edad+"\nAntiguedad: "+antiguedad+"\nSalario: "+salario);
     }
     
    public static void main(String[] args){
    
    Scanner entrada = new Scanner(System.in); 
    String nombre,genero; 
    double salario; 
    int edad,antiguedad;
    
    //se pide que ingrese su información 
        System.out.println("Ingrese su nombre: ");
        nombre = entrada.nextLine(); 
    
        System.out.println("Ingrese su genero (F/M): ");
        genero = entrada.nextLine();
        char gen = genero.charAt(0);
        
        System.out.println("Ingrese su edad: ");
        edad = entrada.nextInt();
        
        System.out.println("Ingrese su antiguedad en la empresa: ");
        antiguedad = entrada.nextInt();
    
        System.out.println("Ingrese su salario: ");
        salario = entrada.nextDouble();
    
        //se crea el objeto 
        Bonificacion empleado1 = new Bonificacion (0,antiguedad, nombre, salario, gen , edad); 
        
        empleado1.mostrarDatos();//se utiliza el procedimiento 
        System.out.println("Su sueldo "+salario+" con bonificacion queda en "+empleado1.salarioFinal(salario, antiguedad));//muestra el salario con su bonificación 
    
    
    }  
    
    
    
}
