package com.company;
import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        float[] numeros = new float [5];
        float suma_positivos = 0, suma_negativos = 0, media_negativos, media_positivos;
        int conteo_positivos = 0, conteo_negativos = 0, conteo_ceros = 0;

        System.out.println("Guardando los numeros en el arreglo");
        for (int i = 0; i < 5; i++) {
            System.out.print((i + 1)+ ". Digite su numero: ");
            numeros [i] = entrada.nextFloat();

            if (numeros [i] == 0) {
                conteo_ceros++;
            }
            else if (numeros [i] > 0) {
                suma_positivos += numeros [i];
                conteo_positivos++;
            }
            else {
                suma_negativos += numeros [i];
                conteo_negativos++;
            }
        }
            //MEDIA DE LOS NUMEROS POSITIVOS//
        if (conteo_positivos == 0) {
            System.out.println("No se puede sacar la media de los numeros positivos");
        }
        else {
            media_positivos = suma_positivos / conteo_positivos;
            System.out.println("La media de los numeros positivos es: "+media_positivos);
        }

        //MEDIA DE LOS NUMEROS NEGATIVOS//
        if (conteo_negativos == 0) {
            System.out.println("No se puede sacar la media de los numeros negativos");
        }
        else {
            media_negativos = suma_negativos / conteo_negativos;
            System.out.println("La media de los numeros positivos es: "+media_negativos);
        }
        System.out.println("La cantidad de ceros es: "+conteo_ceros);
    }
}
