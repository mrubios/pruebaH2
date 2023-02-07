package org.iesch.ad.pruebaH2.modelo;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    String nombre;
    String apellido;

}
