package SentenciaCondicionalIfSwitch;

import java.util.Scanner;

public class ejercicio18 {
    public static void main(String[] args) {
        //Escribe un programa que diga cuál es la primera cifra de un número entero
        //introducido por teclado. Se permiten números de hasta 5 cifras
        Scanner tyu = new Scanner(System.in);
        int numIntro, primera = 0;

        System.out.print("Ingrese un número entero positivo (5 cifras como máximo): ");
        numIntro = tyu.nextInt();

        if ( numIntro < 10 ) {
            primera = numIntro;
        }

        if (( numIntro >= 10 ) && ( numIntro < 100 )) {
            primera = numIntro / 10;
        }

        if (( numIntro >= 100 ) && ( numIntro < 1000 )) {
            primera = numIntro / 100;
        }

        if (( numIntro >= 1000 ) && ( numIntro < 10000 )) {
            primera = numIntro / 1000;
        }

        if ( numIntro >= 10000 ) {
            primera = numIntro / 10000;
        }

        System.out.println("La primera cifra del número introducido es el " + primera + ".");
    }
}

