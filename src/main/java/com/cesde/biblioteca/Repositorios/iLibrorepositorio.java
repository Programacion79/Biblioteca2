package com.cesde.biblioteca.Repositorios;

import com.cesde.biblioteca.Modelo.Libro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface iLibrorepositorio  extends JpaRepository <Libro,Integer>{

}
