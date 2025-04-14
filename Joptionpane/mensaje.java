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
public class mensaje {
    public static void main(String[] args) {
        int respuesta = JOptionPane.showConfirmDialog(null, "¿Desea continuar?");
        String nombre = JOptionPane.showInputDialog("Ingrese su nombre:");
        JOptionPane.showMessageDialog(null, "¡Hola "+ nombre);
    }
}

