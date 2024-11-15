package trabajoEnclaseSemana6;

import java.util.Scanner;

public class bonificacion extends empleado{
    
    //atributos 
    double bonificacion; 

    public bonificacion(String nombre, double salario, char genero, int edad, int antiguedad) {
        super(nombre, salario, genero, edad, antiguedad);
    }
    
    public double bonificacion(double salario,int antiguedad){
    
        if (salario>18900 && antiguedad>5){
        bonificacion = ((salario*0.10)+salario); 
        //return bonificacion; 
        }
        else{
        if((salario>25000)&& (salario<45001)&& antiguedad>7);{
        bonificacion= ((salario*0.15)+salario);
        }
        if(salario>45000){
        bonificacion = ((salario*0.20)+salario);
        }
        
        }
        
        return bonificacion; 
    }
    
    public static void main(String[] args){
    
        Scanner entrada = new Scanner (System.in); 
        
        System.out.println("Ingresae nombre: ");
        
        
        
    }
    
}
