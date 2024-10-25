/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daniel_welchez_variables;

import java.util.Scanner;

/**
 *
 * @author carlo
 */
public class welchez_daniel_variables {
    public static void main(String [] args) {
        Scanner entrada = new Scanner(System.in);
        String nombre;
        int horasm;
        double tarifa;
        
        System.out.println("Ingrese el nombre de empleado");
        nombre=entrada.nextLine();
        
        System.out.println("Ingrese la cantidad de horas trabajadas");
        horasm=entrada.nextInt();
        
        System.out.println("Ingrese la tarifa por hora");
        tarifa=entrada.nextInt();
        
        double salario=(horasm*tarifa);
        
        System.out.println("------Planilla de empleado------"+
                "\n Nombre del empleado: "+nombre+
                "\n Horas trabajadas: "+horasm+
                "\n Tarifa por hora: "+tarifa+
                "\n Salario del emplead: "+salario);
                
                
                
        
        
        
        
    }
            
}
