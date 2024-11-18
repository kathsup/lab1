
package trabajoEnclaseSemana6;

import java.util.Scanner;

public class Libro {
   
   // atributos 
    String titulo; 
    String autor; 
    double precio; 
    int ISBN; 
    int edad; 
    double descuento; 
    
    //constructor 

    public Libro(String titulo, String autor, double precio, int ISBN, int edad, double descuento) {
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
        this.ISBN = ISBN;
        this.edad = edad;
        this.descuento = descuento;
    }

    //muestra los datos del libro 
    public void mostrarDatos(){
        System.out.println("Titulo: "+titulo+"\nAutor: "+autor+"\nPrecio: $"+precio+"\nCod. ISBN: "+ISBN);
    }
    
    
    //calcula el desuento que tendra dependiendo la edad 
    public double descuento(int edad,double precio){
    
        if(this.edad>18){
        this.descuento = precio-(precio*0.25); 
        }
        else{
        this.descuento = precio-(precio*0.10);
        
        }
    return this.descuento; //retorna el descuento 
    }
    
    
    public static void main(String [] args){
    
    Scanner entrada = new Scanner(System.in).useDelimiter("\n"); 
    
        //pide la información 
        System.out.println("Ingrese SU edad:  ");
        int edad = entrada.nextInt(); 
        
        System.out.println("Ingrese el nombre del libro: ");
        String titulo = entrada.next(); 
        
        System.out.println("Ingrese el autor del libro: ");
        String autor = entrada.next(); 
        
        System.out.println("Ingrese el precio: ");
        double precio = entrada.nextDouble(); 
        
        System.out.println("Ingrese el codigo ISBN: ");
        int isbn = entrada.nextInt(); 
        
        //crea el objeto 
        Libro libro1 = new Libro(titulo, autor,precio,isbn,edad,0); 
        
        //imprime la informmacion y el descuento 
        System.out.println("--------FACTURA--------\n");
        libro1.mostrarDatos();
        System.out.println("Su total con descuento es de: "+libro1.descuento(edad, precio));
        
        
    
    
    }
}

