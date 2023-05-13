package SentenciaCondicionalIfSwitch;

import java.util.Scanner;

public class ejercicio19 {
    public static void main(String[] args) {
        //Realiza un programa que nos diga cuántos dígitos tiene un número entero que
        //puede ser positivo o negativo. Se permiten números de hasta 5 dígitos.
        Scanner tyu = new Scanner(System.in);
        System.out.println("Ingrese el numero (5 digitos maximo): ");
        int num = tyu.nextInt();
        int dig =0;
        if (num<10){
            dig = 1;
        } else if (num>10&&num<100) {
            dig =2;
        }else if (num>100&&num<1000) {
            dig =3;
        }else if (num>1000&&num<10000) {
            dig =4;
        }else if (num>10000) {
            dig =5;
        }
        System.out.println("El numero de digitos es "+dig);
    }
}
