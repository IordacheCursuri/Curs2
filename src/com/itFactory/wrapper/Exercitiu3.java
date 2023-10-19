package com.itFactory.wrapper;

/**
 * Fiecare primitiva care clasa sa wrapper. Rolul clasei wrapper este de a reprezenta
 * primitiva ca obiect. Instantele lor sunt imutabile exact ca instantele de String.
 *
 * Boxing   -> punerea unei primitive intr-o referinta/obiect corespunzatoare acelei primitive
 * Unboxing -> punerea unei instante a unei clase Wrapper in primitiva corespunzatoare.
 *
 *
 * byte    -> Byte
 * short   -> Short
 * int     -> Integer
 * long    -> Long
 * double  -> Double
 * float   -> Float
 * char    -> Char
 * boolean -> Boolean
 * */

public class Exercitiu3 {

    public static void main(String[] args) {

        int x = 30;

        Integer x1 = x; //boxing
        Integer x2 = 10;

        int x3 = Integer.valueOf(12); //unboxing
        int x4 = Integer.valueOf("12");

        System.out.println("valoarea lui x1 este: " + x1);
        System.out.println("valoarea lui x4 este: " + x4);

        System.out.println(x1.toString());

        Double d = x1.doubleValue();
        System.out.println(d);

        Boolean valoare1 = Boolean.valueOf(true);
        System.out.println(valoare1);






    }

}
