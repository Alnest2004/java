package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String title = scanner.nextLine();

        ACipher g = new ACipher();
        g.stroka=title;
        g.encode();
        System.out.println(g.stroka);
        g.decode();
        BCipher gg = new BCipher();
        Scanner scanner2 = new Scanner(System.in);
        String title2 = scanner.nextLine();
        gg.stroka222 = title2;
        gg.encode();
        System.out.println(gg.stroka222);
        gg.decode();



    }
}

interface ICipher{
    String encode();
    String decode();
}

class ACipher implements ICipher{
    String stroka;
    public String encode(){
        System.out.println("Шифрование");
        char[] stroka1 = stroka.toCharArray();


        for (int i =0; i<stroka.length(); i++){

            char c = stroka1[i];
            if (!Character. isLetter(c)){
                stroka1[i] =c;
            }
            else if (Character. isLowerCase(c)){
                stroka1[i] =(char)(((c-'a'+1)%26)+'a');///c+1 прибавляет ещё и след элемент
            }

            else if (Character. isUpperCase(c)){
                stroka1[i] =(char)((c-'A'+1)%26 +'A');
            }
        }

        String stroka11 = String.valueOf(stroka1);
        stroka = stroka11;
        return stroka;
    }
    public String decode(){
        System.out.println("Расшифрование");
        char[] strokaD = stroka.toCharArray();

        for (int i =0; i<stroka.length(); i++){

            char c = strokaD[i];
            if (!Character. isLetter(c)){
                strokaD[i] =c;
            }
            else if (strokaD[i]=='a'){
                strokaD[i]='z';
            }
            else if (strokaD[i]=='A'){
                strokaD[i]='Z';
            }
            else if (Character. isLowerCase(c)){
                strokaD[i] =(char)(((c-'a'-1)%26)+'a');///c+1 прибавляет ещё и след элемент
            }

            else if (Character. isUpperCase(c)){
                strokaD[i] =(char)((c-'A'-1)%26 +'A');
            }
        }


        String strokaDECOD = String.valueOf(strokaD);
        System.out.println(strokaDECOD);
        return strokaDECOD;
    }
}



class BCipher implements ICipher{
    String stroka222;
    public String encode(){
        System.out.println("Шифрование");
        char[] stroka111 = stroka222.toCharArray();

        for (int i = 0; i<stroka111.length; i++){
            if (stroka111[i] >= 'a' && stroka111[i]<='z'){
                stroka111[i] = (char) ('z'-stroka111[i]+'a');
            }
            else if (stroka111[i] >= 'A' && stroka111[i]<='Z'){
                stroka111[i] = (char) ('Z'-stroka111[i]+'A');
            }
        }

        String stroka11 = String.valueOf(stroka111);
        stroka222 = stroka11;
        return stroka222;
    }
    public String decode(){
        System.out.println("Расшифрование");
        char[] strokaDEC = stroka222.toCharArray();

        for (int i = 0; i<strokaDEC.length; i++){
            if (strokaDEC[i] >= 'a' && strokaDEC[i]<='z'){
                strokaDEC[i] = (char) ('z'-strokaDEC[i]+'a');
            }
            else if (strokaDEC[i] >= 'A' && strokaDEC[i]<='Z'){
                strokaDEC[i] = (char) ('Z'-strokaDEC[i]+'A');
            }
        }
        String strokaDECOD2 = String.valueOf(strokaDEC);
        System.out.println(strokaDEC);
        return strokaDECOD2;
    }
}


