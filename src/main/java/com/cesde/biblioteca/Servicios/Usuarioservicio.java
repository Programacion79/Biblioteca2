package com.cesde.biblioteca.Servicios;

import com.cesde.biblioteca.Modelo.Usuario;
import com.cesde.biblioteca.Repositorios.Iusauriorepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class Usuarioservicio {

    //Inyectar la capa de repositorio
    @Autowired
    Iusauriorepositorio iusauriorepositorio;
    //Adicionar un usuario
    public Usuario guardarusuario(Usuario datosguardar) throws Exception{
        try{
           return this.iusauriorepositorio.save(datosguardar) ;
        }catch (Exception error){
            throw new Exception(error.getMessage());
        }
    }

    //Consulta general
    public List<Usuario>consultageneral()throws  Exception {
        try {
            return this.iusauriorepositorio.findAll();
        } catch (Exception error) {
            throw new Exception(error.getMessage());
        }
    }
    //Consulta individual
    public Usuario consultaindividualId(String idUsuario)throws  Exception {
        try {
            Optional<Usuario> usuarioencontrado = this.iusauriorepositorio.findById(idUsuario);
            if (usuarioencontrado.isPresent()){
                return usuarioencontrado.get();
            }else
                throw  new Exception("usuario no registrado");


        } catch (Exception error) {
            throw new Exception(error.getMessage());
        }
    }
    //Modificar registro usuario
    public Usuario modificarusuario(String idUsuario, Usuario datosnuevousuario)throws  Exception{
        try{
            Optional<Usuario>usuarioencontrado = this.iusauriorepositorio.findById(idUsuario);
            if(usuarioencontrado.isPresent()){
                return usuarioencontrado.get();
            }else
                throw new Exception("Usuario no resgistrado");

        }catch (Exception error){
            throw new Exception(error.getMessage());
        }

    }

    //Eliminar un usuario
    public Boolean eliminarusuario(String idUsuario)throws  Exception{
        try {
            Optional<Usuario>usuarioencontrado = this.iusauriorepositorio.findById(idUsuario);
            if(usuarioencontrado.isPresent()){
                iusauriorepositorio.deleteById(idUsuario);
                return true;
            }else
                throw new Exception("Usuario no se puede borrar por que mo esta registrado");

        }catch (Exception error){
            throw new Exception(error.getMessage());
        }
    }

}
