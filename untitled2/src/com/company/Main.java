package com.company;

import java.io.*;
import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        File zxc = new File("F://16//out.txt");
        zxc.createNewFile();
        FileReader in = null;
        FileWriter out = null;

        in = new FileReader("F://16//in.txt");
        out = new FileWriter("F://16//out.txt");
        int o;
        String s = "";
        while ((o = in.read()) != -1)
        {
            s += (char) o;
        }
        String letters = "aeiouy";
        String[] ss = s.split(" ");
        for (String word:s.split("\\s+")) {
            if (!letters.contains(word.substring(0,1)))
            {
                System.out.println(word);
                out.write(word + " ");
            }

        }
        in.close();
        out.close();

    }
}
