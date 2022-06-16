package com.company;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int a [], b[], c[];
        a = new int [10];
        b = new int [10];
        c = new int [20];

        //PEDIMOS DATOS DEL ARREGLO A\\

        System.out.println("Digite los datos del primer arreglo: ");
        for (int i = 0; i < 10; i++) {
            System.out.print((i +1)+". Digite su numero: ");
            a [i] = entrada.nextInt();
        }

        //PEDIMOS DATOS DEL ARREGLO B\\

        System.out.println("\nDigite los datos del segundo arreglo: ");
        for (int i = 0; i < 10; i++) {
            System.out.print((i +1)+". Digite su numero: ");
            b[i] = entrada.nextInt();
        }
        // AHORA VAMOS A MEZCLAR LOS 2 ARREGLOS EN EL ARREGLO C\\
        // VAMOS A UTILIZAR EL ITERADOR I PARA A Y B \\
        // Y EL ITERADOR J PARA EL ARREGLO C \\

        int j = 0;
        for (int i = 0; i < 10; i++) {
            c[j] = a[i]; //1°A, 2°A
            j++;
            c[j] = b[i]; //1°B, 2°B
            j++;
        }

        System.out.println("\nEl tercer arreglo es: ");
        for (int i = 0; i < 20; i++) {
            System.out.println(c[i]+ " ");
        }
        System.out.println();
    }
}
