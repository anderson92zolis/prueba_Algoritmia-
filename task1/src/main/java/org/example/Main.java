package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Utilice la instrucción LEER NUMERO al inicio del programa para cargar un número en la variable NUMERO
        int numero = leerNumero();

        ParImpar parImpar= new ParImpar(numero);

        parImpar.determinarParesImpares();

    }

    public static int leerNumero() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca un número:");
        int askNumber = scanner.nextInt();
        return askNumber;
    }
}