/**
 * Создать класс Notepad (записная книжка) с внутренним классом или классами,
 * с помощью объектов которого могут храниться несколько записей на одну дату.
 */

package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        Notepad.Text[] texts = new Notepad.Text[3];
        texts[0] = new Notepad.Text("не забыть покушать");
        texts[1] = new Notepad.Text("Создать класс Notepad (записная книжка) с внутренним классом или классами,\n" +
                "с помощью объектов которого могут храниться несколько записей на одну дату.");
        texts[2] = new Notepad.Text("посмотреть сериал!");



        Notepad notepad = new Notepad("2002.08.09",texts[0]);
        Notepad notepad1 = new Notepad("2021.12.07",texts[1]);
        Notepad notepad2 = new Notepad("2020.05.10",texts[2]);
        notepad.showNote();
        notepad2.showNote();
        notepad1.showNote();






    }
}
