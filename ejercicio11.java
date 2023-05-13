package SentenciaCondicionalIfSwitch;

import java.util.Scanner;

public class ejercicio11 {
    public static void main(String[] args) {
        //Escribe un programa que dada una hora determinada (horas y minutos),
        //calcule los segundos que faltan para llegar a la medianoche.
        Scanner tyu = new Scanner(System.in);
        System.out.println("Escribe la hora en formato de 24 horas: ");
        int hour = tyu.nextInt();
        System.out.println("Escriba los minutos: ");
        int min = tyu.nextInt();
        int houraSeg = hour * 3600;
        int minaSeg = min * 60;
        int sum = houraSeg+minaSeg;
        int segundosFaltantes = 86400 - sum;
        System.out.println("Los segundos faltantes para la media noches es: "+segundosFaltantes);
    }
}
