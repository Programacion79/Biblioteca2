package com.cesde.biblioteca.Repositorios;

import com.cesde.biblioteca.Modelo.Prestamo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Iprestamorepositorio extends JpaRepository<Prestamo,Integer> {
}
