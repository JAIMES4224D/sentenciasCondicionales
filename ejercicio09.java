package SentenciaCondicionalIfSwitch;
import java.util.*;
public class ejercicio09 {
    public static void main(String[] args) {
        //Realiza un programa que resuelva una ecuación de segundo grado (del tipo
        //ax2 + bx + c = 0)
        Scanner tyu = new Scanner(System.in);
        double a, b, c;
        System.out.println("ax^2 + bx + c =0");
        System.out.println("Ingrese el valor de a: ");
        a = tyu.nextDouble();
        System.out.println("Ingrese el valor de b: ");
        b = tyu.nextDouble();
        System.out.println("Ingrese el valor de c: ");
        c = tyu.nextDouble();

        double discriminante = b*b - 4*a*c;
        double raiz1, raiz2;

        if (discriminante > 0) {
            raiz1 = (-b + Math.sqrt(discriminante)) / (2*a);
            raiz2 = (-b - Math.sqrt(discriminante)) / (2*a);
            System.out.println("Las raices son: " + raiz1 + " y " + raiz2);
        } else if (discriminante == 0) {
            raiz1 = -b / (2*a);
            System.out.println("La raiz doble es: " + raiz1);
        } else {
            System.out.println("La ecuacion no tiene solucion en los numeros reales.");
        }
    }
}
