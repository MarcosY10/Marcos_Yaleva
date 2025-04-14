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
public class Alumno {
    String nombre;
    int nota;
    public Alumno(String nombre, int nota) {
        this.nombre = nombre;
        this.nota = nota;
    }
    void aprobar(){
        if (nota>=6){
            JOptionPane.showInternalMessageDialog(null, "Esta aprobado");
        } else {
            JOptionPane.showInternalMessageDialog(null, "Esta reprobado");
        }
    }
}
