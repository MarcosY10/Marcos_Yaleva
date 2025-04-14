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
public class GustosHelados {
    public static void main(String[] args) {
        String gustos;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el gusto");
        gustos=leer.next().toLowerCase();
        if (gustos.equals("chocolate") || gustos.equals("vainilla") || gustos.equals("frutilla") || gustos.equals("dulce de leche")){
            System.out.println("Si, hay "+gustos);
        } else {
            System.out.println("No, hay "+gustos);
        }
    }
}
