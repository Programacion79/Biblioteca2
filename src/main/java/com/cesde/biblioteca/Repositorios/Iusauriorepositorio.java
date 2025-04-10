package com.cesde.biblioteca.Repositorios;

import com.cesde.biblioteca.Modelo.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface Iusauriorepositorio extends JpaRepository<Usuario,String> {
}
