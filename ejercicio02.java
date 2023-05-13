package SentenciaCondicionalIfSwitch;

import java.util.Scanner;

public class ejercicio02 {
    public static void main(String[] args) {
        //Realiza un programa que pida una hora por teclado y que muestre luego
        //buenos días, buenas tardes o buenas noches según la hora. Se utilizarán los
        //tramos de 6 a 12, de 13 a 20 y de 21 a 5. respectivamente. Sólo se tienen en
        //cuenta las horas, los minutos no se deben introducir por teclado.
        Scanner tyu = new Scanner(System.in);
        System.out.println("Ingrese solo la hora en formato de 24 horas: ");
        int hora = tyu.nextInt();
        String saludo ="";
        String Azul =  "\033[34m";
        switch (hora){
            case 6,7,8,9,10,11,12:
                saludo = "Buenos dias";
                break;
            case 13,14,15,16,17,18,19,20:
                saludo = "Buenas tardes";
                break;
            case 21,22,23,24,1,2,3,4,5:
                saludo = "Buenas noches";
                break;
        }
        System.out.println(Azul+"Hola "+saludo);
    }
}
