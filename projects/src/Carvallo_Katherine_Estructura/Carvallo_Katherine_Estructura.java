package Carvallo_Katherine_Estructura;

import java.util.Random;
import java.util.Scanner;

public class Carvallo_Katherine_Estructura {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in).useDelimiter("\n");
        int opcion=0;
        int ejercicio1 =0, ejercicio2 = 0, ejercicio3 = 0, ejercicio4=0; 
        Random random = new Random();
        
        //Menu de opciones de los ejercicios 
        while (opcion != 5) {
        System.out.println("**Menu**");
        System.out.println("1. Palabra Alreves");
        System.out.println("2. Número perfecto");
        System.out.println("3. primos ");
        System.out.println("4. votaciones");
        System.out.println("5. salir ");
        opcion = entrada.nextInt();
        

            //ejercicios 
            switch (opcion) {
                
                //ejercicio 1 
                case 1:
                    //pide la palabra 
                    System.out.println("PALABRA ALREVES");
                    System.out.println("Ingresa una palabra: ");
                    String palabra = entrada.next();
                    
                    //imprime las letras de la ultima a la primera 
                    System.out.print("Palabra alreves: ");
                    for (int i = palabra.length() - 1; i >= 0; i--) {
                        System.out.print(palabra.charAt(i));

                    }
                    //imprime un espacio y contador de cantidad de veces en el programa 
                    System.out.println("\n");
                    ejercicio1++;
                    break;

                case 2:
                    ejercicio2++;
                    break;

                case 3:
                    // asignación de variables 
                    System.out.println("PRIMOS");
                    int naleatorio = random.nextInt(100)+1;
                    int contadorDivisores = 0;
                    String divisores = ""; 

                    //encuentra los divisores 
                    for (int i = 1; i <= naleatorio; i++) {
                    if (naleatorio % i == 0) {
                    contadorDivisores++;
                    divisores += i + " "; 
                     }
                     }
                    
                    //determinar si es primo o no 
                    if (contadorDivisores == 2) {
                    System.out.println("Primo " + naleatorio );
                    } else {
                    System.out.println("No es primo ");
                    }
                   
                    //imprime el resultado 
                    System.out.println("Divisores de " + naleatorio + " son: " + divisores.trim().replace(" ", " y "));
                    ejercicio3++; 
                    break;

                case 4:
                    //variables 
                    System.out.println("VOTACIONES");
                    int votantes; 
                    String planilla; 
                    int AZUL= 0;
                    int ROJO= 0;
                    int NEGRO= 0;
                    int AMARILLO= 0;
                    int usado; 
                   
                    //ingresar la cantidad de veces que se repetira el programa o numero de votantes 
                    System.out.println("Ingresar numero de votantes: ");
                    votantes = entrada.nextInt(); 
                    System.out.println(" ");
                    
                     
                       //ciclo para determinar cual es el más votado  
                    for (int i = 0; i < votantes; i++) {
                     
                        //ingresa las opciones de vottación 
                        System.out.println("Planillas: \nAZUL\nROJO\nNEGRO\nAMARILLO ");
                        System.out.println("Ingrese la planilla por la cual votara: ");
                        planilla = entrada.next().toUpperCase(); 
                        System.out.println("\n");
                        
                        //guarda la cantidad de veces que se utiliza cada uno 
                        if (planilla.equals("AZUL")){
                        AZUL++; 
                        }
                        else{
                        if (planilla.equals("ROJO")){
                        ROJO++; 
                        } 
                        else{
                        if(planilla.equals("NEGRO")){
                        NEGRO++;
                        }
                        else{
                        if(planilla.equals("AMARILLO")){
                        AMARILLO++;
                        }
                        else{ //que no acepte el valores distintos 
                        if(planilla!="ROJO" && planilla!="AZUL" && planilla !="NEGRO" && planilla!= "AMARILLO"){
                            System.out.println("Voto nulo ");
                        }
                        }
                        
                        }
                        }
                        }
                        
                    }
                    //cantidad de veces que se repite el más usado 
                    usado= Math.max(AZUL,Math.max(ROJO, Math.max(NEGRO, AMARILLO)));
                    
                    
                    
                   usado = Math.max(AZUL, Math.max(ROJO, Math.max(NEGRO, AMARILLO)));
                   String planillaGanadora = " ";
                   
                   
                   //determinar cual es partido más botado 
                   if (usado == AZUL) {
                   planillaGanadora = "AZUL";
                   } else if (usado == ROJO) {
                   planillaGanadora = "ROJO";
                   } else if (usado == NEGRO) {
                   planillaGanadora = "NEGRO";
                   } else if (usado == AMARILLO) {
                   planillaGanadora = "AMARILLO";
                   }
                    //imprimir resultado 
                   System.out.println("La planilla ganadora es: "+planillaGanadora+" con "+ usado+ " votos");
                    System.out.println(" ");
                    
                    ejercicio4++; 
                    break; 
                    
                case 5: //salir del programa y calcular cuantas veces se entro al programa 
                    System.out.println("Saliendo...");
                    System.out.println("Has ingresado "+ejercicio1+" veces al ejercicio de palabras alreves");
                    System.out.println("Has ingresado " + ejercicio2+" veces al ejercicio de numero perfecto");
                    System.out.println("Has ingresado "+ejercicio3+" veces al ejercicio de Primos");
                    System.out.println("Has ingresado "+ejercicio4+" veces al ejercicio Votaciones");
                    System.out.println("Adiós, vuelve pronto!!!");
                    
                    break; 

            }//cierra switch de los ejercicios 

        }//cierra while de los ejercicios 

    }  //cierra main 
}//cierra class
