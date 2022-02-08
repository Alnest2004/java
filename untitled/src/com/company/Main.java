package com.company;

import java.io.*;
import java.math.BigInteger;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) throws FileNotFoundException, IOException {
        File zxc = new File("F://16DELETE//out.txt");
        zxc.createNewFile();
        FileReader in = null;
        FileWriter out = null;

        in = new FileReader("F://16DELETE//in.txt");
        out = new FileWriter("F://16DELETE//out.txt");
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
                System.out.println(ss[i]);
                if (ss[i].charAt(0) == a[j])
                {
                    System.out.println(ss[i]);
                    out.write(ss[i] + " ");
                }
            }
        }
        in.close();
        out.close();
        System.out.println("TEEEEEEEEEEEEST ");

        BufferedReader br = null;
        try {
            File file = new File("F://16DELETE//out.txt");

            if(!file.exists())
                file.createNewFile();

            PrintWriter pw = new PrintWriter(file);
            pw.println("РАБОТАЕТ fdfd");
            pw.close();

            br = new BufferedReader(new FileReader("F://16DELETE//in.txt"));
            String line;
            while((line = br.readLine()) != null) {
                System.out.println(line);
            }
        }catch (IOException e){
            System.out.println("EROR "+ e);
        } finally {
            br.close();
        }

    }
}
