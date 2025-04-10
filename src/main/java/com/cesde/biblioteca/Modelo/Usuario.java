package com.cesde.biblioteca.Modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/* 1 paso ...... se escoje la libreria agregando primero la @ */
@Entity
//seleciona Table para realizar tabla en usuario
@Table(name = "usuario")

public class Usuario {

    // Atributos
    @Id         // se genera @id .... para la llave primaria en este caso seria en idusuario
    @Column(name = "idusuario",length = 15,nullable = false)
    private String Idusuario;

    @Column(name = "nombre",length = 70,nullable = false)
    private String Nombre;

    @Column(name = "direccion",length = 50,nullable = false)
    private String Direccion;

    @Column(name = "celular",length = 10,nullable = false)
    private String Celular;

    @Column(name = "activo",length = 2,nullable = false)
    private String Activo;


// paso 2..... constructor se genera uno vacio y otro con todas los atributos
    public Usuario() {
    }
    public Usuario(String idusuario, String nombre, String direccion, String celular, String activo) {
        Idusuario = idusuario;
        Nombre = nombre;
        Direccion = direccion;
        Celular = celular;
        Activo = activo;
    }

    // paso 3 ..... encapsulamiento de atributos o getthers and setters
    public String getIdusuario() {
        return Idusuario;
    }

    public void setIdusuario(String idusuario) {
        Idusuario = idusuario;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion;
    }

    public String getCelular() {
        return Celular;
    }

    public void setCelular(String celular) {
        Celular = celular;
    }

    public String getActivo() {
        return Activo;
    }

    public void setActivo(String activo) {
        Activo = activo;
    }
}
