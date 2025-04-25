package com.cesde.biblioteca.Controlador;


import com.cesde.biblioteca.Modelo.Usuario;
import com.cesde.biblioteca.Servicios.Usuarioservicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuarios")
public class ControladorUsuario {
    //Inyectar los servicios
    @Autowired
    Usuarioservicio usuarioservicio;

    public ResponseEntity<?>gurdarUsuario(@ResponseBody Usuario datosnuevos)throws Exception{
        try {
           return ResponseEntity
                    .status(HttpStatus.CREATED)
                    .body(this.usuarioservicio.guardarusuario(datosnuevos));
        }catch (Exception error){
           return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(error.getMessage());
        }
    }
}
