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
//import java.util.Scanner;
public class ParseoDeTextoANumIngresado {
    public static void main(String[] args) {
        System.out.println("Ingrese el numero");
      Scanner leer= new Scanner(System.in);
      String num= leer.next();
      int num2= Integer.parseInt(num);
      System.out.println("Ingrese el segundo numero");
      Scanner leer2= new Scanner(System.in);
      String num3= leer2.next();
      int num5= Integer.parseInt(num3);
        System.out.println(""+(num2+num5));
    }
}
