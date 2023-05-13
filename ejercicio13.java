package SentenciaCondicionalIfSwitch;

import java.util.Scanner;

public class ejercicio13 {
    public static void main(String[] args) {
        //Escribe un programa que ordene tres números enteros introducidos por
        //teclado.
        Scanner tyu = new Scanner(System.in);
        System.out.println("INTRODUZCO 3 NUMEROS: ");
        int num1 = tyu.nextInt();
        int num2 = tyu.nextInt();
        int num3 = tyu.nextInt();

        if (num1 > num2 && num1 > num3) {
            if (num2 > num3) {
                System.out.println(num1 + ", " + num2 + ", " + num3);
            } else {
                System.out.println(num1 + ", " + num3 + ", " + num2);
            }
        } else if (num2 > num1 && num2 > num3) {
            if (num1 > num3) {
                System.out.println(num2 + ", " + num1 + ", " + num3);
            } else {
                System.out.println(num2 + ", " + num3 + ", " + num1);
            }
        } else {
            if (num1 > num2) {
                System.out.println(num3 + ", " + num1 + ", " + num2);
            } else {
                System.out.println(num3 + ", " + num2 + ", " + num1);
            }
        }
    }
}

