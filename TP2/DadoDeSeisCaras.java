/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package TP2;
import java.util.Scanner;
import java.util.Random;

/**
 *< > [ ]
 * @author Marcos
 */
public class DadoDeSeisCaras {
    public static void main(String[] args) {
        int Num=1;
        Random random =new Random();
        while (Num<2){
            System.out.print("Ingresa 1 para lanzar el dado | ingresa 2 para salir ");
            Scanner num = new Scanner(System.in);
            int num2 = num.nextInt();
            if (num2==1){
            int numero= random.nextInt(6);
            System.out.println(""+(numero+1));
            } else {
                ++Num;
                ++Num;
            }
        }
        }
    }

