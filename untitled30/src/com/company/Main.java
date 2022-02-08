package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите длину массива: ");
        int size = input.nextInt();
        byte array[] = new byte[size];
        byte array2[] = new byte[size];


        System.out.println("Заполнение массива:");
        int prov=0;
        for (int i = 0; i < size; i++) {
            try{
                prov = Integer.parseInt(String.valueOf(input.nextInt()));
            }catch (Exception e){
                System.out.println("Ошибка вы ввели не число");
                break;
            }
            try{
                if (prov>128) throw new Exception("ВЫХОД ЗА ГРАНИЦ");
            }
            catch (Exception e) {
                e.printStackTrace();
            }
            try{
                if (prov<0) throw new Exception("НЕЛЬЗЯ ОТРИЦАТЕЛЬНОЕ ЧИСЛО");
            }
            catch (Exception e) {
                e.printStackTrace();
            }
            array[i] = (byte) prov;



        }

        System.out.print ("Полученный массив:");
        for (int i = 0; i < size; i++) {
            System.out.print (" " + array[i]);
        }
        System.out.println();




        byte max = array[0];
        for (int i = 1; i < array.length; i++) {
            if(max < array[i]){
                max = array[i];
            }
        }

        System.out.println("Максимальное число: " + max);
    }
}
