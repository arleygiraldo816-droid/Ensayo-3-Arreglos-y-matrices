/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ensayo3ejercicio5;

/**
 *
 * @author Arley Giraldo
 */
import java.util.Scanner;
public class Ensayo3ejercicio5 {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int[] numero = new int[12];
    for (int i = 0; i<= 11; i++){
    System.out.println("Ingrese los numeros" + i + ":");
    int numeroIngresado = teclado.nextInt();
    numero[i] = numeroIngresado + i;
    }
    for (int i = 0; i<=11; i++){
    System.out.println("Posicion: " + i + ":" + numero[i]);
    }
    }
    
}
