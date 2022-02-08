package com.company;

class Number {
    int n;
    boolean valueSet = false;

    synchronized int get() {
        while (!valueSet) {
            try {
                wait();
            }
            catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }

        valueSet=false;
        notify();
        return n;
    }

    synchronized void put(int n) {
        while(valueSet) {
            try {
                wait();
            }
            catch(InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }

        this.n = n;
        valueSet=true;
        notify();
    }
}


class FormNumber implements Runnable {
    Number num;
    int count;
    Thread thread;

    FormNumber(Number num, int count) {
        this.num = num;
        this.count = count;

        thread = new Thread(this, "2");
        thread.start();
    }

    public void run() {
        for (int i=0; i<count; i++) {
            try {
                Thread.sleep(200);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }

            int number = (int)(Math.random()*100+1);

            System.out.println("Поток: " + thread.getName() + ", рандомное число: " + number);
            num.put(number);
        }
    }
}

class GetNumber implements Runnable {
    Number num;
    int count;
    Thread thread;

    GetNumber(Number num, int count) {
        this.num = num;
        this.count = count;

        thread = new Thread(this, "1");
        thread.start();
    }

    public void run() {
        for (int i=0; i<count; i++) {
            try {
                Thread.sleep(200);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Поток: " + thread.getName() + ", взятое число " + num.get());
        }
    }
}

public class Main {

    public static void main(String[] args) {
        Number num = new Number();
        new FormNumber(num, 5);
        new GetNumber(num, 5);
    }
}
