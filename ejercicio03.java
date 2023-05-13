package SentenciaCondicionalIfSwitch;

import java.util.Scanner;

public class ejercicio03 {
    public static void main(String[] args) {
        //Escribe un programa en que dado un número del 1 a 7 escriba el correspon-
        //diente nombre del día de la semana.
        Scanner tyu = new Scanner(System.in);
        System.out.println("Ingrese un numero del 1 al 7: ");
        int numd = tyu.nextInt();
        if ((numd>7)||(numd<1)){
            System.out.println("Este dia de la semana no existe");
            return;
        }
        String dia ="";
        switch (numd){
            case 1:
                dia ="Lunes";
                break;
            case 2:
                dia="Martes";
                break;
            case 3:
                dia ="Miercoles";
                break;
            case 4:
                dia ="Jueves";
                break;
            case 5:
                dia ="Viernes";
                break;
            case 6:
                dia = "Sabado";
                break;
            case 7:
                dia = "Domingo";
                break;
        }
        System.out.println("Para el numero "+numd+" el dia es "+dia);
    }
}
