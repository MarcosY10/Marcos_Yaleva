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
public class AdivinanzaNumerica {
    int num10=0;
    int num1=1;
    int numeroSecreto;
    int intentos;
    public AdivinanzaNumerica(int numeroSecreto, int intentos) {
        this.numeroSecreto = numeroSecreto;
        this.intentos = intentos;
    }
    
    void Jugar(){
            for (int i = 1; i <= 3; i++) {
            String num = JOptionPane.showInputDialog("Tienes "+(num1++)+" intentos de 3 \nAdivina el numero entre el 1 y el 10");
            int num2 = Integer.parseInt(num);
            ++num10;
            if ((numeroSecreto+1)<num2){
                JOptionPane.showMessageDialog(null, "muy alto");
            } else if (num2<(numeroSecreto+1)){
                JOptionPane.showMessageDialog(null, "muy bajo");
            } else if ((numeroSecreto+1)==num2){
                JOptionPane.showMessageDialog(null, "Correcto! Lo lograste en "+num10+" intentos");
                break;
            }
            --intentos;
        }
        
        if (intentos==0){
            JOptionPane.showMessageDialog(null, "¡Se acabo los intentos! El numero era: "+(numeroSecreto+1));
        }
    }
}
