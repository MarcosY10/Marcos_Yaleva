/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package condicionales;

/**
 *< > [ ]
 * @author Marcos
 */
public class condicionalesMultileNivel {
    public static void main(String[] args) {
        int n1=18, n2=20, n3=3;
        if (n1>n2 && n1>n3) {
            System.out.println("El numero mayor es: "+n1);
        }else if(n2>n1 && n2>n3){ 
            System.out.println("El numero maor es: "+n2);
        }else {
            System.out.println("El numero mayor es: "+n3);
        }
    }
}
