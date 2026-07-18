/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ensayo3ejercicio1;

/**
 *
 * @author Arley Giraldo
 */

import java.util.Scanner;
public class Ensayo3ejercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] numero = new int[10];

        for (int i = 0; i < numero.length; i++) {
            System.out.print("Ingrese un numero " + i + ": ");
            numero[i] = teclado.nextInt();
        }

        System.out.println("\nLos numeros son: ");
        for (int i = 0; i < numero.length; i++) {
            System.out.println("Posicion: " + i + ": " + numero[i]);
        }
        
        teclado.close();
    }
}