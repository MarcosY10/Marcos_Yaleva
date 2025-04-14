/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package TP2;
import java.util.Scanner;
/**
 *< > [ ]
 * @author Marcos
 */
public class PaseoDeTextoANumeroIgualdad {
    public static void main(String[] args) {
        System.out.println("Ingrese un numero");
        Scanner leer = new Scanner(System.in);
        String numb = leer.next();
        System.out.println("Ingrese el segundo numero");
        Scanner leer2 = new Scanner (System.in);
        String numb2 = leer2.next();
        
        int num = Integer.parseInt(numb);
        int num2 = Integer.parseInt(numb2);
        
        if (num==num2){
            System.out.println("Los numero son iguale");
        } else {
            System.out.println("Los numeros no son iguales");
        }
    }
}
