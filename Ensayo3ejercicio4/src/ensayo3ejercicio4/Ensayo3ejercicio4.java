/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ensayo3ejercicio4;

/**
 *
 * @author Arley Giraldo
 */
import java.util.Scanner;
public class Ensayo3ejercicio4 {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int[] numero = new int[20];
    int sumaPar = 0;
    int cantidadPar = 0;
    int sumaImpar = 0;
    int cantidadImpar = 0;
    
    for(int i = 0; i <=19; i++){
       System.out.println("Ingrese los numeros" + (i+1) + ":");
       numero[i] = teclado.nextInt();
    }
      for (int i = 0 ; i <=19; i++){
        if (numero[i] % 2 == 0){
           cantidadPar++;
           sumaPar = sumaPar + numero[i];
        } else {
           cantidadImpar++;
           sumaImpar = sumaImpar + numero[i];
        }
      }
    System.out.println("Cantidad de numeros pares: " + cantidadPar);
    System.out.println("Cantidad de numeros impares: " + cantidadImpar);
    System.out.println("Suma de pares: " + sumaPar);
    System.out.println("Suma de pares: " + sumaImpar);
    }
    
}
