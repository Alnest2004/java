package com.company;

class Parallelogram{
    String name;

    double per,plosh;

    Parallelogram(String name, int a, int b){
        plosh= (0.5*a*b);
        per = 2*(a + b);
        this.name=name;
    }

    Parallelogram(String name, double a, double b){
        plosh= a*b;
        per = 2*(a + b);
        this.name=name;
    }

    Parallelogram(String name, double d1, double d2, double a){
        plosh= 0.5*d1*d1;
        per = 4*a;
        this.name=name;
    }


}

class Bravo extends Parallelogram{

    private void Output(){
        System.out.println("Площадь "+this.name+" равна= "+plosh);
        System.out.println("Периметр "+this.name+" равна= "+per);
        System.out.println();
    }

    Bravo(String name, int a, int b) {
        super(name, a, b);

        Output();
    }
}

class Rect extends Parallelogram{

    private void Output(){
        System.out.println("Площадь "+this.name+" равна= "+plosh);
        System.out.println("Периметр "+this.name+" равна= "+per);
        System.out.println();
    }

    Rect(String name, double a, double b) {
        super(name, a, b);

        Output();
    }
}

class Romb extends Parallelogram{

    private void Output(){
        System.out.println("Площадь "+this.name+" равна= "+plosh);
        System.out.println("Периметр "+this.name+" равна= "+per);
        System.out.println();
    }

    Romb(String name, double d1, double d2, double a) {
        super(name, d1, d2, a);

        Output();
    }
}


public class Main {

    public static void main(String[] args) {
    Bravo obj;
    Romb obj1;
    Rect obj2;

    obj= new Bravo("Параллелограмм", 3, 5);
    obj1= new Romb("Ромб", 3.25, 5.2, 6.0);
    obj2= new Rect("Прямогульник", 3.4, 4.3);


    }
}