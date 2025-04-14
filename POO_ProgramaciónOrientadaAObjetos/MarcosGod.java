/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package POO_ProgramaciónOrientadaAObjetos;

/**
 *< > [ ]
 * @author Marcos
 */
public class MarcosGod {
    String nombre;
    String apellido;
    double altura;
    String amigos;

    public MarcosGod(String nombre, String apellido, double altura, String amigos) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.altura = altura;
        this.amigos = amigos;
    }
    
    void poder(){
        System.out.println(""+nombre +" "+apellido);
        System.out.println("su poder es: infinito");
    }
    void dominios(){
        System.out.println("su dominios es: el universo entero");
    }
}
