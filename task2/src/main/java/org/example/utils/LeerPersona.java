package org.example.utils;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.Persona;

import java.io.File;
import java.io.IOException;

public class LeerPersona {
    public static Persona[] leerPersonasDesdeJSON(String fileJSON) {
        ObjectMapper objectMapper = new ObjectMapper();
        Persona[] personas = null;
        try {

            personas = objectMapper.readValue(new File(fileJSON), Persona[].class);

        } catch (IOException e) {
            e.printStackTrace();
        }
        return personas;
    }

}