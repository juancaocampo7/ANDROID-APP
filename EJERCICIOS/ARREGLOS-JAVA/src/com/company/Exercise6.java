package com.company;
import java.util.Scanner;
public class Exercise6 {
    //LEER 5 ELEMENTOS NUMERICOS QUE SE INTRODUCIRAN ORDENADOS DE FORMA CRECIENTE, ESTOS LOS GUARDAREMOS EN UNA
    // TABLA LLAMADO 10. LEER UN NUMERO N, E INSERTARLO EN EL LUGAR ADECUADO PARA QUE LA TABLA CONTINUE ORDENADA\\

    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
        int[] arreglo = new int [10];
        boolean creciente = true;
        int numero, sitio_num=0, j=0;

        System.out.println("Llenar el arreglo");
        do {
            //LLENANDO EL ARREGLO//
            for (int i = 0; i < 5; i++) {
                System.out.print((i+1)+". Digite un numero: ");
                arreglo [i] = entrada.nextInt();
            }

            //COMPROBAR SI EL ARREGLO ESTÁ ORDENADO EN FORMA CRECIENTE//
            for (int i = 0; i < 5; i++) {
                if (arreglo [i] < arreglo[i+1])
                {
                    creciente = true;
                }
                if (arreglo [i] > arreglo [i+1])
                {
                    creciente = false;
                    break;
                }
            }
            if (creciente == false){
                System.out.println("\n El arreglo no está ordenado en forma creciente." +
                        "Vuelva a digitar.");
            }
        }while (creciente == false);

        System.out.print("\nDigite un elemento a insertar: ");
        numero = entrada.nextInt();

        //ESTO ES PARA DARNOS CUENTA EN QUE POSICION VA EL NUMERO//
        while (arreglo [j]<numero && j<5){
            sitio_num++;
            j++;
            
            //TRASLADAR UNA POSICION EN EL ARREGLO A LOS ELEMENTOS QUE VAN DETRÁS DE NUMERO//
            for (int i = 4; i >= sitio_num; i--) {
                arreglo[i+1] = arreglo[i];
            }

            //INSERTAMOS EL NUMERO QUE EL USUARIO PUSO//
            arreglo [sitio_num]= numero;

            System.out.println("\nEl arreglo queda de la siguiente manera:   ");
            for (int i = 0; i < 6; i++) {
                System.out.println(arreglo[i]+"   ");
            }
            System.out.println();
        }
    }
}