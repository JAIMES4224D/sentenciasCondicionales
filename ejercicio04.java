package SentenciaCondicionalIfSwitch;

import java.util.Scanner;

public class ejercicio04 {
    public static void main(String[] args) {
        //Vamos a ampliar uno de los ejercicios de la relación anterior para considerar
        //las horas extras. Escribe un programa que calcule el salario semanal de un
        //trabajador teniendo en cuenta que las horas ordinarias (40 primeras horas de
        //trabajo) se pagan a 12 euros la hora. A partir de la hora 41, se pagan a 16
        //euros la hora.
        int sueldoFinal=0;
        Scanner tyu = new Scanner(System.in);
        //Pediremos cuantas horas trabajo
        System.out.println("Ingrese cuantas horas trabajo en la semana: ");
        int numeroHoras = tyu.nextInt();
        if (numeroHoras>40){
            int horasExtra= numeroHoras-40;
            int extra = horasExtra*16;
            sueldoFinal= (40*12)+extra;
        } else if (numeroHoras ==40) {
             sueldoFinal = numeroHoras*12;
        } else if (numeroHoras<40) {
            sueldoFinal = numeroHoras*12;
        }
        System.out.println("Usted trabajo "+numeroHoras+" horas por lo tanto le corresponde un sueldo de "+sueldoFinal+" euros");
    }
}
