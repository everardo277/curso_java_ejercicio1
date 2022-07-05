package com.ejercicios;

/**
 * @
 * @author Rene Everardo Contreras Arias
 */

public class EjercicioTemaUno {

    public static void main(String[] args) {
        // tipos de datos primitivos
        byte numeroCorto = 1;
        short numeroCorto2 = 10;
        int numero = 455;
        long numeroGrande = 1257057;
        float numeroDecimal = 77.55f;
        double numeroDecimal2 = 52.755097d;
        char letra = 'E';
        boolean verdadero = true;
        boolean falso = false;


        String texto = "aprendo El lenguaje de programación Java";

        // tipo de dato envoltorio
        Integer num = 85047;
        Long num2 = null;

        System.out.println("Tipos de datos");

        System.out.println("numero corto = " + numeroCorto);
        System.out.println("numero Corto dos  = " + numeroCorto2);
        System.out.println("numero entero = " + numero);
        System.out.println("numero grande = " + numeroGrande);
        System.out.println("numero decimal = " + numeroDecimal);
        System.out.println("numero decimal dos = " + numeroDecimal2);
        System.out.println("letra : = " + letra);
        System.out.println("verdadero es  = " + verdadero);
        System.out.println("falso es  = " + falso);
        System.out.println("Yo soy estudiante y  " + texto);
        System.out.println("num es un integer = " + num);
        System.out.println("num2 es un long de tipo envoltorio por lo que puede  aceptar un   " + num2);

    }
}
