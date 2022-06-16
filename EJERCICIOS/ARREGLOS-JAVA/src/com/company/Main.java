package com.company;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner inputData = new Scanner(System.in);
        System.out.println("Ingress the numbers of students: ");
        int numStudents = Integer.parseInt(inputData.nextLine());
        int i;
        double average = 0;
        double[] note = new double[numStudents];
        double studentAverage = 0;
        String [] names = new String[numStudents];

        for (i = 0; i < numStudents; i++)
        {
            System.out.println("Ingrese el nombre: ");
            names [i] = inputData.nextLine();
            for (int j = 0; j < 3; j++)
            {
                System.out.println("Ingress the note: "+ (j + 1));
                studentAverage = studentAverage + Double.parseDouble(inputData.nextLine());
            }
            studentAverage = studentAverage / 3;
            note [i] = studentAverage;
            average = average + note [i];
        }
        System.out.println("Average note is : " + average / note.length);
        for (int j = 0; j < note.length; j++)
        {
            System.out.println("Estudiante: " + names [i] + "Nota: " + note [i]);
        }

    }
}