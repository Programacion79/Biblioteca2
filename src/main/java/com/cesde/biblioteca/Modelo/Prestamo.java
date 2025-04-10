package com.cesde.biblioteca.Modelo;

import jakarta.persistence.*;

import java.time.LocalDate;

//1 paso ....seleccion de libreria
@Entity
// 2 paso .... para cear la tabla prestamo
@Table(name = "prestamo")

public class Prestamo {
    //3 paso....atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codprestamo",length = 15,nullable = false)
    private Integer Codprestamo;

    @Column(name = "fecha",nullable = false)
    private LocalDate Fecha;

    @Column(name = "idusuario",length = 15,nullable = false)
    private String Idusuario;

    @Column(name = "activo",length = 2,nullable = false)
    private String Activo;

// 4 paso generar constructor
    public Prestamo() {
    }

    public Prestamo(Integer codprestamo, LocalDate fecha, String idusuario, String activo) {
        Codprestamo = codprestamo;
        Fecha = fecha;
        Idusuario = idusuario;
        Activo = activo;
    }
    // 5 paso ..... generar getthers and setters

    public Integer getCodprestamo() {
        return Codprestamo;
    }

    public void setCodprestamo(Integer codprestamo) {
        Codprestamo = codprestamo;
    }

    public LocalDate getFecha() {
        return Fecha;
    }

    public void setFecha(LocalDate fecha) {
        Fecha = fecha;
    }

    public String getIdusuario() {
        return Idusuario;
    }

    public void setIdusuario(String idusuario) {
        Idusuario = idusuario;
    }

    public String getActivo() {
        return Activo;
    }

    public void setActivo(String activo) {
        Activo = activo;
    }
}
