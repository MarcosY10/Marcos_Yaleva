/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Joptionpane;

/**
 *< > [ ]
 * @author Marcos
 */
import javax.swing.JOptionPane;
public class Persona {
    String nombre;
    int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    void esMayorDeEdad(){
        if (edad>=18){
            JOptionPane.showInternalMessageDialog(null, "Es mayor de edad");
        } else {
            JOptionPane.showInternalMessageDialog(null, "Es menor de edad");
        }
    }
}
