package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int horasTrabajadas = preguntaDatosNumericos("Por favor, ingrese el TOTAL de horas trabajadas durante la semana: ");

        int tarifa= preguntaDatosNumericos("Por favor, Ingrese la tarifa por hora: ");

        System.out.println("El SUELDO mensual que le corresponde es de:  " + calculoSalarioSemanal(horasTrabajadas,tarifa) + "€");

    }

    public static int calculoSalarioSemanal(int horasTrabajadas, int tarifa){

        int sueldoSemanal;

        int horasExtras= horasTrabajadas-40;

        if (horasTrabajadas <= 40) {

            sueldoSemanal = tarifa * horasTrabajadas;

        } else {

            sueldoSemanal = (int) ((40 * tarifa) + (horasExtras* (tarifa * 1.5)));

        }
        return sueldoSemanal;
    }


    public static int preguntaDatosNumericos(String mensaje) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(mensaje);
        int numero = scanner.nextInt();
        return numero;
    }

}
