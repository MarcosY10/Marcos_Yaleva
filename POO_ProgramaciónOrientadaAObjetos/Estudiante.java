/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package POO_ProgramaciónOrientadaAObjetos;

import javax.swing.JOptionPane;

/**
 *< > [ ]
 * @author Marcos
 */
public class Estudiante {
        String nombre;
        int edad;
        double nivelFacha;
        double altura;
        String colorPelo;

    public Estudiante(String nombre, int edad, double nivelFacha, double altura, String colorPelo) {
        this.nombre = nombre;
        this.edad = edad;
        this.nivelFacha = nivelFacha;
        this.altura = altura;
        this.colorPelo = colorPelo;
    }

    void estudiar(){
        System.out.println("Esta estudiando");
    }
        void redir() {
        System.out.println("Esta rindiendo");
    }
        void horalibre(){
        JOptionPane.showInternalMessageDialog(null, nombre+" Esta en hora libre");
        
    }
        
}
class main{
    public static void main(String[] args) {
    Estudiante estudiante1 = new Estudiante("marcos", 17, 1000, 1.70, "negro");
    estudiante1.horalibre();
    
    }
}