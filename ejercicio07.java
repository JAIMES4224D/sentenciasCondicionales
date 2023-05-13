package SentenciaCondicionalIfSwitch;

import java.util.Scanner;

public class ejercicio07 {
    public static void main(String[] args) {
        //Realiza un programa que calcule la media de tres notas.
        Scanner tyu = new Scanner(System.in);
        System.out.println("Escriba su primera nota: ");
        double nota1 = tyu.nextDouble();
        System.out.println("Escriba su segunda nota: ");
        double nota2 = tyu.nextDouble();
        System.out.println("Escriba su tercera nota: ");
        double nota3 = tyu.nextDouble();
        double media = (nota1+nota2+nota3)/3;
        System.out.println("La media de sus nota es " + media);
    }
}
