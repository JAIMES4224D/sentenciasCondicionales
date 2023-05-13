package SentenciaCondicionalIfSwitch;

import java.util.Scanner;

public class ejercicio05 {
    public static void main(String[] args) {
        //Realiza un programa que resuelva una ecuación de primer grado (del tipo ax+
        //b = 0).
        Scanner tyu = new Scanner(System.in);
        System.out.println("ax+b=0");
        System.out.println("Para resolver la ecuacion lineal: ");
        System.out.println("Ingrese el valor de a: ");
        double a = tyu.nextInt();
        System.out.println("Ingrese el valor de b: ");
        double b = tyu.nextInt();
        System.out.println("Ingrese algun valor que reemplaze y si no lo hay ponga 0");
        double c= tyu.nextInt();
        double x =(-b+c)/a;
        System.out.println("el resultado de la ecuacion es: "+x);
    }
}
