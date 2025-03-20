/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package condicionales;
import java.util.Scanner;

/**
 *< > [ ]
 * @author Marcos
 */
public class condicionSwitch {
    public static void main(String[] args) {
        int num1=20, num2=5;
        System.out.println("");
        Scanner leer = new Scanner (System.in);
        String sim = leer.nextLine();
       switch (sim) {
            case ("+"):
                System.out.println("la suma es: "+(num1+num2));
                break;
            case "-":
                System.out.println("la resta es: "+(num1-num2));
                break;
            case "*":
                System.out.println("la multiplicacion es: "+(num1*num2));
                break;
            case "/":
                System.out.println("la divición es: "+(num1/num2));
                break;
            default:
                System.out.println("Opción no válida.");
        }

        System.out.println("Fin del programa.");
    }
}
