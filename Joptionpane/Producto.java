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
public class Producto {
    String nombre;
    int precio;

    public Producto(String nombre, int precio) {
        this.nombre = nombre;
        this.precio = precio;
    }
    
    void esCaro(){
        if (precio>=10000){
            JOptionPane.showInternalMessageDialog(null, "Esta caro");
        } else {
            JOptionPane.showInternalMessageDialog(null, "no es caro");
        }
    }
}
