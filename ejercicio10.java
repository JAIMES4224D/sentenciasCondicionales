package SentenciaCondicionalIfSwitch;

import java.util.Scanner;

public class ejercicio10 {
    public static void main(String[] args) {
        //Escribe un programa que nos diga el horóscopo a partir del día y el mes de
        //nacimiento.
        Scanner tyu = new Scanner(System.in);
        System.out.println("Escribe un mes del año: ");
        String mes = tyu.nextLine();
        System.out.println("Escriba el dia(numero): ");
        int dia = tyu.nextInt();
        String signo = "";
        switch (mes){
            case "Marzo":
                if (dia>21 && dia <31) {
                    signo ="ARIES";
                }else if (dia>0&&dia<=20){
                    signo = "PISCIS";
                }
                break;
            case "Abril":
                if (dia>0&&dia<=19){
                    signo ="ARIES";
                }else if(dia>19&&dia<30){
                    signo ="TAURO";
                }
                break;
            case "Mayo":
                if (dia>0&&dia<=20){
                    signo = "TAURO";
                }else if (dia >20&&dia<31){
                    signo ="GEMINIS";
                }
                break;
            case "Junio":
                if (dia>0&&dia<=20){
                    signo = "GEMINIS";
                }else if (dia >20&&dia<31){
                    signo ="CANCER";
                }
                break;
            case "Julio":
                if (dia>0&&dia<=22){
                    signo = "CANCER";
                }else if (dia >22&&dia<31){
                    signo ="LEO";
                }
                break;
            case "Agosto":
                if (dia>0&&dia<=22){
                    signo = "LEO";
                }else if (dia >22&&dia<31){
                    signo ="VIRGO";
                }
                break;
            case "Septiembre":
                if (dia>0&&dia<=22){
                    signo = "VIRGO";
                }else if (dia >22&&dia<30){
                    signo ="LIBRA";
                }
                break;
            case "Octubre":
                if (dia>0&&dia<=22){
                    signo = "LIBRA";
                }else if (dia >22&&dia<31){
                    signo ="ESCORPIO";
                }
                break;
            case "Noviembre":
                if (dia>0&&dia<=21){
                    signo = "ESCORPIO";
                }else if (dia >21&&dia<30){
                    signo ="SAGITARIO";
                }
                break;
            case "Diciembre":
                if (dia>0&&dia<=21){
                    signo = "SAGITARIO";
                }else if (dia >21&&dia<31){
                    signo ="CAPRICORNIO";
                }
                break;
            case "Enero":
                if (dia>0&&dia<=20){
                    signo = "CAPRICORNIO";
                }else if (dia >20&&dia<31){
                    signo ="ACUARIO";
                }
                break;
            case "Febrero":
                if (dia>0&&dia<=19){
                    signo = "ACUARIO";
                }else if (dia >20&&dia<31){
                    signo ="PISCIS";
                }
                break;
            default:
                System.out.println("El mes mencionado no existe");

        }
        System.out.println("Usted pertenece al signo zodiacal "+ signo);
    }
}
