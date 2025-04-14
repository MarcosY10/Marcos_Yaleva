/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package POO_ProgramaciónOrientadaAObjetos;

/**
 *< > [ ]
 * @author Marcos
 */
public class PERRO {
    String nombre;
    String raza;

    public PERRO(String nombre, String raza) {
        this.nombre = nombre;
        this.raza = raza;
    }
    
    void ladrar(){
        System.out.print(""+nombre);
        System.out.println(" miau, miau, digo Guau, Guau");
    }
}
