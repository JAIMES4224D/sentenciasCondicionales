package SentenciaCondicionalIfSwitch;

import java.sql.SQLOutput;
import java.util.Objects;
import java.util.Scanner;

public class ejercicio12 {
    public static void main(String[] args) {
        //Realiza un minicuestionario con 10 preguntas tipo test sobre las asignaturas
        //que se imparten en el curso. Cada pregunta acertada sumará un punto. El
        //programa mostrará al final la calificación obtenida. Pásale el minicuestionario
        //a tus compañeros y pídeles que lo hagan para ver qué tal andan de conoci-
        //mientos en las diferentes asignaturas del curso.
        Scanner tyu = new Scanner(System.in);
        System.out.println("MINICUESTIONARIO");
        int puntos =0;
        int j =0;
        String clave ="";
        System.out.println("Cual es la palabra de arranque de Java: ");
        System.out.println("a) main  b) void   c)  static");
         clave = tyu.nextLine();
        if (Objects.equals(clave, "a")){
            puntos += 1;
            System.out.println("Respuesta correcta");
        }else{
            j +=1;
            System.out.println("Respuesta incorrecta");
        }
        System.out.println("Cual es la palabra de sentencia condicional: ");
        System.out.println("a) main  b) void   c) if");
        clave = tyu.nextLine();
        if (Objects.equals(clave, "c")){
            puntos += 1;
            System.out.println("Respuesta correcta");
        }else{
            j +=1;
            System.out.println("Respuesta incorrecta");
        }
        System.out.println("Cual es la sentencia condicional diferente de if en Java: ");
        System.out.println("a) if  b) switch   c) else");
        clave = tyu.nextLine();
        if (Objects.equals(clave, "b")){
            puntos += 1;
            System.out.println("Respuesta correcta");
        }else{
            System.out.println("Respuesta incorrecta");
            j +=1;
        }
        System.out.println("Las respuestas correctas son: "+puntos+" por lo tanto los puntos obtenidos son "+puntos);
        System.out.println("Las respuestas incorrectas son: "+ j);
    }
}
