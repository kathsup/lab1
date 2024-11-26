
package pruebasemana8;

import java.util.Scanner;

public class restaurante {
    
  public static void main (String[] args){
  Scanner entrada = new Scanner(System.in);
      System.out.println("----Restaurante----");
      System.out.println("Ingrese el día");
      String dia =entrada.nextLine().toLowerCase(); 
      double total=0; 
      
      
      switch (dia){
      
          case "lunes" -> { 
              System.out.println("Precios día lunes");
              System.out.println("1. economica lps.150");
              System.out.println("2. regular lps.200");
              System.out.println("3. premium lps. 300");
              int comida = entrada.nextInt(); 
              
              if (comida==1){
                  total=comida+150;
              }
              if (comida==2){
                  total=comida+200;
              }
              if (comida==3){
                  total=comida+300;
              }
              
              System.out.println("Agregue un adicional: ");
              System.out.println("1. queso Lps. 5");
              System.out.println("2. salsa Lps. 8");
              System.out.println("3. ninguno Lps. 0 ");
              System.out.print("Ingrese su opcion: ");
              int opcion = entrada.nextInt();
              
              if (opcion == 1) {
                  total += 5;
              }
              if (opcion == 2) {
                  total += 8;
              }
              if (opcion == 3) {
                  total += 0;
              }
              System.out.println("El total es: "+total);
          }
              
          case "martes" -> { 
              System.out.println("Precios día martes");
              System.out.println("1. economiaca lps.100");
              System.out.println("2. regular lps.250");
              System.out.println("3. premium lps. 400");
              int comida = entrada.nextInt();
              if (comida==1){
                  total=comida+100;
              }
              if (comida==2){
                  total=comida+250;
              }
              if (comida==3){
                  total=comida+400;
              }
              System.out.println("Agregue un adicional: ");
              System.out.println("1. queso Lps. 10");
              System.out.println("2. salsa Lps. 8");
              System.out.println("3. ninguno Lps. 0 ");
              System.out.print("Ingrese su opcion: ");
              int opcion = entrada.nextInt();
              if (opcion == 1) {
                  total += 5;
              }
              if (opcion == 2) {
                  total += 8;
              }
              if (opcion == 3) {
                  total += 0;
              }
              System.out.println("El total es: "+total);
          }
      
              case "miercoles" -> {
                  System.out.println("Precios día miercoles");
                  System.out.println("1. economiaca lps.50");
                  System.out.println("2. regular lps.150");
                  System.out.println("3. premium lps. 200");
              int comida = entrada.nextInt();
              if (comida==1){
                  total=comida+50;
              }
              if (comida==2){
                  total=comida+150;
              }
              if (comida==3){
                  total=comida+200;
              }
              System.out.println("Agregue un adicional: ");
              System.out.println("1. queso Lps. 11");
              System.out.println("2. salsa Lps. 5");
              System.out.println("3. ninguno Lps. 0 ");
              System.out.print("Ingrese su opcion: ");
              int opcion = entrada.nextInt();
              if (opcion == 1) {
                  total += 11;
              }
              if (opcion == 2) {
                  total += 5;
              }
              if (opcion == 3) {
                  total += 0;
              }
              System.out.println("El total es: "+total);
          } 
              
              case "jueves" -> {
                  System.out.println("Precios día jueves");
                  System.out.println("1. economiaca lps.80");
                  System.out.println("2. regular lps.100");
                  System.out.println("3. premium lps. 150");
              int comida = entrada.nextInt();
              if (comida==1){
                  total=comida+80;
              }
              if (comida==2){
                  total=comida+100;
              }
              if (comida==3){
                  total=comida+150;
              }
              System.out.println("Agregue un adicional: ");
              System.out.println("1. queso Lps. 12");
              System.out.println("2. salsa Lps. 3");
              System.out.println("3. ninguno Lps. 0 ");
              System.out.print("Ingrese su opcion: ");
              int opcion = entrada.nextInt();
              if (opcion == 1) {
                  total += 12;
              }
              if (opcion == 2) {
                  total += 3;
              }
              if (opcion == 3) {
                  total += 0;
              }
              System.out.println("El total es: "+total);
          }
              
              case "viernes" -> {
                  System.out.println("Precios día viernes");
                  System.out.println("1. economiaca lps.250");
                  System.out.println("2. regular lps.350");
                  System.out.println("3. premium lps. 500");
              int comida = entrada.nextInt();
              if (comida==1){
                  total=comida+250;
              }
              if (comida==2){
                  total=comida+350;
              }
              if (comida==3){
                  total=comida+500;
              }
              System.out.println("Agregue un adicional: ");
              System.out.println("1. queso Lps. 20");
              System.out.println("2. salsa Lps. 30");
              System.out.println("3. ninguno Lps. 0 ");
              System.out.print("Ingrese su opcion: ");
              int opcion = entrada.nextInt();
              if (opcion == 1) {
                  total += 20;
              }
              if (opcion == 2) {
                  total += 30;
              }
              if (opcion == 3) {
                  total += 0;
              }
              System.out.println("El total es: "+total);
          } 
              
              case "sabado" -> {
                  System.out.println("Precios día sabado");
                  System.out.println("1. economiaca lps.100");
                  System.out.println("2. regular lps.280");
                  System.out.println("3. premium lps. 300");
              int comida = entrada.nextInt();
              if (comida==1){
                  total=comida+100;
              }
              if (comida==2){
                  total=comida+280;
              }
              if (comida==3){
                  total=comida+300;
              }
              System.out.println("Agregue un adicional: ");
              System.out.println("1. queso Lps. 11");
              System.out.println("2. salsa Lps. 22");
              System.out.println("3. ninguno Lps. 0 ");
              System.out.print("Ingrese su opcion: ");
              int opcion = entrada.nextInt();
              if (opcion == 1) {
                  total += 11;
              }
              if (opcion == 2) {
                  total += 22;
              }
              if (opcion == 3) {
                  total += 0;
              }
              System.out.println("El total es: "+total);
          } 
              
              case "domingo" -> {
                  System.out.println("Precios día domingo");
                  System.out.println("1. economiaca lps.50");
                  System.out.println("2. regular lps.100");
                  System.out.println("3. premium lps. 150");
              int comida = entrada.nextInt();
              if (comida==1){
                  total=comida+50;
              }
              if (comida==2){
                  total=comida+100;
              }
              if (comida==3){
                  total=comida+150;
              }
              System.out.println("Agregue un adicional: ");
              System.out.println("1. queso Lps. 2");
              System.out.println("2. salsa Lps. 3");
              System.out.println("3. ninguno Lps. 0 ");
              System.out.print("Ingrese su opcion: ");
              int opcion = entrada.nextInt();
              if (opcion == 1) {
                  total += 2;
              }
              if (opcion == 2) {
                  total += 3;
              }
              if (opcion == 3) {
                  total += 0;
              }
              
              System.out.println("El total es: "+total);
              
             
          } 
              
           
            default ->{
                System.out.println("Opcion invalida vuelva a intentarlo. ");
            }
          
}
      
      
  
  }
    
}
