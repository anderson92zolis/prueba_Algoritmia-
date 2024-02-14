package org.example;

public class Persona {
    private int edad;
    private char sexo;

    public Persona(char sexo, int edad ) {
        this.edad = edad;
        this.sexo = sexo;
    }

    public Persona(){};

    public int getEdad() {
        return edad;
    }

    public char getSexo() {
        return sexo;
    }


}
