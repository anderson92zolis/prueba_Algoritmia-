package org.example;

public class ParImpar {
    private int numero;

    public ParImpar(int numero) {
        this.numero = numero;
    }


    public void escribirParesDescendientes() {
        System.out.println("Pares descendientes desde " + numero + " hasta 0:");
        for (int i = numero; i >= 0; i -= 2) {
            System.out.println(i);
        }
    }

    public void escribirImparesDescendientes() {
        System.out.println("Impares descendientes desde " + numero + " hasta 1:");
        for (int i = numero; i >= 1; i -= 2) {
            System.out.println(i);
        }
    }

    public void determinarParesImpares() {
        if (numero % 2 == 0) {
            System.out.println("El número es par.");
            escribirParesDescendientes();
        } else {
            System.out.println("El número es impar.");
            escribirImparesDescendientes();
        }
    }
}
