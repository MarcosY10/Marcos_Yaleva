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
public class MainProducto {
    public static void main(String[] args) {
        String nombre = JOptionPane.showInputDialog("Nombre del producto");
        String precio = JOptionPane.showInputDialog("su precio es: ");
        int pre= Integer.parseInt(precio);
        Producto p1 = new Producto("coca", pre);
        JOptionPane.showInternalMessageDialog(null, "El producto es "+nombre+" y su precio es "+pre);
        p1.esCaro();
    }
}
