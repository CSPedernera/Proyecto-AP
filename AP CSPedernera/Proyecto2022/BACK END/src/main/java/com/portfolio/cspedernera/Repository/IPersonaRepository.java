package com.portfolio.cspedernera.Repository;

import com.portfolio.cspedernera.Entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersonaRepository extends JpaRepository <Persona, Long>{
    
}
