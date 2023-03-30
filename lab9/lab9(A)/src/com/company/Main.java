/**
 * При возникновении ошибок, связанных с корректностью выполнения математических операций,
 * генерировать и обрабатывать исключительные ситуации.
 * Предусмотреть обработку исключений, возникающих при:
 * нехватке памяти, отсутствии требуемой записи (объекта) в файле, недопустимом значении поля и т.д.
 */
package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        start();


    }
    public static void start() {
        try {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter amount of vectors : ");
            int n = in.nextInt();
            Vector[] vectors = new Vector[n];
            for (int i = 0; i < n; i++) {
                System.out.println("Enter coordinates of the " + (i + 1) + " vector : ");
                vectors[i] = new Vector();
                vectors[i].x = in.nextInt();
                vectors[i].y = in.nextInt();
                vectors[i].z = in.nextInt();
            }


            int m = 10 * n;
            Vector[] results = new Vector[m];
            for (int i = 0; i < n; i++) {
                for (int j = i; j < n; j++) {
                    System.out.println("The results of the couple of vectors [" + (i + 1) + "," + (j + 1) + "] : ");
                    results[i] = new Vector();
                    results[i].getMultiply(vectors[i], vectors[j]);
                    results[i].getSumLength(vectors[i], vectors[j]);
                    results[i].getAngle(vectors[i], vectors[j], vectors[i].getLength(), vectors[j].getLength());
                    System.out.println();
                }

            }
        }catch (
                InputMismatchException error) {
            System.out.println("Недопустимое значение!!!");
            start();
        }
    }
}

