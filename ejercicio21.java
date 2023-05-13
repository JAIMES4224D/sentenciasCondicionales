package SentenciaCondicionalIfSwitch;

import java.util.Scanner;

public class ejercicio21 {
    public static void main(String[] args) {
        //Calcula la nota de un trimestre de la asignatura Programación. El programa
        //pedirá las dos notas que ha sacado el alumno en los dos primeros controles.
        //Si la media de los dos controles da un número mayor o igual a 5, el alumno
        //está aprobado y se mostrará la media. En caso de que la media sea un número
        //menor que 5, el alumno habrá tenido que hacer el examen de recuperación
        //que se califica como apto o no apto, por tanto se debe preguntar al usuario
        //¿Cuál ha sido el resultado de la recuperación? (apto/no apto). Si el
        //resultado de la recuperación es apto, la nota será un 5; en caso contrario, se
        //mantiene la nota media anterior.
        Scanner tyu = new Scanner(System.in);
        System.out.print("Nota del primer Examen: ");
        double nota1 = tyu.nextDouble();

        System.out.print("Nota del segundo control: ");
        double nota2 = tyu.nextDouble();

        double media = (nota1 + nota2) / 2;

        if (media < 5) {
            System.out.print("¿Cuál ha sido el resultado de la recuperación? (apto/no apto): ");
            String recuperacion = tyu.nextLine();
            if (recuperacion.equals("apto")) {
                media = 5;
            }
        }

        System.out.print("Tu nota de Programación es " + media);
    }
}
