/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ensayo3ejercicio3;

/**
 *
 * @author Arley Giraldo
 */
import java.util.Scanner;
public class Ensayo3ejercicio3 {
    public static void main(String[] args) {
    Scanner teclado = new Scanner (System.in);
    int[] numero = new int[15];
    int mayor = numero[0];
    int posicionMayor = 0;
    int menor = numero[0];
    int posicionMenor = 0;
    for(int i = 0; i <= 14; i++){
      System.out.println("Ingrese el numero" + (i+1) + ":");
      numero[i] = teclado.nextInt();
    }
    for(int i = 1; i <= 14; i++){
        if(numero[i] > mayor){
            mayor = numero[i];
            posicionMayor = i;
        }
        if(numero[i] < menor){
            menor = numero[i];
            posicionMenor = i;
   
    }  
    }
    System.out.println("Numero mayor" + mayor + "Se encuentra en la posicion" + posicionMayor + ":");
      System.out.println("Numero menor" + mayor + "Se encuentra en la posicion" + posicionMenor + ":");
   } 
}
