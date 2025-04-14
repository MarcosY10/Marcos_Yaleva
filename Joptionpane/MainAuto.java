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
public class MainAuto {
    public static void main(String[] args) {
        Auto auto1 = new Auto("toyota", "ford");
        String marca = JOptionPane.showInputDialog("Ingrese el nombre de la marca");
        String modelo = JOptionPane.showInputDialog("Ingrese el nombre del modelo");
        JOptionPane.showMessageDialog(null, "La marca del autor es "+marca+" yel modelo del auto es "+modelo);
        auto1.arancar();
    }
}
