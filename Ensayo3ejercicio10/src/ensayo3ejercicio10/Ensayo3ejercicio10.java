/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ensayo3ejercicio10;

/**
 *
 * @author Arley Giraldo
 */
import java.util.Scanner;

public class Ensayo3ejercicio10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[][] matriz = new int[3][5];
        System.out.println("Ingrese los numeros:");

        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 4; j++) {
                int numero = teclado.nextInt();
                matriz[i][j] = numero + (i * j);
            }
        }
        System.out.println("El resultado es:");
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 4; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
