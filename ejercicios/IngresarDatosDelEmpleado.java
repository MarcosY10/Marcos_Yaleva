/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ejercicios;

import java.util.Scanner;

/**
 *< > [ ]
 * @author Marcos
 */
public class IngresarDatosDelEmpleado {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Scanner leeredad = new Scanner(System.in);
        Scanner leersalario = new Scanner(System.in);
        
        System.out.print("Ingrese el nombre: ");
        String nombre = leer.next();
        System.out.print("Ingrese la edad: ");
        int edad= leeredad.nextInt();
        System.out.print("Ingrese el salario: ");
        int salario=leersalario.nextInt();
        
        System.out.println("Ingrese el nombre: "+nombre);
        System.out.println("La edad es: "+edad);
        System.out.println("El salario es: "+salario);
    }
}
