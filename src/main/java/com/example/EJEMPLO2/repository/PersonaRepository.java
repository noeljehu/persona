package com.example.EJEMPLO2.repository;

import com.example.EJEMPLO2.entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonaRepository extends JpaRepository<Persona, Long> {
    // Aquí puedes agregar consultas personalizadas si es necesario
}