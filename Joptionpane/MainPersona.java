/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Joptionpane;
import javax.swing.JOptionPane;
/**
 *< > [ ]
 * @author Marcos
 */
public class MainPersona {
    public static void main(String[] args) {
        String nombre = JOptionPane.showInputDialog("El nombre es:");
        String edad = JOptionPane.showInputDialog("su edad es:");
        int edad1 = Integer.parseInt(edad);
        Persona p1 = new Persona("marcos", edad1);
        JOptionPane.showInternalMessageDialog(null, "su nombre es "+nombre+" su edaad es "+edad1);
        p1.esMayorDeEdad();
    }
}
