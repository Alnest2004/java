package com.company;

import java.io.*;

public class Main {

    public static void main(String[] args)
    {
	    double[] arr=null;
        try {
            BufferedReader r = new BufferedReader(new FileReader("E:/fifteen/number.txt"));
            arr = r.lines().mapToDouble(Double::parseDouble).toArray();
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }



        double max=-100;
        for (int i=0; i<arr.length; i++){
            if (arr[i]>max){
                max = arr[i];
            }
        }
        String str = Double.toString(max);


        try{
            File f1 = new File ("New.txt");
            f1.createNewFile();
            DataOutputStream wr = new DataOutputStream(new FileOutputStream(f1.getAbsolutePath()));
            for (int i=0; i<arr.length; i++){
                if (arr[i]>0){
                    String str1 = Double.toString((float) arr[i]);
                    wr.writeUTF(str1);
                }
            }

            wr.writeUTF(str);
        }
        catch (IOException ex){
            System.out.println(ex.getMessage());
        }

    }
}
