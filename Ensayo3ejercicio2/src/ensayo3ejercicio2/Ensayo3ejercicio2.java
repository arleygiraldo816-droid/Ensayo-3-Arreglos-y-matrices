/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ensayo3ejercicio2;

/**
 *
 * @author Arley Giraldo
 */
import java.util.Scanner;
public class Ensayo3ejercicio2 {
public static void main(String[] args) {
Scanner teclado = new Scanner (System.in);
double[] numero = new double[10];
double suma = 0;
System.out.println("Ingrese 10 numeros");
for(int i = 0; i<= 9; i++) {
    System.out.println("Ingrese el numero" + (i+1) + ":");
    numero[i] = teclado.nextDouble();
    suma = suma + numero[i];
}
double promedio = suma/10;
System.out.println("La suma es:" + suma);
System.out.println("LAdivision es" + promedio);
    }
    
}
