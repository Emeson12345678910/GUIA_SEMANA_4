/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2_emersonelimendozalemus_semana4;

/**
 *
 * @author MINEDUCYT
 */
import java.util.Scanner;

import java.util.Scanner;

public class Ejercicio2_EmersonEliMendozaLemus_Semana4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero;

        do {
            System.out.print("Ingrese un número: ");
            numero = scanner.nextInt();

            if (numero > 50) {
                System.out.println("Advertencia: El número ingresado es mayor que 50. ingrese un numero menor o = a 50 porfavor.");
            } else {
                System.out.println("El número ingresado es " + (numero % 2 == 0 ? "par." : "impar."));
            }

        } while (numero > 50);

        scanner.close();
    }
}
