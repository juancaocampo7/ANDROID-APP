package com.company;
import java.util.Scanner;
public class Exercise7 {
    //LEER 10 ENTEROS EN UNA TABLA, GUARDAR EN OTRA TABLA LOS ELEMENTOS
    // PARES DE LA PRIMERA, Y A CONTINUACION LOS ELEMENTOS IMPARES//
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int arreglo [] = new int [10]; //ARREGLO CON 10 ELEMENTOS ENTEROS//
        int conteo_par=0, conteo_impar=0;


        System.out.println("Llenar el arreglo: ");
        for (int i = 0; i < 10; i++) {
            System.out.println((i+1)+". Digite un numero: ");
            arreglo[i] = entrada.nextInt();


            if(arreglo[i] % 2==0){ //SI EL NUMERO ES PAR//
                conteo_par++;
            }
            else { //SI EL NUMERO ES IMPAR
                conteo_impar++;
            }
        }
        //CREAR LOS ARREGLOS SIGUIENTES
        int par[] = new int [conteo_par]; //ARREGLO PARA ALMACENAR PARES//
        int impar[] = new int[conteo_impar]; //ARREGLO PARA ALMACENAR IMPARES//


        conteo_par = 0;
        conteo_impar = 0;
        //ALMACENAMOS LOS NUMEROS PARES EN SU ARREGLOS Y LOS IMPARES TAMBIEN//
        for (int i = 0; i < 10; i++) {
            if (arreglo[i] % 2==0){ //SI EL NUMERO ES PAR//
                par[conteo_par] = arreglo[i];
                conteo_par++;
            }
            else { //SI EL NUMERO ES IMPAR//
                impar[conteo_impar] = arreglo[i];
                conteo_impar++;
            }
        }

        System.out.println("\nArreglo pares: ");
        for (int i = 0; i < conteo_par; i++) {
            System.out.println(par[i]+ " - ");
        }

        System.out.println("\nArreglo impares: ");
        for (int i = 0; i < conteo_impar; i++) {
            System.out.println(impar[i]+ " - ");
        }
    }
}
