package SentenciaCondicionalIfSwitch;

import java.util.Scanner;

public class ejercicio14 {
    public static void main(String[] args) {
        //Realiza un programa que diga si un número introducido por teclado es par y/o
        //divisible entre 5.
        Scanner tyu = new Scanner(System.in);
        System.out.print("Introduce un número entero: ");
        int num = tyu.nextInt();

        if(num % 2 == 0) {
            System.out.println(num + " es un número par.");
        } else {
            System.out.println(num + " no es un número par.");
        }

        if(num % 5 == 0) {
            System.out.println(num + " es divisible entre 5.");
        } else {
            System.out.println(num + " no es divisible entre 5.");
        }
    }
}