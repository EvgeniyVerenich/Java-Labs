/**
 *В каждом слове текста k-ю букву заменить заданным символом. Если k больше длины слова, корректировку не выполнять.
 */

package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите номер буквы : ");
        int n = in.nextInt() - 1;
        System.out.println("Введите букву для замены :");
        String k = in.next();
        String[] s = " В каждом слове текста k-ю букву заменить заданным символом. Если k больше длины слова, корректировку не выполнять".trim().split("\\s+");

        for (int i = 0; i < s.length; i++) {
            if (s[i].length() > n) {
                char real = s[i].charAt(n);
                s[i]=s[i].replace(real,k.charAt(0));

            }
        }
        for (int i = 0; i <s.length ; i++) {
            System.out.print(s[i]+" ");

        }

    }
}
