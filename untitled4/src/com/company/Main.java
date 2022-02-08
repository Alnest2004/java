package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int MAXVALUE = 35;
        int sum = 0;
        int count = 0;
        int a, b;

        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество строк массива: ");
        a = in.nextInt();

        System.out.print("Введите количество столбцов массива: ");
        b = in.nextInt();


        byte[][] arr = new byte[a][b];
        int prov=0;
        int chet =0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print("Введите элемент arr[" + i + "][" + j + "]:");
                try{
                    prov = Integer.parseInt(String.valueOf(in.nextInt()));
                }catch (Exception e){
                    System.out.println("Ошибка вы ввели не число");
                    break;
                }
                try{
                    if (prov > 128 || prov<0) throw new Exception("МОЖНО ТОЛЬКО тип byte(ЧИСЛА ОТ 1 ДО 128)!");
                }catch (Exception e) {
                    e.printStackTrace();
                }
                arr[i][j] = (byte)prov;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j]%2==0){
                    chet++;
                }
            }
        }

        try{
            if (chet == 0) throw new Exception("НЕТУ ЧЁТНЫХ!");
        }catch (Exception e) {
            e.printStackTrace();
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }

        int max = arr[0][0];
        int col = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j]%2==0){
                    if (arr[i][j]>max){
                        max = arr[i][j];
                        col = j+1;
                    }
                }

            }
        }
        System.out.println("Максимальное число = "+max + " его столбец = "+col);
    }
}
