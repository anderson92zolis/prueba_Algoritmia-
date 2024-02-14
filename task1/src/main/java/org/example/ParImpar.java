package org.example;

public class ParImpar {
    private int numero;

    public ParImpar(int numero) {
        this.numero = numero;
    }


    public void determinarParesImpares() {
        if (numero % 2 == 0) {
            System.out.println("El número es PAR.");
            escribirParesDescendientes();
        } else {
            System.out.println("El número es IMPAR.");
            escribirImparesDescendientes();
        }
    }

    public void escribirParesDescendientes() {
        System.out.println("Números PARES descendientes desde " + numero + " hasta 0:");
        for (int i = numero; i >= 0; i -= 2) {
            System.out.println(i);
        }
    }

    public void escribirImparesDescendientes() {
        System.out.println("Números IMPARES descendientes desde " + numero + " hasta 1:");
        for (int i = numero; i >= 1; i -= 2) {
            System.out.println(i);
        }
    }


}
