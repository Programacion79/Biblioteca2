package com.cesde.biblioteca.Servicios;
import com.cesde.biblioteca.Modelo.Prestamo;
import com.cesde.biblioteca.Repositorios.Iprestamorepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class Prestamoservicio {
    @Autowired
    Iprestamorepositorio iprestamorepositorio;

    public Prestamo guardarPrestamo (Prestamo datosguardar) throws  Exception{
        try{
          return   this.iprestamorepositorio.save(datosguardar);
        }catch (Exception error){
            throw  new Exception(error.getMessage());
        }
    }



public List<Prestamo> consultaGeneral () throws  Exception{
    try{
        return  this.ConsultaGeneral();
    }catch (Exception error){
        throw new Exception(error.getMessage());
    }
}


public Prestamo ConsultaIndividualId (Integer Codprestamo) throws  Exception{
    try{
        optional<Prestamo> prestamoEncontrado=this.iprestamorepositorio.findById(Codprestamo);
        if (prestamoEncontrado.isPresent())
            return prestamoEncontrado.get();
        else
            throw  new Exception("Prestamo no registrado");
    }catch (Exception error){
        throw new Exception(Error.getMessage)

    }
}


public Boolean eliminar ( String Codprestamo) throws  Exception{
    try{
        Optional<Prestamo> prestamoEncontrado=this.iprestamorepositorio.findById(Codprestamo);
        if(prestamoEncontrado.isPresent()){
            this.iprestamorepositorio.deleteById(Codprestamo);
            return true
        }else new Exception("Prestamo no registrado");
    }

    }catch (Exception error){
        throw new Exception(error.getMessage());
    }




public Prestamo guardarPrestamo (Prestamo datosguardar) throws  Exception{
    try{

    }catch (Exception error){

    }
}


