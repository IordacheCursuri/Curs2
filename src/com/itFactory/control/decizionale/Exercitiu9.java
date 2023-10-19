package com.itFactory.control.decizionale;

public class Exercitiu9 {

    public static void main(String[] args) {
            //true      //true   => true (toata conditia este true)
        if( (3 > 2) && (5 > 4)){
            System.out.println("cele doua conditii sunt adevarate +");
        } else {
            System.out.println("una sau amble conditii sunt false +");
        }


        //false      //true   => false (toata conditia este false)
        if( (3 <= 2) && (5 > 4)){
            System.out.println("cele doua conditii sunt adevarate -");
        } else {
            System.out.println("una sau amble conditii sunt false -");
        }

    }
}
