/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package TP3;
import javax.swing.JOptionPane;
/**
 *< > [ ]
 * @author Marcos
 */
public class MainCalculadora {
    public static void main(String[] args) {
        String opción = JOptionPane.showInputDialog(null, "1. sumar \n 2. resta \n 3. multiplicación \n 4. división");
        String nume = JOptionPane.showInputDialog(null, "Ingrese el primer numero");
        String nume2 = JOptionPane.showInputDialog(null, "Ingrese el segundo numero");
        double num = Integer.parseInt(nume);
        double num2 = Integer.parseInt(nume2);
        Calculadora op1 = new Calculadora(num, num2);
        double resul;
        switch (opción) {
            case "1":
                resul=op1.suma(num, num2);
                JOptionPane.showMessageDialog(null, "la suma es "+resul);
                break;
                case "2":
                resul=op1.resta(num, num2);
                JOptionPane.showMessageDialog(null, "la resta es "+resul);
                break;
                case "3":
                resul=op1.multimplicación(num, num2);
                JOptionPane.showMessageDialog(null, "la multiplicación es "+resul);
                break;
                case "4":
                resul=op1.división(num, num2);
                JOptionPane.showMessageDialog(null, "la división es "+resul);
                break;
            default:
                JOptionPane.showMessageDialog(null, "ERROR");
        }
        
    }
}