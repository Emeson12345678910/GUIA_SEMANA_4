/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3_emersonelimendozalemus_seamana4;

/**
 *
 * @author MINEDUCYT
 */
import java.util.Scanner;

public class Ejercicio3_EmersonEliMendozaLemus_Seamana4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int opcion;
        double num1, num2, resultado;

        do {
            System.out.println("Seleccione la operación (1 = suma"
                    + " 2= resta"
                    + " 3= division"
                    + " 4= multiplicacion "
                    + ") o 0 para salir:");
            opcion = scanner.nextInt();

            if (opcion >= 1 && opcion <= 4) {
                System.out.print("Ingrese el primer número: ");
                num1 = scanner.nextDouble();
                System.out.print("Ingrese el segundo número: ");
                num2 = scanner.nextDouble();

                switch (opcion) {
                    case 1: resultado = num1 + num2; break;
                    case 2: resultado = num1 - num2; break;
                    case 3: resultado = num1 * num2; break;
                    case 4: resultado = (num2 != 0) ? num1 / num2 : 0;
                            if (num2 == 0) System.out.println("Error: No se puede dividir por cero.");
                            break;
                    default: resultado = 0;
                }

                if (opcion >= 1 && opcion <= 4) {
                    System.out.println("Resultado: " + resultado);
                }

            } else if (opcion != 0) {
                System.out.println("Opción no válida. Intente de nuevo.");
            }

        } while (opcion != 0);

        System.out.println("Gracias por usar mi codigo :3.");

        scanner.close();
    }
}
