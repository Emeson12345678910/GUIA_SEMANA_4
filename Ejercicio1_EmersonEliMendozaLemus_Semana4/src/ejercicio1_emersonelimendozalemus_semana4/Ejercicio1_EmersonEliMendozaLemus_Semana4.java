/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1_emersonelimendozalemus_semana4;

/**
 *
 * @author MINEDUCYT
 */
import java.util.Scanner;

public class Ejercicio1_EmersonEliMendozaLemus_Semana4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese  el año: ");
        int year = scanner.nextInt();

        boolean esBisiesto = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        System.out.println(year + (esBisiesto ? " es" : " no es") + " Año  bisiesto.");

        scanner.close();
    }
}
