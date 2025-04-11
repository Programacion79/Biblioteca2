package com.cesde.biblioteca.Modelo;

import jakarta.persistence.*;


@Entity
// 2 paso .... para cear la tabla prestamo
@Table(name = "libro")
public class Libro {
    //3 paso....atributos
    @Id
    @Column(name = "codlibro",nullable = false)
    private Integer Codprestamo;
}
