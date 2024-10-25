/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author carlo
 */import java.util.Scanner;
public class welchez_daniel_control {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion = 0;
        double nota=0;
        
        while (opcion !=4){
            System.out.println(" ");
            System.out.println("******MENU******"
           + "\n 1 - CADENA"+
            "\n 2 - NOTAS"+
            "\n 3 - CLASE"+
            "\n 4 - SALIR");
         
         System.out.println("Ingresar el numero de la opcion requerida"); 
          opcion = entrada.nextInt();
          
          if (opcion==0){
              System.out.println("*****CADENA******");
              System.out.println("Ingrese una cadena de texto");
              String cadena=entrada.next();
              
              int longitud=cadena.length();
              int maxRepeat=0;
              char caracterep=' ';
              char caracter=0;
              
              while (caracter<256) {
                  int contador=0;
                  int contadorcaracter=0;
                  
               while (contadorcaracter<longitud) {
                   if (cadena.charAt(contadorcaracter)==caracter) {
                   contador++;
               
               }
                   contadorcaracter++;
               }
               if (contador>maxRepeat) {
                   maxRepeat=contador;
                   caracterep=caracter;
               }
               caracter++;
              }
              
              System.out.println("El caracter que mas veces se repite en la cadena es: "+ caracterep);
              System.out.println("El numero de veces que se repite en la cadena: "+maxRepeat);
              }
          
          else if (opcion==2){
                      System.out.println("********Notas*******");
                      System.out.println("Ingresa la nota que desea solicitar");
                      int cantidadn=entrada.nextInt();
                      int contador=0;
                      double sumarnota=0;
                      double promedio=0;
                      double notamayor=0;
                      double notamenor=100;
                      
                      
                      while (contador++<cantidadn){
                      System.out.println("Nota"+contador+": ");
                      nota=entrada.nextDouble();
                      
                      sumarnota+=nota;
                      
                      }
                      while(nota<=-1  || nota>=101){
                          System.out.println("Nota#"+contador+": ");
                          nota=entrada.nextDouble();
                          
                          while (nota>notamayor)
                          notamayor=nota;
                      }
                      while (nota>notamenor)
                          notamenor=nota;
                      
                      
                      promedio=sumarnota/cantidadn;
                      System.out.println("PROMEDIO: "+String.format("%.2",promedio));
                      System.out.println("NOTA MENOR: "+notamayor);
                      System.out.println("NOTA MAYOR: "+notamenor);
                      }
          
          }
        
                      
                    
            
            
        }
    }
    
}
