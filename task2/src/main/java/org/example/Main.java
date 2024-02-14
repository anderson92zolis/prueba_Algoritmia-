package org.example;

import org.example.utils.LeerPersona;

public class Main {
    public static void main(String[] args) {

        // Leer personas desde el archivo JSON

        Persona[] personas = LeerPersona.leerPersonasDesdeJSON("task2/src/main/java/org/example/utils/personas.json");

        // Imprime el resultado

        mostrarResultados(personas);

    }

    public static void mostrarResultados(Persona[] personas) {

        int totalPersonas = personas.length;

        int mayEdad = 0;
        int menorEdad = 0;
        int homMayores = 0;
        int mujMenores = 0;
        int totalMujeres = 0;

        for (Persona persona : personas) {

            if (persona.getEdad() >= 18) {
                mayEdad++;
                if (persona.getSexo() == 'M') {
                    homMayores++;
                }
            } else {
                menorEdad++;
                if (persona.getSexo() == 'F') {
                    mujMenores++;
                }
            }
            if (persona.getSexo() == 'F') {
                totalMujeres++;
            }
        }

        double porcentajeMayores = (double) mayEdad / totalPersonas * 100;
        double porcentajeMujeres = (double) totalMujeres / totalPersonas * 100;

        System.out.println("a. Cantidad de personas mayores de edad (18 años o más): " + mayEdad +
                "\nb. Cantidad de personas menores de edad: " + menorEdad +
                "\nc. Cantidad de personas masculinas mayores de edad: " + homMayores +
                "\nd. Cantidad de personas femeninas menores de edad: " + mujMenores +
                "\ne. Porcentaje que representan las personas mayores de edad respecto al total de personas: " + porcentajeMayores + "%" +
                "\nf. Porcentaje que representan las mujeres respecto al total de personas: " + porcentajeMujeres + "%");
    }
}