/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ensayo3ejercicio7;

/**
 *
 * @author Arley Giraldo
 */
import java.util.Scanner;
public class Ensayo3ejercicio7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int[][] matriz = new int[4][4];   
        int suma = 0;
        System.out.println("Ingrese los numeros: ");
        for (int i = 0; i <= 3; i++){
            for(int j = 0; j <= 3; j++){
                matriz[i][j] = teclado.nextInt();
                suma = suma + matriz[i][j];
            }
        }
        for (int i = 0; i <= 3; i++){
            for(int j = 0; j <= 3; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("La suma es: " + suma);
    }
}
