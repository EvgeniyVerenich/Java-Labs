/**
 * Ввести строки из файла, записать в список. Вывести строки в файл в обратном порядке
 */
package com.company;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

       File file = new File("notes.txt");
       FileInputStream fis = new FileInputStream(file);
       InputStreamReader sir = new InputStreamReader(fis);
       BufferedReader br = new BufferedReader(sir);
       ArrayList<String> buf = new ArrayList<>();
       String line ;
       while ((line = br.readLine()) != null){
           buf.add(line);
           System.out.println(line);
       }
       FileOutputStream sir1 = new FileOutputStream(file);
       BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(sir1));
        for (int i = buf.size()-1; i >= 0 ; i--) {
            writer.write(buf.get(i));
            writer.newLine();
        }
        writer.close();

    }
}
