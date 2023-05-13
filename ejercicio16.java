package SentenciaCondicionalIfSwitch;

import java.util.Objects;
import java.util.Scanner;

public class ejercicio16 {
    public static void main(String[] args) {
        //Realiza un programa que nos diga si hay probabilidad de que nuestra pareja
        //nos está siendo infiel. El programa irá haciendo preguntas que el usuario
        //contestará con verdadero o falso. Cada pregunta contestada como verdadero
        //sumará 3 puntos. Las preguntas contestadas con falso no suman puntos. Utili-
        //za el fichero test_infidelidad.txt para obtener las preguntas y las conclusiones
        //del programa.
        Scanner tyu = new Scanner(System.in);
        System.out.println("-----BIENVENIDO AL TEST DE INFIDELIDAD-----");
        System.out.println("Escriba su nombre porfavor: ");
        String name = tyu.nextLine();
        System.out.println("Bienvenido "+name);
        System.out.println("AHORA A CONTESTAR LAS PREGUNTAS");
        System.out.println("TODAS LAS PREGUNTAS SON RESPECTO A SU FRACTURA");
        int puntosVerdadero=0;
        int puntosFalso =0;
        String clave ="";
        System.out.println("¿Sus horarios han cambiado?");
        System.out.println("V    F");
        clave = tyu.nextLine();
        if (Objects.equals(clave, "V")){
            puntosVerdadero += 1;
        }else{
            puntosFalso +=1;
        }
        System.out.println("¿No sabe qué responder cuando preguntas dónde ha estado?");
        System.out.println("V    F");
        clave = tyu.nextLine();
        if (Objects.equals(clave, "V")){
            puntosVerdadero += 1;
        }else{
            puntosFalso +=1;
        }
        System.out.println("¿Tiene cambios de humor?");
        System.out.println("V    F");
        clave = tyu.nextLine();
        if (Objects.equals(clave, "V")){
            puntosVerdadero += 1;
        }else{
            puntosFalso +=1;
        }
        System.out.println("¿Evita contestar llamadas delante de ti?");
        System.out.println("V    F");
        clave = tyu.nextLine();
        if (Objects.equals(clave, "V")){
            puntosVerdadero += 1;
        }else{
            puntosFalso +=1;
        }
        System.out.println("¿No se separa del teléfono móvil?");
        System.out.println("V    F");
        clave = tyu.nextLine();
        if (Objects.equals(clave, "V")){
            puntosVerdadero += 1;
        }else{
            puntosFalso +=1;
        }
        System.out.println("¿Se preocupa mucho más por su apariencia física?");
        System.out.println("V    F");
        clave = tyu.nextLine();
        if (Objects.equals(clave, "V")){
            puntosVerdadero += 1;
        }else{
            puntosFalso +=1;
        }
        System.out.println("¿No tiene ganas de hacer planes juntos?");
        System.out.println("V    F");
        clave = tyu.nextLine();
        if (Objects.equals(clave, "V")){
            puntosVerdadero += 1;
        }else{
            puntosFalso +=1;
        }
        System.out.println("¿Evita las conversaciones sobre vuestro futuro?");
        System.out.println("V    F");
        clave = tyu.nextLine();
        if (Objects.equals(clave, "V")){
            puntosVerdadero += 1;
        }else{
            puntosFalso +=1;
        }
        System.out.println("¿Está más distante?");
        System.out.println("V    F");
        clave = tyu.nextLine();
        if (Objects.equals(clave, "V")){
            puntosVerdadero += 1;
        }else{
            puntosFalso +=1;
        }
        System.out.println("¿Se ducha cuando llega a casa?");
        System.out.println("V    F");
        clave = tyu.nextLine();
        if (Objects.equals(clave, "V")){
            puntosVerdadero += 1;
        }else{
            puntosFalso +=1;
        }
        if(puntosVerdadero==10){
            System.out.println("El porcentaje de INFIDELIDAD: 100%");
        }else if(puntosVerdadero==9){
            System.out.println("El porcentaje de INFIDELIDAD: 90%");
        }else if(puntosVerdadero==8){
            System.out.println("El porcentaje de INFIDELIDAD: 80%");
        }else if(puntosVerdadero==7){
            System.out.println("El porcentaje de INFIDELIDAD: 70%");
        }else if(puntosVerdadero==6){
            System.out.println("El porcentaje de INFIDELIDAD: 60%");
        }else if(puntosVerdadero==5){
            System.out.println("El porcentaje de INFIDELIDAD: 50%");
        }else if(puntosVerdadero==4){
            System.out.println("El porcentaje de INFIDELIDAD: 40%");
        }else if(puntosVerdadero==3){
            System.out.println("El porcentaje de INFIDELIDAD: 30%");
        }else if(puntosVerdadero==2){
            System.out.println("El porcentaje de INFIDELIDAD: 20%");
        }else if(puntosVerdadero==1){
            System.out.println("El porcentaje de INFIDELIDAD: 10%");
        }else if(puntosVerdadero==0){
            System.out.println("El porcentaje de INFIDELIDAD: 00%");
        }
    }
}
