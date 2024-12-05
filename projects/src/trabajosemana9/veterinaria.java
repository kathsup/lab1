
package trabajosemana9;

import java.util.Scanner;

public class veterinaria {
    //veterinaria 
    //clase por raaza 
    //atencion medica, baño, cobrar, precios, separado por raza 
    
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Menu Principal");
            System.out.println("1. Ingresar mascota");
            System.out.println("2. Salir");
            System.out.print("Ingrese su opcion: ");
            opcion = entrada.nextInt();
            
            System.out.println("\n");

            switch (opcion) {
                case 1:
                    mostrarMenuMascotas(entrada);
                    break;
                case 2:
                    System.out.println("Cerrando sistema...");
                    mostrarResumen();
                    break;
                default:
                    System.out.println("Opcion no valida. Intente de nuevo.");
            }
        } while (opcion != 2);

        entrada.close();
    }

    public static void mostrarMenuMascotas(Scanner entrada) {
        System.out.println("Seleccione el tipo de mascota:");
        System.out.println("1. Perro");
        System.out.println("2. Gato");
        System.out.println("3. Conejo");
        System.out.print("Ingrese su opcion: ");
        int tipoMascota = entrada.nextInt();

        switch (tipoMascota) {
            case 1:
                Perro.MostrarMenuServicios(entrada);
                break;
            case 2:
                Gato.MostrarMenuServicios(entrada);
                break;
            case 3:
                conejo.MostrarMenuServicios(entrada);
                break;
            default:
                System.out.println("Tipo de mascota no valido.");
        }
    }

    public static void mostrarResumen() {
        System.out.println("\n");

        System.out.println("Resumen del dia:");
        System.out.println("\n");
        System.out.println("Total de animales atendidos: " + 
        (Perro.totalAtendidos + Gato.totalAtendidos + conejo.totalAtendidos));
        System.out.println("\n");
        System.out.println("Servicios realizados por tipo:");
        System.out.println("Bano: " + (Perro.banos + Gato.banos + conejo.banos));
        System.out.println("Grooming: " + (Perro.grooming + Gato.grooming + conejo.grooming));
        System.out.println("Servicio Medico: " + (Perro.serviciosMedicos + Gato.serviciosMedicos + conejo.serviciosMedicos));
    }
}
    
    
    
    
    
    
    
    
    
    
    
    



