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
public class Auto {
    String modelo;
    String marca;

    public Auto(String modelo, String marca) {
        this.modelo = modelo;
        this.marca = marca;
    }
    
    void arancar(){
        JOptionPane.showMessageDialog(null, "El auto esta arrancando");
    }
}
