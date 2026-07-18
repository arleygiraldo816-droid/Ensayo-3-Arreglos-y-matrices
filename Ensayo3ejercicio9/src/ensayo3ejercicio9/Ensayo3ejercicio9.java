/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ensayo3ejercicio9;

/**
 *
 * @author Arley Giraldo
 */
import java.util.Scanner;
public class Ensayo3ejercicio9 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int[][] matriz = new int[5][5];   
        int suma = 0;
        int numMayor = 0;
        int numMenor = 0;
          
        System.out.println("Ingrese los numeros: ");
        for (int i = 0; i <= 4; i++){
            for(int j = 0; j <= 4; j++){
                matriz[i][j] = teclado.nextInt();
                suma = suma + matriz[i][j];
            }
        }
        numMayor = matriz[0][0];
        numMenor = matriz[0][0];
        for (int i = 0; i <= 4; i++){
            for(int j = 0; j <= 4; j++){
            if(matriz[i][j] > numMayor){
                numMayor = matriz[i][j];
            }
            if (matriz[i][j] < numMenor){
                numMenor = matriz[i][j];
            }
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("EL numero mayor es: " + numMayor);
        System.out.println("EL numero menor es: " + numMenor);
    }
}