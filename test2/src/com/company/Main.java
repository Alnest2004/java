package com.company;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("------------------ПЕРВОЕ ЗАДАНИЕ----------------");
        Scanner scan=new Scanner(System.in);
        int n=0;
        int[] mass = null;
        System.out.println("введите размер массива:");
        if(scan.hasNextInt()){
            n=Integer.valueOf(scan.nextLine());
            mass = new int[n];
        }
        //random [0,1)
        for(int i=0; i<mass.length;i++){

            mass[i]=10+(int)(Math.random()*89);
            System.out.print(mass[i]+" ");

        }
        System.out.println();

        System.out.println("Первый вывод:");
        for(int i=0; i<mass.length;i++){
            if ((i)%2 == 0){
                System.out.print(mass[i]+" ");
            }

        }
        System.out.println();
        System.out.println("Второй вывод:");

        for(int i=0; i<mass.length;i++){
            if ((i)%2 != 0){
                System.out.print(mass[i]+" ");
            }

        }
        System.out.println();
        System.out.println("------------------ВТОРОЕ ЗАДАНИЕ----------------");

        Scanner scan2=new Scanner(System.in);
        int n2=0;
        int[] mass2 = null;
        System.out.println("введите размер массива:");
        if(scan2.hasNextInt()){
            n2=Integer.valueOf(scan2.nextLine());
            mass2 = new int[n2];
        }
        //random [0,1)
        for(int i=0; i<mass2.length;i++){

            mass2[i]=-20+(int)(Math.random()*99);
            System.out.print(mass2[i]+" ");
        }

        int polog = 0;
        int otric = 0;
        int nul = 0;
        for(int i=0; i<mass2.length;i++){

            if (mass2[i] > 0){
                polog++;
            }
            if (mass2[i] < 0){
                otric++;
            }
            if (mass2[i] == 0){
                nul++;
            }
        }
        System.out.println();
        System.out.print("Количество положительных чисел = "+polog);
        System.out.println();
        System.out.print("Количество отрицательных чисел = "+otric);
        System.out.println();
        System.out.print("Количество нулей = "+nul);

        System.out.println();
        System.out.println("------------------ТРЕТЬЕ ЗАДАНИЕ----------------");

        Scanner scan3=new Scanner(System.in);
        int n3=0;
        int[] mass3 = null;
        System.out.println("введите размер массива:");
        if(scan3.hasNextInt()){
            n3=Integer.valueOf(scan3.nextLine());
            mass3 = new int[n3];
        }
        //random [0,1)
        for(int i=0; i<mass3.length;i++){

            mass3[i]=-20+(int)(Math.random()*99);
            System.out.print(mass3[i]+" ");
        }

        int sumotric = 0;
        int max = mass3[0];
        int min = mass3[0];
        int maxid = 0;
        int minid = 0;
        int proizv = 1;
        for(int i=0; i<mass3.length;i++){

            if (mass3[i] < 0){
                sumotric = sumotric+mass3[i];
            }

            if (mass3[i]>max){
                max = mass3[i];
                maxid = i;
            }

            if (mass3[i]<min){
                min = mass3[i];
                minid = i;

            }


        }

        if (minid < maxid){
            for (int i = minid+1; i<maxid; i++){
                proizv = proizv * mass3[i];
            }
        }
        else if (minid > maxid){
            for (int i = maxid+1; i<minid; i++){
                proizv = proizv * mass3[i];
            }
        }

        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 1; i < mass3.length; i++) {
                if (mass3[i] < mass3[i - 1]) {
                    int temp = mass3[i];
                    mass3[i] = mass3[i - 1];
                    mass3[i - 1] = temp;
                    isSorted = false;
                }
            }
        }






        System.out.println();
        System.out.print("Сумма отрицательных чисел = "+sumotric);
        System.out.println();
        System.out.print("максимальное число = "+max);
        System.out.println();
        System.out.print("минимальное число = "+min);
        System.out.println();
        System.out.print("id max = "+maxid);
        System.out.println();
        System.out.print("id min = "+minid);
        System.out.println();
        System.out.print("Произведение = "+proizv);

        System.out.println();
        System.out.println("По возрастанию = "+Arrays.toString(mass3));

        System.out.println();
        System.out.println("------------------ЧЕТВЁРТОЕ ЗАДАНИЕ----------------");


        int n4=0;
        int[] mass4 = {1,-2,3,0,6,-7,8,0,1,2,3,0};
        System.out.println("Первоночальный массив = "+Arrays.toString(mass4));


        boolean Sort = false;
        while (!Sort) {
            Sort = true;
            for (int i = 1; i < mass4.length; i++) {
                if ((mass4[i] >=0) && (mass4[i - 1]<0)) {
                    int tempik = mass4[i-1];
                    mass4[i-1] = mass4[i];
                    mass4[i] = tempik;
                    Sort = false;
                }
            }
        }



        System.out.println("Упорядоченный массив = "+Arrays.toString(mass4));

        //random [0,1)
        int proizv4=1;
        int firstid = 0;
        int lastid = 0;
        for(int i=0; i<mass4.length;i++){
            if (i % 2 == 0){
                proizv4 *= mass4[i];
            }
        }
        for(int i=0; i<mass4.length;i++){


            if (mass4[i] == 0){
                firstid = i;
                System.out.println("первый элемент = "+firstid);
                break;
            }
        }

        for (int i=mass4.length-1; i>0; i--){
            if (mass4[i] == 0){
                lastid = i;
                System.out.println("ласт элемент = "+lastid);
                break;

            }
        }

        int summanol = 0;
        for(int i=0; i<mass4.length;i++){
            if ((firstid<i) && (i<lastid)){
                summanol = summanol + mass4[i];

            }
        }

        System.out.println();
        System.out.println("Сумма между нулями= "+ summanol);
        System.out.println();
        System.out.println("Произведение чётных = "+ proizv4);

        System.out.println();
        System.out.println("------------------ПЯТОЕ ЗАДАНИЕ----------------");



        int mass5[][] = null;

        mass5 = new int[6][14];

        for(int i=0; i<mass5.length;i++){
            for(int j=0; j<mass5[i].length; j++){
                mass5[i][j]=30+(int)(Math.random()*95);
                System.out.print(mass5[i][j]+" ");
            }
            System.out.println();
        }


        System.out.println();
        System.out.println("------------------ШЕСТОЕ ЗАДАНИЕ----------------");

        Scanner scan6= new Scanner(System.in);
        int[][] mass6 =null;
        int[] mass66;
        int n6=0;
        n6 = Integer.valueOf(scan6.nextLine());
        mass6 = new int[n6][n6];
        mass66= new int[n6];
        for (int i=0; i<mass6.length; i++){
            for (int j=0; j<mass6[i].length; j++){
                mass6[i][j] = 10+(int)(Math.random()*5);
                mass66[i] += mass6[i][j];

                System.out.print(mass6[i][j]+" ");

            }
            System.out.print(" ");
            System.out.println("Cумма= "+mass66[i]+" ");
        }

        System.out.println();
        System.out.println("------------------СЕДЬМОЁ ЗАДАНИЕ----------------");

        Scanner scan7= new Scanner(System.in);
        int[][] mass7 =null;
        int n7=0;
        n7 = Integer.valueOf(scan7.nextLine());
        mass7 = new int[n7][n7];
        for (int i=0; i<mass7.length; i++){
            for (int j=0; j<mass7[i].length; j++){
                mass7[i][j] = 10+(int)(Math.random()*5);
                System.out.print(mass7[i][j]+" ");

            }
            System.out.println();
        }

        int Max7 =mass7[0][0];
        int Min7 =mass7[0][0];
        int idMax1 = 0;
        int idMax2 = 0;
        int idMin1 = 0;
        int idMin2 = 0;
        for (int i=0; i<mass7.length; i++){
            for (int j=0; j<mass7[i].length; j++){

                if (Max7 < mass7[i][j]){
                    Max7=mass7[i][j];

                }

                if (Min7 > mass7[i][j]){
                    Min7=mass7[i][j];
                }


            }
        }

        for (int i=0; i<mass7.length; i++){
            for (int j=0; j<mass7[i].length; j++){
                if (mass7[i][j] == Min7){
                    System.out.println("MIN ID строка: "+ i+ "; столбец: "+ j);
                }
                if (mass7[i][j] == Max7){
                    System.out.println("MAX ID строка: "+ i+ "; столбец: "+ j);
                }
            }
        }

        System.out.println("Максимальное число= "+Max7);
        System.out.println("Минимальное число= "+Min7);


    }
}