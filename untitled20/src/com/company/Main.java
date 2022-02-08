package com.company;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        System.out.println("ПЕРВОЕ ЗАДАНИЕ");
        Scanner p = new Scanner(System.in);
        String str = p.nextLine();
        char[] chars = str.toCharArray();
        for (int i = 0; i<chars.length; i++){
            if (chars[i]>='А'&&chars[i]<='Я'){
                chars[i]=Character.toLowerCase(chars[i]);
            }
        }
        for (int i = 0; i<chars.length; i++){
            System.out.print(chars[i]);
        }
        System.out.println();


        System.out.println("ВТОРОЕ ЗАДАНИЕ");
        String sss = "dsCCCdskCkC";
        char ccc = 'C';
        int first100 =0;
        char[] chars100 = sss.toCharArray();
        int index100 = sss.indexOf(ccc);
        System.out.println(sss);
        for (int i = index100; i<chars100.length; i++){
            if (chars100[i]==ccc){
                chars100[i] = ' ';
            }
            else{
                break;
            }
        }
        for (int i = 0; i<chars100.length; i++){
            System.out.print(chars100[i]);
        }
        System.out.println();


        System.out.println("ТРЕТЬЕ ЗАДАНИЕ");
        String str3 = "Hello world world";
        System.out.println(str3);
        int index3 = str3.lastIndexOf("world");
        System.out.println(index3);
        System.out.println("ЧЕТВЁРТОЕ ЗАДАНИЕ");
        Scanner p1 = new Scanner(System.in);
        String str1 = p1.nextLine();
        char[] chars1 = str1.toCharArray();
        int first = 0;
        int last = 0;
        for (int i=0; i<chars1.length; i++){
            if (chars1[i] == '('){
                first = i;
            }
            if (chars1[i] == ')'){
                last = i;
            }
        }
        for (int i=first+1; i<last; i++){
            System.out.print(chars1[i]);
        }
    }
}