package com.itFactory.control.decizionale;

public class Exercitiu10 {

    public static void main(String[] args) {
            //true     //false => true (tata conditia este true)
        if((3 > 2) || (5 < 4)){
            System.out.println("una sau amble conditii sunt true +");
        } else {
            System.out.println("amble conditii sunt false +");
        }

        //false         //false  => false => (intraga conditie este false)
        if((3 <= 2) || (5 < 4)){
            System.out.println("una sau amble conditii sunt true -");
        } else {
            System.out.println("amble conditii sunt false -");
        }



    }
}
