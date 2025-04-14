/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package TP3;
import java.util.Random;
/**
 *< > [ ]
 * @author Marcos
 */
public class MainAdvinanzaNumerica {
    public static void main(String[] args) {
        Random random =new Random();
        int numero= random.nextInt(10);
        AdivinanzaNumerica ad = new AdivinanzaNumerica(numero, 3);
        ad.Jugar();
    }
}
