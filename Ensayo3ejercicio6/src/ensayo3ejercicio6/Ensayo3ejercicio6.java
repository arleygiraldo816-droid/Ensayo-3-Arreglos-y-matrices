/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ensayo3ejercicio6;

/**
 *
 * @author Arley Giraldo
 */
import java.util.Scanner;
public class Ensayo3ejercicio6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int[][] matriz = new int[3][4];   
        System.out.println("Ingrese los numeros: ");
        for (int i = 0; i <= 2; i++){
            for(int j = 0; j <= 3; j++){
                matriz[i][j] = teclado.nextInt();
            }
        }
        for (int i = 0; i <= 2; i++){
            for(int j = 0; j <= 3; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}