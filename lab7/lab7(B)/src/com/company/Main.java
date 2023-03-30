/**
 * В тексте нет слов, начинающихся одинаковыми буквами.
 * Напечатать слова текста в таком порядке, чтобы последняя буква каждого слова совпадала с первой буквой последующего слова.
 * Если все слова нельзя напечатать в таком порядке, найти такую цепочку, состоящую из наибольшего количества слов.
 */

package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String[] strings = "Питер аут река юла карбюратор труба".trim().split("\\s+");


        for (int i = 0;i < strings.length;i++){
            int n = strings[i].length()-1;
            for (int j = 0; j < strings.length; j++) {
                char first = strings[i].charAt(n);
                char second = strings[j].charAt(0);
                if (first == second){
                    try{
                    String miss = strings[j];
                    strings[j] =  strings[i+1];
                    strings[i+1] = miss;
                    break;
                    }catch (ArrayIndexOutOfBoundsException e){break;}

                }
            }
        }

        System.out.println(strings[0]);
        for (int i = 0; i < strings.length; i++) {

            for (int j = 0; j < strings.length; j++) {
                int n = strings[j].length() - 1;

            char first = strings[i].charAt(0);
            char second = strings[j].charAt(n);
            if (first == second){
            System.out.println(strings[i] + " ");
            break;
            }
        }
        }

    }
}
