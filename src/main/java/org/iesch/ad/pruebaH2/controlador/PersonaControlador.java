package org.iesch.ad.pruebaH2.controlador;

import org.iesch.ad.pruebaH2.modelo.Persona;
import org.iesch.ad.pruebaH2.repositorio.PersonaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PersonaControlador {
    @Autowired
    PersonaRepositorio personaRepositorio;

    @GetMapping("api/persona")
    public ResponseEntity<?> obtenerTodas(){
        List<Persona> resultado = personaRepositorio.findAll();
        if (resultado.isEmpty()) return ResponseEntity.notFound().build();
        else return ResponseEntity.ok(resultado);
    }
}
