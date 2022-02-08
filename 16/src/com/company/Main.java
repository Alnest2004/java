package com.company;

import java.io.*;
import java.math.BigInteger;
import java.util.Scanner;

public class Main {package com.company;

import java.io.*;
import java.math.BigInteger;
import java.util.Scanner;

    public class Main {

        public static void main(String[] args) throws FileNotFoundException, IOException {
            File zxc = new File("E://16//out.txt");
            zxc.createNewFile();
            FileReader in = null;
            FileWriter out = null;

            in = new FileReader("E://16//in.txt");
            out = new FileWriter("E://16//out.txt");
            int o;
            String s = "";
            while ((o = in.read()) != -1)
            {
                s += (char) o;
            }
            String letters = "aeiouy";
            String[] ss = s.split(" ");
            for (String word:s.split("\\s+")) {
                if (letters.contains(word.substring(0,1)))
                {
                    System.out.println(word);
                    out.write(word + " ");
                }

            }
            in.close();
            out.close();

        }
    }


    public static void main(String[] args) throws FileNotFoundException, IOException {
        File zxc = new File("F:\\zxc 16\\out.txt");
        zxc.createNewFile();
        FileReader in = null;
        FileWriter out = null;

        in = new FileReader("F:\\zxc 16\\in.txt");
        out = new FileWriter("F:\\zxc 16\\out.txt");
        int o;
        String s = "";
        while ((o = in.read()) != -1)
        {
            s += (char) o;
        }
        char[] a = new char[]{'а','о','у','ы','е','э','ё','я','и','ю'};
        String[] ss = s.split(" ");
        for (int i = 0; i < ss.length; i++)
        {
            int j=0;
            for (j = 0; j < a.length; j++)
            {
                if (ss[i].charAt(0) == a[j])
                {
                    System.out.println(ss[i]);
                    out.write(ss[i] + " ");
                }
            }
        }
        in.close();
        out.close();

    }
}
