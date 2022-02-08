package com.company;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
		int a = 10;
		int b = 99;
    	Scanner scan=new Scanner(System.in);
    	int n=0;
    	int[] mass = null;
		System.out.println("введите размер массива:");
		if(scan.hasNextInt()){
			n=Integer.valueOf(scan.nextLine());
			mass = new int[n];
		}
		for(int i=0; i<mass.length;i++){

				mass[i]=a+(int)(Math.random()*(b-10));
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


    }
}
