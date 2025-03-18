/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MisPrimerosPasosDeJava;

/**
 *
 * @author Marcos
 */
public class ingresar_tu_edad {
    public static void main (String[] args) {
        Scanner sc = new Scanner (source: System.in);
        System.out.print(s: "ingrese tu edad");
        int edad=sc.newInt();
        System.out.println("Tu edad es: "+edad);
    }
}
