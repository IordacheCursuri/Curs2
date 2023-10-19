package com.itFactory.control.decizionale;

public class Exemplu11 {

    public static void main(String[] args) {

        int x = 6;
        int y = 5;

      //  String raspuns = (y > x) ? "y este mai mare ca x" : "x este mai mare ca y";

     //   System.out.println(raspuns);


        String valoare1 = valoareMaiMare(5, 6);

        System.out.println(valoare1);


        double suma = calculeazaSuma(2, 7);

        System.out.println(suma);

        double d = 5;

        int t = (int) 5.25;

        System.out.println("t castat " + t);

    }


    public static String valoareMaiMare(int a, int b) {
        if(a > b){
            return "a este mai mare ca b";
        } else {
            return "b este mai mare ca a";
        }
    }

    public static double calculeazaSuma(int x, double y) {
        double suma = x + y;
        return suma;

    }



}
