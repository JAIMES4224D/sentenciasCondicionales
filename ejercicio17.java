package SentenciaCondicionalIfSwitch;

import java.util.Scanner;

public class ejercicio17 {
    public static void main(String[] args) {
        //Escribe un programa que diga cuál es la última cifra de un número entero
        //introducido por teclado.
        Scanner tyu = new Scanner(System.in);
        System.out.println("Introduzca un numero: ");
        int num = tyu.nextInt();
        int result = num%10;
        System.out.println("La ultima cifra del numero introducida es: "+result);

    }
}
