package SentenciaCondicionalIfSwitch;

import java.util.Scanner;

public class ejercicio08 {
    public static void main(String[] args) {
        //Amplía el programa anterior para que diga la nota del boletín (insuficiente,
        //suficiente, bien, notable o sobresaliente).
        Scanner tyu = new Scanner(System.in);
        String nota ="";
        System.out.println("Escriba su primera nota: ");
        double nota1 = tyu.nextDouble();
        System.out.println("Escriba su segunda nota: ");
        double nota2 = tyu.nextDouble();
        System.out.println("Escriba su tercera nota: ");
        double nota3 = tyu.nextDouble();
        double media = (nota1+nota2+nota3)/3;
        if (media>0 && media<10){
            nota = "Insuficiente";
        }else if(media>10&&media<=12){
            nota="Suficiente";
        }else if (media >12 && media <= 14){
            nota = "Bien";
        }else if (media>14 && media<=17){
            nota = "Notable";
        }else if (media>17 && media <=20){
            nota = "Sobresaliente";
        }
        System.out.println("La media de sus nota es " + media);
        System.out.println("su media es una nota " + nota);

    }
}
