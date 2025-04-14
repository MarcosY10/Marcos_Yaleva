/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ejercicios;
import java.util.Scanner;
/**
 *< > [ ]
 * @author Marcos
 */
public class RecetaDeCocina {
    public static void main(String[] args) {
       int num=0, num2=1;
        System.out.println("ingrese el nombre de la receta: ");
        Scanner leer= new Scanner (System.in);
        String receta=leer.next();
        System.out.println("Ingrese el ingrediente: ");
        Scanner ingre= new Scanner (System.in);
        String ingredientes=ingre.next();
        while (num<=1){
        System.out.println("Quieres añadirle mas ingredientes s/n");
        Scanner siono= new Scanner (System.in);
        String decición=siono.next();
            switch (decición) {
                case "s":
                case "S":
                    System.out.print("ingrediente: ");
                Scanner leeringre= new Scanner (System.in);
                String rec=leeringre.next();
                ++num2;
                    break;
                case "n":
                case "N":
                    ++num;
                    if (num2<=3) {
                        System.out.println("La comida es facil de hacer con 10 minutos o menos de preparación");
                    }else if ((num2<=5)  && (num2>3)){
                        System.out.println("La comida es media complicada de hacer con 20 minutos o menos de preparación");
                    } else if ((num2<=7) && (num2>5)){
                        System.out.println("La comida es dificil de hacer con una durancion de 30 minutos o menos");
                    } else if (num2>=8){
                        System.out.println("La comida es complicada y dura mas de 30 minutos"); 
                    }
                    ++num;
                    break;
                default:
                    System.out.println("ERROR");
            }
            }
        System.out.println("El nombre de la receta es: "+receta);
    }
    }
