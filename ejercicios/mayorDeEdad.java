/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ejercicios;

/**
 *< > [ ]
 * @author Marcos
 */
import java.util.Scanner;

public class mayorDeEdad {
    public static void main(String[] args) {
        int edad;
       Scanner leeredad = new Scanner(System.in);
       edad=leeredad.nextInt();
       if (edad>=16){
           System.out.println("Tienes permitido conducir.");
       } else {
           System.out.println("No tienes permitido conducir.");
       }
    }
}
