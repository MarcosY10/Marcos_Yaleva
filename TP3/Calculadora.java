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
public class Calculadora {
        public double suma (double operador1, double operador2){
            return operador1+operador2;
    }
        
        public double resta (double operador1, double operador2){
            return operador1-operador2;
    }
        
        public double multimplicación (double operador1, double operador2){
            return operador1*operador2;
    }
        
        public double división (double operador1, double operador2){
            if (operador2!=0){
                return operador2/operador2;
            } else {
                JOptionPane.showMessageDialog(null, "No se puede dividir entre 0");
                return 0;
            }
        }

        double operador1;
        double operador2;

    public Calculadora(double operador1, double operador2) {
        this.operador1 = operador1;
        this.operador2 = operador2;
    }
        
}
