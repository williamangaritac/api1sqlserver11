package com.api1sqlserver11.api1sqlserver11.Repositorio;

import com.api1sqlserver11.api1sqlserver11.Modelo.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends JpaRepository<Persona, Integer> {

    // Aquí puedes definir consultas personalizadas si las necesitas

}
