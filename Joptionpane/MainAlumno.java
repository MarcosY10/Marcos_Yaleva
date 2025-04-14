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
public class MainAlumno {
    public static void main(String[] args) {
        String nombre = JOptionPane.showInputDialog("Ingrese su nombre:");
        String nota = JOptionPane.showInputDialog("Ingrese su nota:");
        int num = Integer.parseInt(nota);
        Alumno alu = new Alumno("marcos", num);
        JOptionPane.showMessageDialog(null, "El nombre es "+nombre+" su nota es "+nota);
        alu.aprobar();
    }
    
}
