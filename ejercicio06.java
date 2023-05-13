package SentenciaCondicionalIfSwitch;

import java.util.Scanner;

public class ejercicio06 {
    public static void main(String[] args) {
        //Realiza un programa que calcule el tiempo que tardará en caer un objeto desde
        //una altura h. Aplica la fórmula t =
        //√2h/g
        //siendo g = 9.81m/s
        Scanner tyu = new Scanner(System.in);
        double g= 9.81;
        System.out.println("t= |2h/g ");
        System.out.println("Para hallar el tiempo");
        System.out.println("Ingrese la altura: ");
        double h = tyu.nextInt();
        double numero = (2*h)/g;
        double raizCuadrada = Math.sqrt(numero);
        System.out.println("El tiempo es igual a: "+ raizCuadrada);
    }
}
