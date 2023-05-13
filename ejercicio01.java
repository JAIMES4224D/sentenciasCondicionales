package SentenciaCondicionalIfSwitch;

import java.util.Scanner;

public class ejercicio01 {
    public static void main(String[] args) {
        //Escribe un programa que pida por teclado un día de la semana y que diga qué
        //asignatura toca a primera hora ese día.
        Scanner tyu = new Scanner(System.in);
        System.out.println("Mencione el dia de la semana: ");
        String dia = "";
        dia = tyu.nextLine();
        String curso = "";
        switch (dia){
            case "Lunes":
                curso= "Matematica";
                break;
            case"Martes":
                curso="Algebra";
                break;
            case "Miercoles":
                curso = "Redacción de Textos";
                break;
            case "Jueves":
                curso = "Metodologia de la Programación";
                break;
            case "Viernes":
                curso = "Ingles";
                break;
            case "Sabado", "Domingo":
                curso = "No hay clase";
                break;

        }
        System.out.println("El dia "+dia+" la primera asignatura que te toca es " + curso);
    }
}
