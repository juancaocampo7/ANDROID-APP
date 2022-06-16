package com.company;

import java.util.Scanner;

/*EJERCICIO 1: Leer 5 números, guardarlos en un
arreglo y mostrarlos en el mismo orden introducido*/

public class Exercise1 {

    public static void main(String[] args){

        Scanner Scanner = new Scanner(System.in);
        float [] numeros = new float[5];

        System.out.println("Guardando los datos en el arreglo");
        for (int i = 0; i < 5; i++) {
            System.out.print((i + 1)+ " Digite un número: ");
            numeros [i] = Scanner.nextFloat();
        }

        System.out.println("\nImprimir los elementos del arreglo");
        for (float i:numeros) {
            System.out.println(i);
        }

    }
}
