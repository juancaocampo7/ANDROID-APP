package com.company;
import java.util.Scanner;
public class Exercise4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int[] arreglo = new int[10]; //CREAMOS ARREGLO DE 10 ELEMENTOS ENTEROS \\
        boolean creciente = false, decreciente = false;

        System.out.println("Llenar el arreglo: ");
        for(int i = 0; i < 10; i++) {
            System.out.println((i + 1)+". Digite un numero: ");
            arreglo[i] = entrada.nextInt();
        }

        for (int i = 0; i < 9; i++) {
            if (arreglo[i] < arreglo[i+1]){ //CRECIENTE: 1-2-3-4-5\\
                creciente = true;
            }
            if (arreglo[i] > arreglo[i+1]) { //DECRECIENTE: 5-4-3-2-1\\
                decreciente = true;
            }
        }

        if (creciente==true && decreciente==false){
            System.out.println("\nEl arreglo está de forma creciente");
        }
        else if (creciente==false && decreciente==true){
            System.out.println("\nEl arreglo está de forma decreciente");
        }
        else if (creciente==true && decreciente==true){
            System.out.println("\nEl arreglo está desordenado");
        }
        else if (creciente==false && decreciente==false){
            System.out.println("\nEl arreglo está con todos los numeros iguales");
        }
    }
}
